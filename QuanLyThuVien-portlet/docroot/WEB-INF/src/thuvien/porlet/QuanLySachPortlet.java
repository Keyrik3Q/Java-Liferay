package thuvien.porlet;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import thuvien.porlet.model.Sach;
import thuvien.porlet.model.TheLoai;
import thuvien.porlet.model.impl.SachImpl;
import thuvien.porlet.model.impl.TheLoaiImpl;
import thuvien.porlet.service.SachLocalServiceUtil;
import thuvien.porlet.service.TheLoaiLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class QuanLySachPortlet
 */
public class QuanLySachPortlet extends MVCPortlet {
	public void thuVien(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = SachLocalServiceUtil.getSachsCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "tensach", "");
		long theloais = ParamUtil.getLong(req, "theloai");
		String masach = ParamUtil.get(req, "maSach", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SachImpl.class, PortalClassLoaderUtil.getClassLoader());
		DynamicQuery p = DynamicQueryFactoryUtil.forClass(TheLoaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<TheLoai> theLoai = TheLoaiLocalServiceUtil.dynamicQuery(p);
		q.setLimit(Start, ketThuc);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("TenSach").like("%"+ten+"%"));
		}
		if(theloais!=0){
			q.add(PropertyFactoryUtil.forName("TheLoaiId").eq(theloais));
		}
		if(!masach.equals("")){
			q.add(PropertyFactoryUtil.forName("MaSach").like("%"+masach+"%"));
		}
		List<Sach> data = SachLocalServiceUtil.dynamicQuery(q);
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		req.setAttribute("theLoai", theLoai);
		req.setAttribute("maSach", masach);
		res.setRenderParameter("jspPage","/html/quanlysach/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(TheLoaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<TheLoai> data = TheLoaiLocalServiceUtil.dynamicQuery(q);
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			Sach sachf = SachLocalServiceUtil.getSach(id);
			req.setAttribute("Sach", sachf);
			req.setAttribute("data", data);
		}else if(id==0){
			Sach sachf = new SachImpl();
			req.setAttribute("Sach", sachf);
			req.setAttribute("data", data);
		}
		res.setRenderParameter("jspPage","/html/quanlysach/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			Sach sachf = SachLocalServiceUtil.getSach(id);
			sachf.setTenSach(ParamUtil.getString(req, "tensach"));
			sachf.setTheLoaiId(ParamUtil.getLong(req, "theloaiid"));
			sachf.setSoLuong(ParamUtil.getLong(req, "soluong"));
			sachf.setTrangThai(ParamUtil.getString(req, "trangthai"));
			sachf.setNhaXB(ParamUtil.getString(req, "nhaxb"));
			sachf.setMaSach(ParamUtil.getString(req, "masach"));
			sachf.setKe(ParamUtil.getString(req, "ke"));
			sachf.setTang(ParamUtil.getString(req, "tang"));
			SachLocalServiceUtil.updateSach(sachf);
		}else if(id==0){
			Sach sachf = new SachImpl();
			sachf.setId(CounterLocalServiceUtil.increment("Sach"));
			sachf.setTenSach(ParamUtil.getString(req, "tensach"));
			sachf.setTheLoaiId(ParamUtil.getLong(req, "theloaiid"));
			sachf.setSoLuong(ParamUtil.getLong(req, "soluong"));
			sachf.setTrangThai(ParamUtil.getString(req, "trangthai"));
			sachf.setNhaXB(ParamUtil.getString(req, "nhaxb"));
			sachf.setMaSach(ParamUtil.getString(req, "masach"));
			sachf.setKe(ParamUtil.getString(req, "ke"));
			sachf.setTang(ParamUtil.getString(req, "tang"));
			SachLocalServiceUtil.addSach(sachf);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		Sach sachf = SachLocalServiceUtil.getSach(id);
		SachLocalServiceUtil.deleteSach(sachf);
		res.setRenderParameter("jspPage", "");
	}
	public void detail(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		Sach sachf = SachLocalServiceUtil.getSach(id);
		req.setAttribute("Sach", sachf);
		res.setRenderParameter("jspPage","/html/quanlysach/detail.jsp");
	}
}
