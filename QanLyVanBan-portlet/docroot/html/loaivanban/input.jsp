<%@page import="ispace.model.LoaiVanBan"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

	<%LoaiVanBan Loaivanban = (LoaiVanBan)request.getAttribute("loaiVanBan");%>

<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=saveURL%>">
	<input type= "hidden" value="<%=Loaivanban.getId()%>" name="<portlet:namespace/>id">
	<table>
		<tr>
			<td>
				Tên:<input type= text value="<%=Loaivanban.getTen()%>" name="<portlet:namespace/>ten">
				<button>LƯU</button>
			</td>
		</tr>
	</table>
</form>