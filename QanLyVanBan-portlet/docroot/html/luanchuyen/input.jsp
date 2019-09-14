<%@page import="ispace.model.LuanChuyen"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

	<%LuanChuyen luanChuyen = (LuanChuyen)request.getAttribute("luanChuyen");%>

<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=saveURL%>">
	<input type= "hidden" value="<%=luanChuyen.getId()%>" name="<portlet:namespace/>id">
	<table>
		<tr>
			<td>
				Kiểu Văn Bản:<input type= text value="<%=luanChuyen.getKieuVanBan()%>" name="<portlet:namespace/>kieuVanBan">
				ID Văn Bản:<input type= text value="<%=luanChuyen.getIdVanBan()%>" name="<portlet:namespace/>idVanBan">
				Ngày Gửi:<input type= "date" value="<%=luanChuyen.getNgayGui()%>" name="<portlet:namespace/>ngayGui">
				Ngày Nhận:<input type= "date" value="<%=luanChuyen.getNgayNhan()%>" name="<portlet:namespace/>ngayNhan">
				Người gửi:<input type= text value="<%=luanChuyen.getNguoiGui()%>" name="<portlet:namespace/>nguoiGui">
				Người Nhận:<input type= text value="<%=luanChuyen.getNguoiNhan()%>" name="<portlet:namespace/>nguoiNhan">
				Ý Kiến:<input type= text value="<%=luanChuyen.getYKien()%>" name="<portlet:namespace/>yKien">
				Hạn Xử Lý:<input type= "date" value="<%=luanChuyen.getHanXuLi()%>" name="<portlet:namespace/>hanXuLi">
				Ý Kiến Phản Hồi:<input type= text value="<%=luanChuyen.getYKienPhanHoi()%>" name="<portlet:namespace/>yKienPhanHoi">
				Ngày Phản Hồi:<input type= "date" value="<%=luanChuyen.getNgayPhanHoi()%>" name="<portlet:namespace/>ngayPhanHoi">
				<button>LƯU</button>
			</td>
		</tr>
	</table>
</form>