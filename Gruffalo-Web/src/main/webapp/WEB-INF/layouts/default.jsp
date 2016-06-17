<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="sitemesh"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="${path}/static/favicon.ico">

<title>Gruffalo-<sitemesh:title /></title>

<!-- Bootstrap core CSS -->
<link href="${path}/static/css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="${path}/static/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${path}/static/css/sticky-footer-navbar.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="${path}/static/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<sitemesh:head />
</head>

<body>

	<%@ include file="/WEB-INF/layouts/header.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-lg-12">&nbsp;</div>
		</div>
		<sitemesh:body />
		<!-- Main component for a primary marketing message or call to action -->
	</div>
	<!-- /container -->

	<%@ include file="/WEB-INF/layouts/footer.jsp"%>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="${path}/static/js/jquery.min.js"></script>
	<script src="${path}/static/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="${path}/static/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>