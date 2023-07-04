package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modelo.dto.Administrativo;
import cl.servicios.ServicioAdministrativo;

@WebServlet("/crearadministrativo")
public class CrearAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServicioAdministrativo sa = new ServicioAdministrativo();

	public CrearAdministrativo() {
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
			getServletContext().getRequestDispatcher("/views/crearadministrativo.jsp").forward(request, response);
			break;
		}
		case "edit": {
			if (id > 0) {
				Administrativo administrativo = sa.findOne(id);
				request.setAttribute("administrativo", administrativo);
				getServletContext().getRequestDispatcher("/views/crearadministrativo.jsp").forward(request, response);
			}
			break;
		}
		case "read": {
			if (id > 0) {
				Administrativo administrativo = sa.findOne(id);
				request.setAttribute("administrativo", administrativo);
				getServletContext().getRequestDispatcher("/views/crearadministrativo.jsp").forward(request, response);
			}
			break;
		}
		case "delete": {
			if (id > 0) {

				sa.delete(id);

			}
			response.sendRedirect(request.getContextPath() + "/listaradministrativo");
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
		String area = request.getParameter("area");

		if (!strId.isEmpty()) {

			int id = Integer.parseInt(strId);
			Administrativo administrativo = new Administrativo(id, run, nombre, apellido, correo, area);
			sa.update(administrativo);
		} else {

			Administrativo administrativo = new Administrativo();
			administrativo.setRun(run);
			administrativo.setNombre(nombre);
			administrativo.setApellido(apellido);
			administrativo.setCorreo(correo);
			administrativo.setArea(area);
			sa.create(administrativo);
			System.out.println("administrativo guardado");
		}
		response.sendRedirect(request.getContextPath() + "/listaradministrativo");
	}

}
