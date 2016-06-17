<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>Error</title>
</head>

<body>

	<div class="jumbotron">
		<h1>Error</h1>
		<p>${exception}.</p>
		<p>
			<a class="btn btn-lg btn-primary" href="${path}/" role="button">Back
				»</a>
		</p>
	</div>
</body>
</html>