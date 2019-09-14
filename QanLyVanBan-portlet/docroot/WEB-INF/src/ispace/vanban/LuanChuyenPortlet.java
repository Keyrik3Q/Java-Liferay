package ispace.vanban;

import ispace.model.LuanChuyen;
import ispace.model.impl.LuanChuyenImpl;
import ispace.service.LuanChuyenLocalServiceUtil;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class LuanChuyenPortlet extends MVCPortlet {

	public void vanBan(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = LuanChuyenLocalServiceUtil.getLuanChuyensCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(LuanChuyenImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		List<LuanChuyen> data = LuanChuyenLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/luanchuyen/view.jsp");
	}
	
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			LuanChuyen luanChuyen = LuanChuyenLocalServiceUtil.getLuanChuyen(id);
			req.setAttribute("luanChuyen", luanChuyen);
		}else if(id==0){
			LuanChuyen luanChuyen = new LuanChuyenImpl();
			req.setAttribute("luanChuyen", luanChuyen);
		}
		res.setRenderParameter("jspPage", "/html/luanchuyen/input.jsp");
	}
	
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			LuanChuyen luanChuyen = LuanChuyenLocalServiceUtil.getLuanChuyen(id);
			luanChuyen.setKieuVanBan(ParamUtil.getString(req, "kieuVanBan"));
			luanChuyen.setIdVanBan(ParamUtil.getLong(req, "idVanBan"));
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setNgayGui(ParamUtil.getDate(req,"ngayGui", sm));
			
			SimpleDateFormat svm = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setNgayNhan(ParamUtil.getDate(req,"ngayNhan", svm));
			
			luanChuyen.setNguoiGui(ParamUtil.getString(req, "nguoiGui"));
			luanChuyen.setNguoiNhan(ParamUtil.getString(req, "nguoiNhan"));
			luanChuyen.setYKien(ParamUtil.getString(req, "yKien"));
			
			SimpleDateFormat sml = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setHanXuLi(ParamUtil.getDate(req,"hanXuLi", sml));
			luanChuyen.setYKienPhanHoi(ParamUtil.getString(req, "yKienPhanHoi"));
			
			SimpleDateFormat stv = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setNgayPhanHoi(ParamUtil.getDate(req,"ngayPhanHoi", stv));
			
			LuanChuyenLocalServiceUtil.updateLuanChuyen(luanChuyen);
		}else if(id==0){
			LuanChuyen luanChuyen = new LuanChuyenImpl();
			luanChuyen.setId(CounterLocalServiceUtil.increment("luanChuyen"));
			
			luanChuyen.setKieuVanBan(ParamUtil.getString(req, "kieuVanBan"));
			luanChuyen.setIdVanBan(ParamUtil.getLong(req, "idVanBan"));
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setNgayGui(ParamUtil.getDate(req,"ngayGui", sm));
			
			SimpleDateFormat svm = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setNgayNhan(ParamUtil.getDate(req,"ngayNhan", svm));
			
			luanChuyen.setNguoiGui(ParamUtil.getString(req, "nguoiGui"));
			luanChuyen.setNguoiNhan(ParamUtil.getString(req, "nguoiNhan"));
			luanChuyen.setYKien(ParamUtil.getString(req, "yKien"));
			
			SimpleDateFormat sml = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setHanXuLi(ParamUtil.getDate(req,"hanXuLi", sml));
			luanChuyen.setYKienPhanHoi(ParamUtil.getString(req, "yKienPhanHoi"));
			
			SimpleDateFormat stv = new SimpleDateFormat("yyyy-MM-dd");
			luanChuyen.setNgayPhanHoi(ParamUtil.getDate(req,"ngayPhanHoi", stv));
			
			LuanChuyenLocalServiceUtil.updateLuanChuyen(luanChuyen);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws SystemException, PortalException{
	        long id = ParamUtil.getLong(req, "id");
	        LuanChuyen luanChuyen = LuanChuyenLocalServiceUtil.getLuanChuyen(id);
	        LuanChuyenLocalServiceUtil.deleteLuanChuyen(luanChuyen);
	        res.setRenderParameter("jspPage", "");
	}
	
}