package ispace.danhmuc;

import ispace.model.LoaiVanBan;
import ispace.model.SoVanBan;
import ispace.model.impl.SoVanBanImpl;
import ispace.service.LoaiVanBanLocalServiceUtil;
import ispace.service.SoVanBanLocalServiceUtil;

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


public class SoVanBanPortlet extends MVCPortlet {

	public void vanBan(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = SoVanBanLocalServiceUtil.getSoVanBansCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "ten", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SoVanBanImpl.class, PortalClassLoaderUtil.getClassLoader());
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
		res.setRenderParameter("jspPage", "/html/sovanban/view.jsp");
	}
	
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			SoVanBan soVanBan = SoVanBanLocalServiceUtil.getSoVanBan(id);
			req.setAttribute("soVanBan", soVanBan);
		}else if(id==0){
			SoVanBan soVanBan = new SoVanBanImpl();
			req.setAttribute("soVanBan", soVanBan);
		}
		res.setRenderParameter("jspPage", "/html/sovanban/input.jsp");
	}
	
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			SoVanBan soVanBan = SoVanBanLocalServiceUtil.getSoVanBan(id);
			soVanBan.setTen(ParamUtil.getString(req, "ten"));
			SoVanBanLocalServiceUtil.updateSoVanBan(soVanBan);
		}else if(id==0){
			SoVanBan soVanBan = new SoVanBanImpl();
			soVanBan.setId(CounterLocalServiceUtil.increment("soVanBan"));
			soVanBan.setTen(ParamUtil.getString(req, "ten"));
			SoVanBanLocalServiceUtil.addSoVanBan(soVanBan);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
	        long id = ParamUtil.getLong(req, "id");
	        SoVanBan soVanBan = SoVanBanLocalServiceUtil.getSoVanBan(id);
	        SoVanBanLocalServiceUtil.deleteSoVanBan(soVanBan);
	        res.setRenderParameter("jspPage", "");
	}
	
}