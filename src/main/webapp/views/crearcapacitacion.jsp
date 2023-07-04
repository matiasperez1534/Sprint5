<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crea capacitacion</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body class="bg-info">
	<div class="container">
		<jsp:include page="./header.jsp"></jsp:include>
		<c:if test="${isLogged == 'false'}">
			<form style="display: none"
				" class="form bg-success p-2 text-dark bg-opacity-25"
				action="${pageContext.request.contextPath}/crearcapacitacion"
				method="POST">
				<h2>Crear Capacitacion</h2>
			</form>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<form " class="form bg-success p-2 text-dark bg-opacity-25"
				action="${pageContext.request.contextPath}/crearcapacitacion"
				method="POST">
				<h2>Crear Capacitacion</h2>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">ID
						Capacitacion</label> <input type="hidden" class="form-control"
						id="exampleFormControlInput1" placeholder="identificador">
				</div>

				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Nombre</label>
					<input type="text" class="form-control" name="nombre" id="nombre"
						placeholder="nombre" value="${capacitacion.setNombre()}">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Detalle</label>
					<input type="text" class="form-control" name="detalle" id="detalle"
						placeholder="detalle" value="${capacitacion.setDetalle()}">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Fecha</label>
					<input type="date" class="form-control" name="fecha" id="fecha"
						placeholder="fecha" value="${capacitacion.setFecha()}">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Hora</label>
					<input type="time" class="form-control" name="hora" id="hora"
						placeholder="hora" value="${capacitacion.setHora()}">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Lugar</label>
					<input type="text" class="form-control" name="lugar" id="lugar"
						placeholder="lugar" value="${capacitacion.setlugar()}">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Duracion</label>
					<input type="text" class="form-control" name="duracion"
						id="duracion" placeholder="duracion"
						value="${capacitacion.setDuracion()}">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Cantidad</label>
					<input type="number" class="form-control" name="cantidad"
						id="cantidad" placeholder="cantidad"
						value="${capacitacion.setCantidad()}">
				</div>

				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
		</c:if>
		<jsp:include page="./footer.jsp"></jsp:include>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous"></script>
</html>