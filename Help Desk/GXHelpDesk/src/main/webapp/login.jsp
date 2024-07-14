<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link href="adminstyle.css" rel="stylesheet">
<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<!-- <link rel="stylesheet" type="text/css" href="style.css">  -->
<style>
#div1 {
	width: 470px;
	height: 300px;
	margin: auto;
	margin-top: 190px;
	text-align: center;
	background-color: white;
	box-shadow: 4px 4px 4px 4px gray;
}

.card-header {
	margin-top: -33px;
	background-color: rgb(255, 85, 0);
	color: white;
	padding: 20px;
}
</style>
</head>

<body class="container-fluid">
	<div class="card" id="div1">
		<!--  <div class="container"> -->

	




		<%-- Display error message if login fails --%>


		<h2 class="card-header text-center text-light ">Login Form Form</h2>
		<form class="form" action="LoginServlet" method="post">
			<table class="table table-hover table-striped">


				<tr>
					<td>Email Id:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Register Your Self</td>
					<td><a href="register.jsp"> Create Account</a></td>

				</tr>
				<td><input type="submit" value="register"
					class="btn btn-outline-success"></td>
				<td><input type="reset" value="reset"
					class="btn btn-outline-danger"></td>

				</tr>

				



			</table>

		</form>

	</div>
</body>
</body>
</html>