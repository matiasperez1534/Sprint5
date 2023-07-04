<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrativo</title>
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
				" class="form bg-success p-2 text-dark bg-opacity-25" method="POST">
				<h2>Crear Administrativo</h2>
			</form>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<form " class="form bg-success p-2 text-dark bg-opacity-25"
				action="${pageContext.request.contextPath}/crearadministrativo"
				method="POST">
				<input type="hidden" name="id" id="id"
					value="${administrativo.getId()}">
				<div class="mb-3" style="display: none">
					<label for="exampleFormControlInput1" class="form-label">ID
					</label> <input class="form-control" id="exampleFormControlInput1"
						placeholder="identificador">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Run</label>
					<c:if test="${op.equals('read')}">
						<input type="text" class="form-control" name="run" id="run"
							placeholder="1234-5" value="${administrativo.getRun()}" disabled>
					</c:if>
					<c:if test="${op.equals('edit') || op.equals('new')}">
						<input type="text" class="form-control" name="run" id="run"
							placeholder="1234-5" value="${administrativo.getRun()}">
					</c:if>
				</div>

				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Nombre</label>
					<c:if test="${op.equals('read')}">
						<input type="text" class="form-control" name="nombre" id="nombre"
							placeholder="nombre" value="${administrativo.getNombre()}"
							disabled>
					</c:if>
					<c:if test="${op.equals('edit') || op.equals('new')}">
						<input type="text" class="form-control" name="nombre" id="nombre"
							placeholder="nombre" value="${administrativo.getNombre()}">
					</c:if>
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Apellido</label>
					<c:if test="${op.equals('read')}">
						<input type="text" class="form-control" name="apellido"
							id="apellido" placeholder="apellido"
							value="${administrativo.getApellido()}" disabled>
					</c:if>
					<c:if test="${op.equals('edit') || op.equals('new')}">
						<input type="text" class="form-control" name="apellido"
							id="apellido" placeholder="apellido"
							value="${administrativo.getApellido()}">
					</c:if>
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Correo</label>
					<c:if test="${op.equals('read')}">
						<input type="email" class="form-control" name="correo" id="correo"
							placeholder="mail@algo.com" value="${administrativo.getCorreo()}"
							disabled>
					</c:if>
					<c:if test="${op.equals('edit') || op.equals('new')}">
						<input type="email" class="form-control" name="correo" id="correo"
							placeholder="mail@algo.com" value="${administrativo.getCorreo()}">
					</c:if>
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Area</label>
					<c:if test="${op.equals('read')}">
						<input type="text" class="form-control" name="area" id="area"
							placeholder="area" value="${administrativo.getArea()}" disabled>
					</c:if>
					<c:if test="${op.equals('edit') || op.equals('new')}">
						<input type="text" class="form-control" name="area" id="area"
							placeholder="area" value="${administrativo.getArea()}">
					</c:if>
				</div>
				<a href="${pageContext.request.contextPath}/listaradministrativo"
					class="btn btn-info">Volver</a>
				<c:if test="${op.equals('edit') || op.equals('new')}">
					<button type="submit" class="btn btn-primary">Guardar</button>
				</c:if>
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