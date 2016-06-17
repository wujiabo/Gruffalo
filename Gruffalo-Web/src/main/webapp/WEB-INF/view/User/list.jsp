<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>User</title>
</head>
<body>

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
				<button type="button" class="btn btn-default"
					onclick="javascript:window.location.href='${path}/user/edit'">Add</button>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">&nbsp;</div>
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
						<th>Operation</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Mark</td>
						<td>Otto</td>
						<td>@mdo</td>
						<td><div class="btn-group btn-group-xs">
								<button type="button" class="btn btn-default">Edit</button>
								<button type="button" class="btn btn-default">Delete</button>
							</div></td>
					</tr>
					<tr>
						<td>2</td>
						<td>Jacob</td>
						<td>Thornton</td>
						<td>@fat</td>
						<td><div class="btn-group btn-group-xs">
								<button type="button" class="btn btn-default">Edit</button>
								<button type="button" class="btn btn-default">Delete</button>
							</div></td>
					</tr>
					<tr>
						<td>3</td>
						<td>Larry</td>
						<td>the Bird</td>
						<td>@twitter</td>
						<td><div class="btn-group btn-group-xs">
								<button type="button" class="btn btn-default">Edit</button>
								<button type="button" class="btn btn-default">Delete</button>
							</div></td>
					</tr>
					<tr>
						<td>3</td>
						<td>Larry</td>
						<td>the Bird</td>
						<td>@twitter</td>
						<td><div class="btn-group btn-group-xs">
								<button type="button" class="btn btn-default">Edit</button>
								<button type="button" class="btn btn-default">Delete</button>
							</div></td>
					</tr>
					<tr>
						<td>3</td>
						<td>Larry</td>
						<td>the Bird</td>
						<td>@twitter</td>
						<td><div class="btn-group btn-group-xs">
								<button type="button" class="btn btn-default">Edit</button>
								<button type="button" class="btn btn-default">Delete</button>
							</div></td>
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
</body>
</html>