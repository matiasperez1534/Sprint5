package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.servicios.ServicioUsuario;

@WebServlet("/listarusuario")
public class ListarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServicioUsuario su = new ServicioUsuario();

	public ListarUsuario() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("usuario", su.findAll());
		getServletContext().getRequestDispatcher("/views/listarusuario.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
