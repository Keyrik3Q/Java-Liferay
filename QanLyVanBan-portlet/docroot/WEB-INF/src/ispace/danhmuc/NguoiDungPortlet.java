package ispace.danhmuc;

import ispace.model.LoaiVanBan;
import ispace.model.NguoiDung;
import ispace.model.impl.LoaiVanBanImpl;
import ispace.model.impl.NguoiDungImpl;
import ispace.service.LoaiVanBanLocalServiceUtil;
import ispace.service.NguoiDungLocalServiceUtil;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class NguoiDungPortlet extends MVCPortlet {

	public void vanBan(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = NguoiDungLocalServiceUtil.getNguoiDungsCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "ten", "");
		String nguoiKy = ParamUtil.get(req, "nguoiKy", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("Ten").like("%"+ten+"%"));
		}
		if(!nguoiKy.equals("")){
			q.add(PropertyFactoryUtil.forName("NguoiKy").like("%"+nguoiKy+"%"));
		}
		List<NguoiDung> data = NguoiDungLocalServiceUtil.dynamicQuery(q);
		
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/nguoidung/view.jsp");
	}
	
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			NguoiDung nguoiDung = NguoiDungLocalServiceUtil.getNguoiDung(id);
			req.setAttribute("nguoiDung", nguoiDung);
		}else if(id==0){
			NguoiDung nguoiDung = new NguoiDungImpl();
			req.setAttribute("nguoiDung", nguoiDung);
		}
		res.setRenderParameter("jspPage", "/html/nguoidung/input.jsp");
	}
	
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			NguoiDung loaiVanBan = NguoiDungLocalServiceUtil.getNguoiDung(id);
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			NguoiDungLocalServiceUtil.updateNguoiDung(loaiVanBan);
		}else if(id==0){
			NguoiDung nguoiDung = new NguoiDungImpl();
			nguoiDung.setId(CounterLocalServiceUtil.increment("nguoiDung"));
			nguoiDung.setTen(ParamUtil.getString(req, "ten"));
			nguoiDung.setNguoiKy(ParamUtil.getString(req, "nguoiKy"));
			NguoiDungLocalServiceUtil.addNguoiDung(nguoiDung);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
	        long id = ParamUtil.getLong(req, "id");
	        NguoiDung nguoiDung = NguoiDungLocalServiceUtil.getNguoiDung(id);
	        NguoiDungLocalServiceUtil.deleteNguoiDung(nguoiDung);
	        res.setRenderParameter("jspPage", "");
	}
	
}