package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modelo.dto.Profesional;
import cl.servicios.ServicioProfesional;

@WebServlet("/crearprofesional")
public class CrearProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServicioProfesional sp = new ServicioProfesional();

	public CrearProfesional() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strId = request.getParameter("id");
		int id = 0;
		if (strId != null) {
			id = Integer.parseInt(strId);
		}

		String op = request.getParameter("op");
		request.setAttribute("op", op);

		switch (op) {
		case "new": {
			getServletContext().getRequestDispatcher("/views/crearprofesional.jsp").forward(request, response);
			break;
		}
		case "edit": {
			if (id > 0) {
				Profesional profesional = sp.findOne(id);
				request.setAttribute("profesional", profesional);
				getServletContext().getRequestDispatcher("/views/crearprofesional.jsp").forward(request, response);
			}
			break;
		}
		case "read": {
			if (id > 0) {
				Profesional profesional = sp.findOne(id);
				request.setAttribute("profesional", profesional);
				getServletContext().getRequestDispatcher("/views/crearprofesional.jsp").forward(request, response);
			}
			break;
		}
		case "delete": {
			if (id > 0) {
				sp.delete(id);
				response.sendRedirect(request.getContextPath() + "/listarprofesional");

			}
			break;
		}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strId = request.getParameter("id");
		String run = request.getParameter("run");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String cargo = request.getParameter("cargo");

		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);
			Profesional profesional = new Profesional(id, run, nombre, apellido, correo, telefono, cargo);
			sp.update(profesional);
		} else {

			Profesional profesional = new Profesional();
			profesional.setRun(run);
			profesional.setNombre(nombre);
			profesional.setApellido(apellido);
			profesional.setCorreo(correo);
			profesional.setTelefono(telefono);
			profesional.setCargo(cargo);
			sp.create(profesional);
			System.out.println("profesional guardado");
		}
		response.sendRedirect(request.getContextPath() + "/listarprofesional");
	}

}
