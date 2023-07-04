package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Contacto() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre =request.getParameter("nombre");
		String correo =request.getParameter("correo");
		String mensaje =request.getParameter("mensaje");
		
		System.out.println("------------------------------");
		System.out.println("nombre: "+ nombre);
		System.out.println("correo: "+ correo);
		System.out.println("mensaje: "+ mensaje);		
		System.out.println("------------------------------");
		getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
	}

}
