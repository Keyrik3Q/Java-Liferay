<%@page import="ispace.model.NguoiDung"%>
<%@page import="ispace.model.LoaiVanBan"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

	<%NguoiDung nguoiDung = (NguoiDung)request.getAttribute("nguoiDung");%>

<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=saveURL%>">
	<input type= "hidden" value="<%=nguoiDung.getId()%>" name="<portlet:namespace/>id">
	<table>
		<tr>
			<td>
				Tên:<input type= text value="<%=nguoiDung.getTen()%>" name="<portlet:namespace/>ten">
				Người Ký:<input type= text value="<%=nguoiDung.getNguoiKy()%>" name="<portlet:namespace/>nguoiKy">
				<button>LƯU</button>
			</td>
		</tr>
	</table>
</form>