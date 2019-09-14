<%@page import="thuvien.porlet.service.TheLoaiLocalServiceUtil"%>
<%@page import="thuvien.porlet.model.TheLoai"%>
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


<portlet:defineObjects />
<%
	List<Sach> data = (List<Sach>)request.getAttribute("data");
	List<TheLoai> Theloai = (List<TheLoai>)request.getAttribute("theLoai");
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
	int delta = GetterUtil.getInteger(request.getAttribute("delta"));
	int tong = GetterUtil.getInteger(request.getAttribute("tong"));
%>
<liferay-portlet:actionURL var="sachURL" name="thuVien"></liferay-portlet:actionURL>
<aui:form name="frm" method="POST" action="<%=sachURL%>">
	<table>
		<tr>
			<td>
				<aui:input type="text" value="" name="tensach"></aui:input>
			</td>
			<td>
				<aui:select name="theloai">
				<%for(int i=0; i<Theloai.size(); i++){ %>
					<aui:option value="<%=Theloai.get(i).getId()%>">
						<%=Theloai.get(i).getTenTheLoai() %>
					</aui:option>
				<%}%>
				</aui:select>
			</td>
			<td>
				<aui:input type="text" value="" name="maSach"></aui:input>
			</td>
			<td>
				<aui:button type="submit" value="Search" style="margin-bottom: 11px;"></aui:button>
			</td>
		</tr>
	</table>
</aui:form>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" 
											delta="<%=delta%>" 
											emptyResultsMessage="khong tim thay" 
											deltaConfigurable="true" var="searchContainer">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=tong%>"/>	
	<liferay-ui:search-container-row className="thuvien.porlet.model.Sach"
		modelVar="item" indexVar="itemIdex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIdex)%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Sách">
		<liferay-portlet:actionURL var="detailURL" name="detail">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<a href="<%=detailURL%>"><%=item.getTenSach()%></a>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Thể Loại">
			<%=TheLoaiLocalServiceUtil.getTheLoai(item.getTheLoaiId()).getTenTheLoai()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Mã Sách">
			<%=item.getMaSach()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Chức năng">
			<liferay-portlet:actionURL var="deleteURL" name="delete">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Xoá" href="<%=deleteURL%>"></aui:button>
			<liferay-portlet:actionURL var="updateURL" name="input">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Sửa" href="<%=updateURL%>"></aui:button>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
</liferay-ui:search-container>
	<liferay-portlet:actionURL var="inputURL" name="input"></liferay-portlet:actionURL>
	<aui:button type="submit" value="thêm mới" href="<%=inputURL %>"></aui:button>