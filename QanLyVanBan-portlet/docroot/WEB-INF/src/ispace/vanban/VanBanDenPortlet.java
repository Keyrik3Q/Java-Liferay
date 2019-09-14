package ispace.vanban;

import ispace.model.NguoiDung;
import ispace.model.VanBanDen;
import ispace.model.impl.NguoiDungImpl;
import ispace.model.impl.VanBanDenImpl;
import ispace.service.NguoiDungLocalServiceUtil;
import ispace.service.VanBanDenLocalServiceUtil;

import java.text.SimpleDateFormat;
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


public class VanBanDenPortlet extends MVCPortlet {

	public void vanBan(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = VanBanDenLocalServiceUtil.getVanBanDensCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String LoaiVanBan = ParamUtil.get(req, "LoaiVanBan", "");
		String SoKiHieu = ParamUtil.get(req, "SoKiHieu", "");
		String SoVanBan = ParamUtil.get(req, "SoVanBan", "");
		String NguoiKy = ParamUtil.get(req, "NguoiKy", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(VanBanDenImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		if(!LoaiVanBan.equals("")){
			q.add(PropertyFactoryUtil.forName("LoaiVanBan").like("%"+LoaiVanBan+"%"));
		}
		if(!SoKiHieu.equals("")){
			q.add(PropertyFactoryUtil.forName("SoKiHieu").like("%"+SoKiHieu+"%"));
		}
		if(!SoVanBan.equals("")){
			q.add(PropertyFactoryUtil.forName("SoVanBan").like("%"+SoVanBan+"%"));
		}
		if(!NguoiKy.equals("")){
			q.add(PropertyFactoryUtil.forName("NguoiKy").like("%"+NguoiKy+"%"));
		}
		List<VanBanDen> data = VanBanDenLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/vanbanden/view.jsp");
	}
	
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(NguoiDungImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<NguoiDung> nguoiKy = NguoiDungLocalServiceUtil.dynamicQuery(q);
		if(id!=0){
			VanBanDen vanBanDen = VanBanDenLocalServiceUtil.getVanBanDen(id);
			req.setAttribute("vanBanDen", vanBanDen);
			req.setAttribute("nguoiKy", nguoiKy);
		}else if(id==0){
			VanBanDen vanBanDen = new VanBanDenImpl();
			req.setAttribute("vanBanDen", vanBanDen);
			req.setAttribute("nguoiKy", nguoiKy);
		}
		res.setRenderParameter("jspPage", "/html/vanbanden/input.jsp");
	}
	
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			VanBanDen vanBanDen = VanBanDenLocalServiceUtil.getVanBanDen(id);
			vanBanDen.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDen.setLoaiVanBan(ParamUtil.getString(req, "loaiVanBan"));
			vanBanDen.setSoVanBan(ParamUtil.getString(req, "soVanBan"));
			vanBanDen.setNguoiKy(ParamUtil.getString(req, "nguoiKy"));
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			vanBanDen.setNgayKy(ParamUtil.getDate(req,"ngayky", sm));
			VanBanDenLocalServiceUtil.updateVanBanDen(vanBanDen);
		}else if(id==0){
			VanBanDen vanBanDen = new VanBanDenImpl();
			vanBanDen.setId(CounterLocalServiceUtil.increment("vanBanDen"));
			vanBanDen.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDen.setLoaiVanBan(ParamUtil.getString(req, "loaiVanBan"));
			vanBanDen.setSoVanBan(ParamUtil.getString(req, "soVanBan"));
			vanBanDen.setNguoiKy(ParamUtil.getString(req, "nguoiKy"));
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			vanBanDen.setNgayKy(ParamUtil.getDate(req,"ngayky", sm));
			VanBanDenLocalServiceUtil.updateVanBanDen(vanBanDen);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
	        long id = ParamUtil.getLong(req, "id");
	        VanBanDen vanBanDen = VanBanDenLocalServiceUtil.getVanBanDen(id);
	        VanBanDenLocalServiceUtil.deleteVanBanDen(vanBanDen);
	        res.setRenderParameter("jspPage", "");
	}
	
}