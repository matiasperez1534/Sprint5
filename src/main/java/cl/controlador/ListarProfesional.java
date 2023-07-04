package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.servicios.ServicioProfesional;

@WebServlet("/listarprofesional")
public class ListarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServicioProfesional sp = new ServicioProfesional();

	public ListarProfesional() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("profesional", sp.findAll());
		getServletContext().getRequestDispatcher("/views/listarprofesional.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
