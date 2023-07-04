<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Usuarios</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<script src="https://kit.fontawesome.com/81a2ed02b0.js"
	crossorigin="anonymous"></script>
</head>
<body class="bg-info">
	<div class="container">
		<jsp:include page="./header.jsp"></jsp:include>
		<c:if test="${isLogged == 'false'}">
			<div style="display: none"
				class="container bg-success p-2 text-dark bg-opacity-25">
				<h1>Listado de Usuarios</h1>
			</div>

			<script
				src="https://cdn.jsdelivr.net/npm/jquery@3.7.0/dist/jquery.min.js"></script>
			<script
				src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
				integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
				crossorigin="anonymous"></script>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<div class="container bg-success p-2 text-dark bg-opacity-25">
				<h1>Listado Profesionales</h1>

				<table class="table" id="table_profesional">
					<thead class="table-dark">
						<tr>
							<th>Id</th>
							<th>Run</th>
							<th>Nombre</th>
							<th>Apellido</th>
							<th>Correo</th>
							<th>Telefono</th>
							<th>Cargo</th>
							<th>Opciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="p" items="${profesional}">
							<tr>
								<td><c:out value="${p.getId()}"></c:out></td>
								<td><c:out value="${p.getRun()}"></c:out></td>
								<td><c:out value="${p.getNombre()}"></c:out></td>
								<td><c:out value="${p.getApellido()}"></c:out></td>
								<td><c:out value="${p.getCorreo()}"></c:out></td>
								<td><c:out value="${p.getTelefono()}"></c:out></td>
								<td><c:out value="${p.getCargo()}"></c:out></td>
								<td><a
									href="${pageContext.request.contextPath}/crearprofesional?id=${p.getId()}&op=read"><i
										class="fa-solid fa-eye"></i></a> <a
									href="${pageContext.request.contextPath}/crearprofesional?id=${p.getId()}&op=edit"><i
										class="fa-solid fa-pen-to-square"></i></a> <a
									href="${pageContext.request.contextPath}/crearprofesional?id=${p.getId()}&op=delete"><i
										class="fa-solid fa-trash"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>


			</div>

			<script
				src="https://cdn.jsdelivr.net/npm/jquery@3.7.0/dist/jquery.min.js"></script>
			<script
				src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
				crossorigin="anonymous"></script>

			<script>
				$(document).ready(function() {
					$('#table_profesional').DataTable();
				});
			</script>
		</c:if>

		<jsp:include page="./footer.jsp"></jsp:include>
	</div>
</body>
</html>