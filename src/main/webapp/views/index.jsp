<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenidos</title>
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
			<div style="display: none" class="container">
				<h2>Bienvenido a Asesorias</h2>



				<jsp:include page="./footer.jsp"></jsp:include>
			</div>
		</c:if>
		<c:if test="${isLogged == 'true'}">
			<div class="container">
				<h2>Bienvenido a Asesorias</h2>
				<div class="bg-image"
					style="background-image: url('https://cdn.papershift.com/20220915131922/Riesgos-laborales-y-la-salud-en-el-trabajo.jpeg'); height: 100vh"></div>
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