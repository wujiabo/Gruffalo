<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>Unauthorized</title>
</head>

<body>
	<p class="lead">${exception}.</p>
	<p>
		<a class="btn btn-lg btn-success" href="${path}/" role="button">Back</a>
	</p>
</body>
</html>