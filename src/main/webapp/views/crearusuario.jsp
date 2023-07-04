<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
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
				<h2>Crear Usuario</h2>
			</form>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<form " class="form bg-success p-2 text-dark bg-opacity-25"
				method="POST">
				<h2>Crear Usuario</h2>
				<div class="container mt-4">
					<div class="form-group">
						<label for="Combobox">Seleccione tipo de usuario:</label> <select
							class="custom-select bg-secondary-subtle" id="Combobox"
							onchange="redirectToJSP()">
							<option class="bg-secondary-subtle" value="">Selecciona</option>
							<option class="bg-secondary-subtle"
								value="${pageContext.request.contextPath}/crearcliente?op=new">Cliente</option>
							<option class="bg-secondary-subtle"
								value="${pageContext.request.contextPath}/crearadministrativo?op=new">Administrativo</option>
							<option class="bg-secondary-subtle"
								value="${pageContext.request.contextPath}/crearprofesional?op=new">Profesional</option>
						</select>
					</div>
				</div>
			</form>
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
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous"></script>
</html>