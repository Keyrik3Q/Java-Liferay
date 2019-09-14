package thuvien.porlet;


import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import thuvien.porlet.model.TheLoai;
import thuvien.porlet.model.impl.TheLoaiImpl;
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

public class QuanLyTheLoaiPortlet extends MVCPortlet {
	public void thuVien(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = TheLoaiLocalServiceUtil.getTheLoaisCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "tentheloai", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(TheLoaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("TenTheLoai").like("%"+ten+"%"));
		}
		List<TheLoai> data = TheLoaiLocalServiceUtil.dynamicQuery(q);
		//List<chucdanh> data = chucdanhLocalServiceUtil.getchucdanhs(Start,ketThuc);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage","/html/quanlytheloai/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			TheLoai theLoai = TheLoaiLocalServiceUtil.getTheLoai(id);
			req.setAttribute("TheLoai", theLoai);
		}else if(id==0){
			TheLoai theLoai = new TheLoaiImpl();
			req.setAttribute("TheLoai", theLoai);
		}
		res.setRenderParameter("jspPage","/html/quanlytheloai/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req, "id");
		if(id!=0){
			TheLoai theLoai = TheLoaiLocalServiceUtil.getTheLoai(id);
			theLoai.setTenTheLoai(ParamUtil.getString(req, "tentheloai"));
			TheLoaiLocalServiceUtil.updateTheLoai(theLoai);
		}else if(id==0){
			TheLoai theLoai = new TheLoaiImpl();
			theLoai.setId(CounterLocalServiceUtil.increment("TheLoai"));
			theLoai.setTenTheLoai(ParamUtil.getString(req, "tentheloai"));
			TheLoaiLocalServiceUtil.addTheLoai(theLoai);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		TheLoai theLoai = TheLoaiLocalServiceUtil.getTheLoai(id);
		TheLoaiLocalServiceUtil.deleteTheLoai(theLoai);
		res.setRenderParameter("jspPage", "");
	}
}
