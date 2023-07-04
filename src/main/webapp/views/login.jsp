<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body class="bg-info">
	<div class="container bg-success p-2 text-dark bg-opacity-25">
		<jsp:include page="./header.jsp"></jsp:include>
		<div class="container">
			<h2>Bienvenido</h2>
		</div>
		<div class="container">
			<form action="login" method="post" class="form align-self-center">
				<div class="mb-3 row">
					<label class="col-sm-2 col-form-label" for="username">Username:</label>
					<div class="col-sm-4">
						<input type="text" id="username" name="username"
							class="form-control">
					</div>
				</div>
				<div class="mb-3 row">
					<label for="password" class="col-sm-2 col-form-label">Contraseña:</label>
					<div class="col-sm-4">
						<input type="password" id="password" name="password"
							class="form-control">
					</div>
				</div>
				<div class="mb-3 row justify-content-evenly">
					<div class="col-sm-4 align-self-rigth">
						<button type="submit" class="btn btn-primary">Iniciar</button>
					</div>
				</div>
				<jsp:include page="./footer.jsp"></jsp:include>
			</form>
		</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous"></script>
</html>