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
				<h1>Listado de usuarios por tipo</h1>
				<div class="container mt-4">
					<div class="form-group">
						<label for="Combobox">Seleccione tipo de usuario:</label> <select
							class="custom-select bg-secondary-subtle" id="Combobox"
							onchange="redirectToJSP()">
							<option class="bg-secondary-subtle" value="">Selecciona</option>
							<option class="bg-secondary-subtle" value="listarcliente">Lista
								Cliente</option>
							<option class="bg-secondary-subtle" value="listaradministrativo">Lista
								Administrativo</option>
							<option class="bg-secondary-subtle" value="listarprofesional">Lista
								Profesional</option>
						</select>
					</div>
				</div>


			</div>

			<script
				src="https://cdn.jsdelivr.net/npm/jquery@3.7.0/dist/jquery.min.js"></script>
			<script
				src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
				crossorigin="anonymous"></script>


		</c:if>

		<jsp:include page="./footer.jsp"></jsp:include>
	</div>
	<script>
		function redirectToJSP() {
			var comboBox = document.getElementById("Combobox");
			var selectedOption = comboBox.options[comboBox.selectedIndex].value;
			if (selectedOption !== "") {
				window.location.href = selectedOption;
			}
		}
	</script>
</body>
</html>