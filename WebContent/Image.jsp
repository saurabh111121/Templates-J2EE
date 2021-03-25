<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Image</title>
		<jsp:include page="header.jsp"></jsp:include>
		<style>
			body {
				overflow-x: hidden;
			}
		</style>
	</head>
	<header>
		<jsp:include page="navbar.jsp"></jsp:include>
	</header>

	<body>
		<br>
		<!-- Main Content Starts here  -->

		<div class="row">
			<div class="col-4"></div>
			<div class="col-4">
				<div class="jumbotron">
					<form id="imageForm" action="ImageServlet" method="POST" enctype="multipart/form-data">
						<div class="form-group">
							<input type="text" placeholder="name" class="form-control" name="name">
						</div>
						<div class="form-group">
							<div class="custom-file">
								<input type="file" class="custom-file-input" id="imageId" name="image" accept=".jpg"
									style="cursor: pointer;"> <label id="file-label" class="custom-file-label"
									for="customFile" style="cursor: pointer;">Choose photo</label>
							</div>
						</div>

						<button class="btn btn-success" id="submit_btn">Upload</button>
					</form>
				</div>

			</div>
			<div class="col-4"></div>
		</div>

	</body>
	<jsp:include page="footer.jsp"></jsp:include>
	<script>
		$(document).on(
			"click",
			"#submit_btn",
			function (e) {
				e.preventDefault();
				var formData = $("#imageForm").submit(function (e) {
					return;
				});
				var formData = new FormData(formData[0]);
				$.ajax({
					url: $('#imageForm').attr('action'),
					type: 'POST',
					data: formData,
					contentType: false,
					processData: false,
					cache: false,
					success: function (data) {
						alert(data);
					}
				});
				return false;
			});
	</script>



	</html>