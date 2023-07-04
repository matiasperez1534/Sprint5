package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.servicios.ServicioAdministrativo;

@WebServlet("/listaradministrativo")
public class ListarAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServicioAdministrativo sa = new ServicioAdministrativo();

	public ListarAdministrativo() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("administrativo", sa.findAll());
		getServletContext().getRequestDispatcher("/views/listaradministrativo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
