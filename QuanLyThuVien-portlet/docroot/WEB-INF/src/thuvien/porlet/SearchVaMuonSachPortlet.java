package thuvien.porlet;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import thuvien.porlet.model.Sach;
import thuvien.porlet.model.TheLoai;
import thuvien.porlet.model.impl.PhieuMuonImpl;
import thuvien.porlet.model.impl.SachImpl;
import thuvien.porlet.model.impl.TheLoaiImpl;
import thuvien.porlet.service.PhieuMuonLocalServiceUtil;
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
public class SearchVaMuonSachPortlet extends MVCPortlet {
	public void thuVien(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = SachLocalServiceUtil.getSachsCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "tensach", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SachImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("TenSach").like("%"+ten+"%"));
		}
		List<Sach> data = SachLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage","/html/searchvamuonsach/view.jsp");
	}
	public void detail(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		Sach sachf = SachLocalServiceUtil.getSach(id);
		req.setAttribute("Sach", sachf);
		res.setRenderParameter("jspPage","/html/searchvamuonsach/detail.jsp");
	}
	public void muonsach(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		Sach sachf = SachLocalServiceUtil.getSach(id);
		req.setAttribute("Sach", sachf);
		res.setRenderParameter("jspPage","/html/searchvamuonsach/muonsach.jsp");
	}
	public void addby(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		thuvien.porlet.model.PhieuMuon phieuMuon = new PhieuMuonImpl();
		phieuMuon.setId(CounterLocalServiceUtil.increment("PhieuMuon"));
		phieuMuon.setUserId(ParamUtil.getString(req, "UserId"));
		phieuMuon.setSachId(ParamUtil.getLong(req, "Sach"));
		SimpleDateFormat nm = new SimpleDateFormat("yyyy-MM-dd");
		phieuMuon.setNgayMuon(ParamUtil.getDate(req,"ngaymuon", nm));
		SimpleDateFormat nt = new SimpleDateFormat("yyyy-MM-dd");
		phieuMuon.setNgayTra(ParamUtil.getDate(req,"ngaytra", nt));
		phieuMuon.setSoLuong(ParamUtil.getLong(req,"soluong"));
		PhieuMuonLocalServiceUtil.addPhieuMuon(phieuMuon);
		res.setRenderParameter("jspPage","");
	}
}
