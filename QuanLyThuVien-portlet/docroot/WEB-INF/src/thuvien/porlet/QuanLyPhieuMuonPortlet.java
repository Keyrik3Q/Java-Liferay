package thuvien.porlet;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import thuvien.porlet.model.PhieuMuon;
import thuvien.porlet.model.Sach;
import thuvien.porlet.model.impl.PhieuMuonImpl;
import thuvien.porlet.service.PhieuMuonLocalServiceUtil;
import thuvien.porlet.service.SachLocalServiceUtil;

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
 * Portlet implementation class QuanLyPhieuMuonPortlet
 */
public class QuanLyPhieuMuonPortlet extends MVCPortlet {
	public void thuVien(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = PhieuMuonLocalServiceUtil.getPhieuMuonsCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		String ten = ParamUtil.get(req, "", "");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(PhieuMuonImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("").like("%"+ten+"%"));
		}
		List<PhieuMuon> data = PhieuMuonLocalServiceUtil.dynamicQuery(q);
		
		req.setAttribute("tong", tong);
		req.setAttribute("cur", cur);
		req.setAttribute("delta", delta);
		req.setAttribute("start", Start);
		req.setAttribute("end", ketThuc);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage","/html/quanlyphieumuon/view.jsp");
	}
	public void delete(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req, "id");
		PhieuMuon phieuMuon = PhieuMuonLocalServiceUtil.getPhieuMuon(id);
		PhieuMuonLocalServiceUtil.deletePhieuMuon(phieuMuon);
		res.setRenderParameter("jspPage", "");
	}
}
