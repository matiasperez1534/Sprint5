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
				<h1>Listado Administrativos</h1>

				<table class="table" id="table_administrativo">
					<thead class="table-dark">
						<tr>
							<th>Id</th>
							<th>Run</th>
							<th>Nombre</th>
							<th>Apellido</th>
							<th>Correo</th>
							<th>Area</th>
							<th>Opciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="a" items="${administrativo}">
							<tr>
								<td><c:out value="${a.getId()}"></c:out></td>
								<td><c:out value="${a.getRun()}"></c:out></td>
								<td><c:out value="${a.getNombre()}"></c:out></td>
								<td><c:out value="${a.getApellido()}"></c:out></td>
								<td><c:out value="${a.getCorreo()}"></c:out></td>
								<td><c:out value="${a.getArea()}"></c:out></td>
								<td><a
									href="${pageContext.request.contextPath}/crearadministrativo?id=${a.getId()}&op=read"><i
										class="fa-solid fa-eye"></i></a> <a
									href="${pageContext.request.contextPath}/crearadministrativo?id=${a.getId()}&op=edit"><i
										class="fa-solid fa-pen-to-square"></i></a> <a
									href="${pageContext.request.contextPath}/crearadministrativo?id=${a.getId()}&op=delete"><i
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
					$('#table_administrativo').DataTable();
				});
			</script>
		</c:if>

		<jsp:include page="./footer.jsp"></jsp:include>
	</div>
</body>
</html>