<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacto</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body class="bg-info">
	<div class=container>
		<jsp:include page="./header.jsp"></jsp:include>
		<c:if test="${isLogged == 'false'}">
			<div style="display: none"
				class="container bg-success p-2 text-dark bg-opacity-25">
				<h2>Contacto</h2>
			</div>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<div class="container bg-success p-2 text-dark bg-opacity-25">
				<h2>Contacto</h2>
				<form action="contacto" method="post">
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Nombre</label>
						<input type="name" class="form-control" id="nombre" name="nombre"
							placeholder="nombre">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlInput1" class="form-label">Correo</label>
						<input type="email" class="form-control" id="correo" name="correo"
							placeholder="ejemplo@correo.com">
					</div>
					<div class="mb-3">
						<label for="exampleFormControlTextarea1" class="form-label">Mensaje</label>
						<textarea class="form-control" id="mensaje" name="mensaje"
							rows="3"></textarea>
					</div>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>
			</div>
		</c:if>
		<jsp:include page="./footer.jsp"></jsp:include>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous"></script>
</html>