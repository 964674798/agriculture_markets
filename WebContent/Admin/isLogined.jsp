<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="tsu.hfq.ORM.Admin" %>
<%
	//如果没有登录就跳转到登录页面
	Admin admin = (Admin)session.getAttribute("Admin");
	if (admin ==null) {
%>
	<jsp:forward page="/Admin/adminLogin.jsp"/>
<%}%>