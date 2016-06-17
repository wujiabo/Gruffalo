<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>

<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Gruffalo</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">System Mgmt <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${path}/user/list">User</a></li>
						<li><a href="${path}/role/list">Role</a></li>
						<li><a href="${path}/permission/list">Permission</a></li>
						<li><a href="${path}/menu/list">Menu</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Test<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${path}/test/404">404</a></li>
						<li><a href="${path}/test/error">500</a></li>
						<li><a href="${path}/test/role">Role</a></li>
						<li><a href="${path}/test/permission">Permission</a></li>
					</ul></li>
				<li><a href="#about">About</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false"><shiro:principal property="userName" /><span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li><a href="#">About</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="${path}/logout">Logout</a></li>
					</ul></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>