package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.servicios.ServicioCapacitacion;

@WebServlet("/listarcapacitacion")
public class ListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServicioCapacitacion sc = new ServicioCapacitacion();

	public ListarCapacitacion() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("capacitacion", sc.findAll());
		

		getServletContext().getRequestDispatcher("/views/listarcapacitacion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
