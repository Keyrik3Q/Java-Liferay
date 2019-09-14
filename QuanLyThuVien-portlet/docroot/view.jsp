<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
long plidSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlysach_WAR_QuanLyThuVienportlet");
long plidTheLoai = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlytheloai_WAR_QuanLyThuVienportlet");
long plidPhieuMuon = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlyphieumuon_WAR_QuanLyThuVienportlet");
long plidSearVaMuonSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"searchvamuonsach_WAR_QuanLyThuVienportlet");
%>
<portlet:defineObjects />

<liferay-portlet:actionURL var="sachURL" name="thuVien" portletName="quanlysach_WAR_QuanLyThuVienportlet" plid="<%=plidSach %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="theloaiURL" name="thuVien" portletName="quanlytheloai_WAR_QuanLyThuVienportlet" plid="<%=plidTheLoai %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="phieumuonURL" name="thuVien" portletName="quanlyphieumuon_WAR_QuanLyThuVienportlet" plid="<%=plidPhieuMuon %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="searchvamuonsachURL" name="thuVien" portletName="searchvamuonsach_WAR_QuanLyThuVienportlet" plid="<%=plidSearVaMuonSach %>"></liferay-portlet:actionURL>


<a href="<%=sachURL%>">Sách</a></br>
<a href="<%=theloaiURL%>">Thể Loại</a></br>
<a href="<%=phieumuonURL%>">Phiếu Mượn</a></br>
<a href="<%=searchvamuonsachURL%>">Tìm Kiếm và Mượn Sách</a>
