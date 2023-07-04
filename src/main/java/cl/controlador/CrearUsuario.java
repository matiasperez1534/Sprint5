package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modelo.dto.Usuario;
import cl.servicios.ServicioUsuario;


@WebServlet("/crearusuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServicioUsuario su =new ServicioUsuario();   
   
    public CrearUsuario() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/views/crearusuario.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (nombre.isEmpty() || username.isEmpty() || password.isEmpty()) {
			System.out.println("No puede guardar vacio");
			getServletContext().getRequestDispatcher("/views/crearusuario.jsp").forward(request, response);
		} else {

			Usuario usuario = new Usuario();
			usuario.setNombre(nombre);
			usuario.setUsername(username);
			usuario.setPassword(password);
			su.create(usuario);
			response.sendRedirect(request.getContextPath() + "/listarusuario");
		}
	}

}
