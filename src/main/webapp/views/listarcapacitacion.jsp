<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar capacitacion</title>
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
			<div style="display: none"
				class="container bg-success p-2 text-dark bg-opacity-25">
				<h1>Listado de Capacitaciones</h1>
			</div>

			<script
				src="https://cdn.jsdelivr.net/npm/jquery@3.7.0/dist/jquery.min.js"></script>
			<script
				src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
				integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
				crossorigin="anonymous"></script>

			<script>
				$(document).ready(function() {
					$('#table_capacitacion').DataTable();
				});
			</script>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<div class="container bg-success p-2 text-dark bg-opacity-25">
				<h1>Listado de Capacitaciones</h1>

				<table class="table" id="table_capacitacion">
					<thead class="table-dark">
						<tr>
							<th>Id</th>
							<th>Nombre</th>
							<th>Detalle</th>
							<th>Fecha</th>
							<th>Hora</th>
							<th>Lugar</th>
							<th>Duracion</th>
							<th>Cantidad</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="c" items="${capacitacion}">
							<tr>
								<td><c:out value="${c.getId()}"></c:out></td>
								<td><c:out value="${c.getNombre()}"></c:out></td>
								<td><c:out value="${c.getDetalle()}"></c:out></td>
								<td><d:formatDate value="${c.getFecha()}"
										pattern="dd/MM/yyyy" /></td>
								<td><d:formatDate value="${c.getHora()}" pattern="HH:mm" /></td>
								<td><c:out value="${c.getLugar()}"></c:out></td>
								<td><c:out value="${c.getDuracion()}"></c:out></td>
								<td><c:out value="${c.getCantidad()}"></c:out></td>
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
					$('#table_capacitacion').DataTable();
				});
			</script>
		</c:if>

		<jsp:include page="./footer.jsp"></jsp:include>
	</div>
</body>
</html>