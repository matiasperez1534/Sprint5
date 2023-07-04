package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.servicios.*;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServicioLogin usuarioservicio = new ServicioLogin();

	public Login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();

		if (usuarioservicio.login(username, password)) {
			session.setAttribute("isLogged", true);
			getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
		} else {
			session.setAttribute("isLogged", false);
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		}
	}

}
