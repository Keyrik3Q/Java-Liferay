<%@page import="thuvien.porlet.service.TheLoaiLocalServiceUtil"%>
<%@page import="thuvien.porlet.model.Sach"%>
<%@page import="com.sun.mail.imap.protocol.Item"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException"%>
<%@page import="javax.portlet.filter.ActionRequestWrapper"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

<%Sach sachf = (Sach)request.getAttribute("Sach");%>
<h1 style="text-align: center">CHI TIẾT SÁCH</h1>
	<table style="background: #0000000d">
	<tr>
		<td style="color:red; width:100px">
			Tên Sách:
		</td>
		<td style="color:red; width:100px">
			Tên Thể Loại:
		</td>
		<td style="color:red; width:100px">
			Số Lượng:
		</td>
		<td style="color:red; width:100px">
			Trạng Thái:
		</td>
		<td style="color:red; width:100px">
			Nhà Xuất Bản:
		</td>
		<td style="color:red; width:100px">
			Mã Sách:
		</td>
		<td style="color:red; width:100px">
			Kệ:
		</td>
		<td style="color:red; width:100px">
			Tầng:
		</td>
	</tr>
		<tr>
			<td style="width:100px">
				<%=sachf.getTenSach() %>
			</td>
			<td style="width:100px">
				<%=TheLoaiLocalServiceUtil.getTheLoai(sachf.getTheLoaiId()).getTenTheLoai() %>
			</td>
			<td style="width:100px">
				<%=sachf.getSoLuong() %>
			</td>
			<td style="width:100px">
				<%=sachf.getTrangThai() %>
			</td>
			<td style="width:100px">
				<%=sachf.getNhaXB() %>
			</td>
			<td style="width:100px">
				<%=sachf.getMaSach() %>
			</td>
			<td style="width:100px">
				<%=sachf.getKe() %>
			</td>
			<td style="width:100px">
				<%=sachf.getTang() %>
			</td>
		</tr>
		
	</table>