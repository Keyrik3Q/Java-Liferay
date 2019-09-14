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
		<td style="color:red; width:130px">
			Tên Sách:
		</td>
		<td style="color:red; width:130px">
			Tên Thể Loại:
		</td>
		<td style="color:red; width:130px">
			Trạng Thái:
		</td>
		<td style="color:red; width:130px">
			Nhà Xuất Bản:
		</td>
		<td style="color:red; width:130px">
			Kệ:
		</td>
		<td style="color:red; width:130px">
			Tầng:
		</td>
	</tr>
		<tr>
			<td style="width:130px">
				<%=sachf.getTenSach() %>
			</td>
			<td style="width:130px">
				<%=TheLoaiLocalServiceUtil.getTheLoai(sachf.getTheLoaiId()).getTenTheLoai() %>
			</td>
			<td style="width:130px">
				<%=sachf.getTrangThai() %>
			</td>
			<td style="width:130px">
				<%=sachf.getNhaXB() %>
			</td>
			<td style="width:130px">
				<%=sachf.getKe() %>
			</td>
			<td style="width:130px">
				<%=sachf.getTang() %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-portlet:actionURL var="muonsachURL" name="muonsach">
						<liferay-portlet:param name="id" value="<%=String.valueOf(sachf.getId())%>"/>
					</liferay-portlet:actionURL>
				<aui:button type="submit" value="Mượn Sách" href="<%=muonsachURL%>"></aui:button>
			</td>
		</tr>
	</table>