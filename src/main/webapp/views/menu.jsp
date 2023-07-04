<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
	<div class="container-fluid">
		<a class="navbar-brand">Asesorias</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="<%=request.getContextPath()%>/">Inicio</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/contacto">Contacto</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/crearcapacitacion">Crear
						Capacitacion</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/listarcapacitacion">Listar
						Capacitacion</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/crearusuario">Crear Usuario</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/listarusuario">Listar
						Usuario</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/login">Login</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/logout">Logout</a></li>
			</ul>
		</div>
	</div>
</nav>
</html>