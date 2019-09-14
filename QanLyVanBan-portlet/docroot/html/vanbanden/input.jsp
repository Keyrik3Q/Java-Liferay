<%@page import="ispace.model.NguoiDung"%>
<%@page import="java.util.List"%>
<%@page import="ispace.model.VanBanDen"%>
<%@page import="ispace.model.VanBanDi"%>
<%@page import="ispace.model.LoaiVanBan"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
	
	<%VanBanDen vanBanDen = (VanBanDen)request.getAttribute("vanBanDen");
	List<NguoiDung> nguoiKy = (List<NguoiDung>)request.getAttribute("nguoiKy");%>
	

<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=saveURL%>">
	<input type= "hidden" value="<%=vanBanDen.getId()%>" name="<portlet:namespace/>id">
	<table>
		<tr>
			<td>
				Số Kí Hiệu:<input type= text value="<%=vanBanDen.getSoKiHieu()%>" name="<portlet:namespace/>soKiHieu">
				<tr>
					<td>Loại Văn Bản:</td>
					<td><select name="<portlet:namespace/>loaiVanBan">
						<% for(int i=0;i<nguoiKy.size();i++) { %>
						<option value="<%=nguoiKy.get(i).getId()%>"><%=nguoiKy.get(i).getTen()%></option><% } %>
					</select></td>	
				</tr>
				Sổ Văn Bản:<input type= text value="<%=vanBanDen.getSoVanBan()%>" name="<portlet:namespace/>soVanBan">
				Người Ký:<input type= text value="<%=vanBanDen.getNguoiKy()%>" name="<portlet:namespace/>nguoiKy">
				Ngày Ký:<input type= "date" value="<%=vanBanDen.getNgayKy()%>" name="<portlet:namespace/>ngayky">
				<button>LƯU</button>
			</td>
		</tr>
	</table>
</form>