<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Image Display</title>
		<jsp:include page="header.jsp"></jsp:include>

	</head>
	<header>
		<jsp:include page="navbar.jsp"></jsp:include>
	</header>

	<body>
		<br />
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4">
				<div class="jumbotron">
					<div class="from-group text-center" id="imageDisplay">
						<img src="./Display" alt="Image from DataBase" height="200px" width="200px">
					</div>
					<br>
					

				</div>

			</div>
			<div class="col-4"></div>
		</div>


	</body>
	<jsp:include page="footer.jsp"></jsp:include>

	</html>