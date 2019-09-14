<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="javafx.scene.input.DataFormat"%>
<%@page import="thuvien.porlet.model.PhieuMuon"%>
<%@page import="thuvien.porlet.model.Sach"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

	<%
	Sach sachM = (Sach)request.getAttribute("Sach");
	PhieuMuon phieuMuon = (PhieuMuon)request.getAttribute("PhieuMuon");
	SimpleDateFormat dateFomat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	ThemeDisplay td = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	User UserId = td.getUser();
	%>

<liferay-portlet:actionURL var="addbyURL" name="addby"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=addbyURL%>">
	<aui:input type= "hidden" value="<%=UserLocalServiceUtil.getUser(UserId.getUserId()).getLastName()%>" name="UserId"></aui:input>
	<aui:input type= "hidden" value="<%=sachM.getId()%>" name="Sach"></aui:input>
	<table>
		<tr>
			<td>
				<aui:input type="Date" value="<%=dateFomat.format(date)%>" name="ngaymuon"></aui:input>
				<aui:input type="Date" value="<%=dateFomat.format(date)%>" name="ngaytra"></aui:input>
				<aui:select name="soluong">
					<%for(int i=1; i<6; i++){ %>
					<aui:option value="<%=i%>"><%=i %></aui:option>
					<%} %>
				</aui:select>
				<aui:button type="submit" value="Mượn Sách"></aui:button>
			</td>
		</tr>
	</table>
</form>