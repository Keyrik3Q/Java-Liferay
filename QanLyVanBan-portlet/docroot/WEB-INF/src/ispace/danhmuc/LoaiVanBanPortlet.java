package ispace.danhmuc;

import ispace.model.LoaiVanBan;
import ispace.model.impl.LoaiVanBanImpl;
import ispace.service.LoaiVanBanLocalServiceUtil;

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


public class LoaiVanBanPortlet extends MVCPortlet {

	public void vanBan(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = LoaiVanBanLocalServiceUtil.getLoaiVanBansCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "ten", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(LoaiVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("Ten").like("%"+ten+"%"));
		}
		List<LoaiVanBan> data = LoaiVanBanLocalServiceUtil.dynamicQuery(q);
		//List<chucdanh> data = chucdanhLocalServiceUtil.getchucdanhs(Start,ketThuc);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/loaivanban/view.jsp");
	}
	
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			LoaiVanBan loaiVanBan = LoaiVanBanLocalServiceUtil.getLoaiVanBan(id);
			req.setAttribute("loaiVanBan", loaiVanBan);
		}else if(id==0){
			LoaiVanBan loaiVanBan = new LoaiVanBanImpl();
			req.setAttribute("loaiVanBan", loaiVanBan);
		}
		res.setRenderParameter("jspPage", "/html/loaivanban/input.jsp");
	}
	
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			LoaiVanBan loaiVanBan = LoaiVanBanLocalServiceUtil.getLoaiVanBan(id);
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			LoaiVanBanLocalServiceUtil.updateLoaiVanBan(loaiVanBan);
		}else if(id==0){
			LoaiVanBan loaiVanBan = new LoaiVanBanImpl();
			loaiVanBan.setId(CounterLocalServiceUtil.increment("loaivanban"));
			loaiVanBan.setTen(ParamUtil.getString(req, "ten"));
			LoaiVanBanLocalServiceUtil.addLoaiVanBan(loaiVanBan);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
	        long id = ParamUtil.getLong(req, "id");
	        LoaiVanBan loaiVanBan = LoaiVanBanLocalServiceUtil.getLoaiVanBan(id);
	        LoaiVanBanLocalServiceUtil.deleteLoaiVanBan(loaiVanBan);
	        res.setRenderParameter("jspPage", "");
	}
	
}