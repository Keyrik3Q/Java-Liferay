<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
long plidLoaiVanBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"loaivanban_WAR_QanLyVanBanportlet");
long plidVanBanDi = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"vanbandi_WAR_QanLyVanBanportlet");
long plidVanBanDen = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"vanbanden_WAR_QanLyVanBanportlet");
long plidSoVanBan = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"sovanban_WAR_QanLyVanBanportlet");
long plidLuanChuyen = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"luanchuyen_WAR_QanLyVanBanportlet");
long plidNguoiDung = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"nguoidung_WAR_QanLyVanBanportlet");
%>
<portlet:defineObjects />

<liferay-portlet:actionURL var="LoaiVanBanURL" name="vanBan" portletName="loaivanban_WAR_QanLyVanBanportlet" plid="<%=plidLoaiVanBan %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="vanbandiURL" name="vanBan" portletName="vanbandi_WAR_QanLyVanBanportlet" plid="<%=plidVanBanDi %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="vanbandenURL" name="vanBan" portletName="vanbanden_WAR_QanLyVanBanportlet" plid="<%=plidVanBanDen %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="sovanbanURL" name="vanBan" portletName="sovanban_WAR_QanLyVanBanportlet" plid="<%=plidSoVanBan %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="luanchuyenURL" name="vanBan" portletName="luanchuyen_WAR_QanLyVanBanportlet" plid="<%=plidLuanChuyen %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="nguoidungURL" name="vanBan" portletName="nguoidung_WAR_QanLyVanBanportlet" plid="<%=plidNguoiDung %>"></liferay-portlet:actionURL>



<a href="<%=LoaiVanBanURL%>">Loại Văn Bản</a>
<a href="<%=vanbandiURL%>">Văn Bản Đi</a>
<a href="<%=vanbandenURL%>">Văn Bản Đên</a>
<a href="<%=sovanbanURL%>">Số Văn Bản</a>
<a href="<%=luanchuyenURL%>">Luân Chuyển</a>
<a href="<%=nguoidungURL%>">Người Dùng</a>