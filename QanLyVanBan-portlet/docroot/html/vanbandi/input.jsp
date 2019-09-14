<%@page import="ispace.model.VanBanDi"%>
<%@page import="ispace.model.LoaiVanBan"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

	<%VanBanDi vanBanDi = (VanBanDi)request.getAttribute("vanBanDi");%>

<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=saveURL%>">
	<input type= "hidden" value="<%=vanBanDi.getId()%>" name="<portlet:namespace/>id">
	<table>
		<tr>
			<td>
				Số Kí Hiệu:<input type= text value="<%=vanBanDi.getSoKiHieu()%>" name="<portlet:namespace/>soKiHieu">
				Loại Văn Bản:<input type= text value="<%=vanBanDi.getLoaiVanBan()%>" name="<portlet:namespace/>loaiVanBan">
				Sổ Văn Bản:<input type= text value="<%=vanBanDi.getSoVanBan()%>" name="<portlet:namespace/>soVanBan">
				Người Ký:<input type= text value="<%=vanBanDi.getNguoiKy()%>" name="<portlet:namespace/>nguoiKy">
				Ngày Ký:<input type= "date" value="<%=vanBanDi.getNgayKy()%>" name="<portlet:namespace/>ngayky">
				<button>LƯU</button>
			</td>
		</tr>
	</table>
</form>