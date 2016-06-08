<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="${path}/static/favicon.ico">
<title>Unauthorized</title>
<!-- Bootstrap core CSS -->
<link href="${path}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${path}/static/css/justified-nav.css" rel="stylesheet">
</head>
<body>
	<div class="container">

		<div class="masthead">
			<ul class="nav nav-justified">
				<li><a href="${path}/">Gruffalo</a></li>
				<li><a href="${path}/user/list">User</a></li>
				<li><a href="${path}/role/list">Role</a></li>
				<li><a href="${path}/permission/list">Permission</a></li>
				<li><a href="${path}/logout">Logout</a></li>
			</ul>
		</div>

		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>Unauthorized!</h1>
			<p class="lead">${exception}.</p>
			<p>
				<a class="btn btn-lg btn-success" href="${path}/" role="button">Back</a>
			</p>
		</div>

		

		<!-- Site footer -->
		<div class="footer">
			<p>&copy; Company 2014</p>
		</div>

	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>
