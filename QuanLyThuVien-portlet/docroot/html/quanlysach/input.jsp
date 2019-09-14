<%@page import="thuvien.porlet.model.TheLoai"%>
<%@page import="java.util.List"%>
<%@page import="thuvien.porlet.model.Sach"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />

	<%Sach sachinput = (Sach)request.getAttribute("Sach");%>
	<%List<TheLoai> theLoai = (List<TheLoai>)request.getAttribute("data"); %>
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<form name=frm method=POST action="<%=saveURL%>">
	<input type= "hidden" value="<%=sachinput.getId()%>" name="<portlet:namespace/>id">
	<table>
		<tr>
			<td>
				<aui:input type="text" value="<%=sachinput.getTenSach()%>" name="tensach"></aui:input>
				<aui:select name="theloaiid">
				<%for(int i=0; i<theLoai.size(); i++){ %>
					<aui:option value="<%=theLoai.get(i).getId()%>">
						<%=theLoai.get(i).getTenTheLoai() %>
					</aui:option>
				<%}%>
				</aui:select>
				<aui:input type="text" value="<%=sachinput.getSoLuong()%>" name="soluong"></aui:input>
				<aui:select name="trangthai">
					<aui:option value="Mới">Mới</aui:option>
					<aui:option value="Cũ">Cũ</aui:option>
					<aui:option value="Đã Hư Hỏng">Đã Hư Hỏng</aui:option>
				</aui:select>
				<aui:input type="text" value="<%=sachinput.getNhaXB()%>" name="nhaxb"></aui:input>
				<aui:input type="text" value="<%=sachinput.getMaSach()%>" name="masach"></aui:input>
				<aui:input type="text" value="<%=sachinput.getKe()%>" name="ke"></aui:input>
				<aui:input type="text" value="<%=sachinput.getTang()%>" name="tang"></aui:input>
				<aui:button type="submit" value="Save"></aui:button>
			</td>
		</tr>
	</table>
</form>