package ispace.vanban;

import ispace.model.NguoiDung;
import ispace.model.VanBanDi;
import ispace.model.impl.NguoiDungImpl;
import ispace.model.impl.VanBanDiImpl;
import ispace.service.NguoiDungLocalServiceUtil;
import ispace.service.VanBanDiLocalServiceUtil;

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


public class VanBanDiPortlet extends MVCPortlet {

	public void vanBan(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = VanBanDiLocalServiceUtil.getVanBanDisCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String LoaiVanBan = ParamUtil.get(req, "LoaiVanBan", "");
		String SoKiHieu = ParamUtil.get(req, "SoKiHieu", "");
		String SoVanBan = ParamUtil.get(req, "SoVanBan", "");
		String NguoiKy = ParamUtil.get(req, "NguoiKy", "");
		String NgayKy = ParamUtil.get(req, "NgayKy", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(VanBanDiImpl.class, PortalClassLoaderUtil.getClassLoader());
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
		if(!NgayKy.equals("")){
			q.add(PropertyFactoryUtil.forName("NgayKy").like("%"+NgayKy+"%"));
		}
		List<VanBanDi> data = VanBanDiLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/vanbandi/view.jsp");
	}
	
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			VanBanDi vanBanDi = VanBanDiLocalServiceUtil.getVanBanDi(id);
			req.setAttribute("vanBanDi", vanBanDi);
		}else if(id==0){
			VanBanDi vanBanDi = new VanBanDiImpl();
			req.setAttribute("vanBanDi", vanBanDi);
		}
		res.setRenderParameter("jspPage", "/html/vanbandi/input.jsp");
	}
	
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			VanBanDi vanBanDi = VanBanDiLocalServiceUtil.getVanBanDi(id);
			vanBanDi.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDi.setLoaiVanBan(ParamUtil.getString(req, "loaiVanBan"));
			vanBanDi.setSoVanBan(ParamUtil.getString(req, "soVanBan"));
			vanBanDi.setNguoiKy(ParamUtil.getString(req, "nguoiKy"));
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			vanBanDi.setNgayKy(ParamUtil.getDate(req,"ngayky", sm));
			VanBanDiLocalServiceUtil.updateVanBanDi(vanBanDi);
		}else if(id==0){
			VanBanDi vanBanDi = new VanBanDiImpl();
			vanBanDi.setId(CounterLocalServiceUtil.increment("vanBanDi"));
			vanBanDi.setSoKiHieu(ParamUtil.getString(req, "soKiHieu"));
			vanBanDi.setLoaiVanBan(ParamUtil.getString(req, "loaiVanBan"));
			vanBanDi.setSoVanBan(ParamUtil.getString(req, "soVanBan"));
			vanBanDi.setNguoiKy(ParamUtil.getString(req, "nguoiKy"));
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			vanBanDi.setNgayKy(ParamUtil.getDate(req,"ngayky", sm));
			VanBanDiLocalServiceUtil.addVanBanDi(vanBanDi);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
	        long id = ParamUtil.getLong(req, "id");
	        VanBanDi vanBanDi = VanBanDiLocalServiceUtil.getVanBanDi(id);
	        VanBanDiLocalServiceUtil.deleteVanBanDi(vanBanDi);
	        res.setRenderParameter("jspPage", "");
	}
	
}