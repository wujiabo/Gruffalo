<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2><%= session.getId() %></h2>
		<h2><%= session.getAttribute("TEST_CLUSTER") %></h2>
		<h2><%= session.getAttribute("TEST_CLUSTER2") %></h2>
	</body>
</html>
