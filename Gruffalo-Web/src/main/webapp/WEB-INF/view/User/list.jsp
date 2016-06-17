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
<title>User</title>
<!-- Bootstrap core CSS -->
<link href="${path}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${path}/static/css/justified-nav.css" rel="stylesheet">
</head>
<body>
	<div class="container">

		<div class="masthead">
			<ul class="nav nav-justified">
				<li><a href="${path}/">Gruffalo</a></li>
				<li class="active"><a href="${path}/user/list">User</a></li>
				<li><a href="${path}/role/list">Role</a></li>
				<li><a href="${path}/permission/list">Permission</a></li>
				<li><a href="${path}/logout">Logout</a></li>
			</ul>
		</div>
		<div class="row">
			<div class="col-lg-12">
				&nbsp;
			</div>
		</div>

		<div class="row">
			<div class="col-lg-4">
				<div class="input-group">
					<span class="input-group-addon"> User Name </span> <input
						type="text" class="form-control">
				</div>
				<!-- /input-group -->
			</div>
			<div class="col-lg-4">
				<div class="input-group">
					<span class="input-group-addon"> Login Name </span> <input
						type="text" class="form-control">
				</div>
			</div>
			<div class="col-lg-4 ">
				<div class="btn-group pull-right">
					<button type="button" class="btn btn-default">Retrieve</button>
					<button type="button" class="btn btn-default">Add</button>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				&nbsp;
			</div>
		</div>

		<!-- Example row of columns -->
		<div class="row">
			<div class="col-lg-12">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>User Name</th>
							<th>Login Name</th>
							<th>Locked</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
							<td>2</td>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<td>3</td>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
						<tr>
							<td>3</td>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
						<tr>
							<td>3</td>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<div class="btn-group pull-right">
					<button type="button" class="btn btn-default">First</button>
					<button type="button" class="btn btn-default">Previous</button>
					<button type="button" class="btn btn-default">Next</button>
					<button type="button" class="btn btn-default">Last</button>
				</div>
			</div>
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