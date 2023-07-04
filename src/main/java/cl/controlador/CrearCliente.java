package cl.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modelo.dto.Cliente;
import cl.servicios.ServicioCliente;

@WebServlet("/crearcliente")
public class CrearCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServicioCliente sc = new ServicioCliente();

	public CrearCliente() {
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
			getServletContext().getRequestDispatcher("/views/crearcliente.jsp").forward(request, response);
			break;
		}
		case "edit": {
			if (id > 0) {
				Cliente cliente = sc.findOne(id);
				request.setAttribute("cliente", cliente);
				getServletContext().getRequestDispatcher("/views/crearcliente.jsp").forward(request, response);
			}
			break;
		}
		case "read": {
			if (id > 0) {
				Cliente cliente = sc.findOne(id);
				request.setAttribute("cliente", cliente);
				getServletContext().getRequestDispatcher("/views/crearcliente.jsp").forward(request, response);

			}
			break;
		}
		case "delete": {
			if (id > 0) {

				sc.delete(id);

			}
			response.sendRedirect(request.getContextPath() + "/listarcliente");
			break;
		}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strId = request.getParameter("id");
		String rut = request.getParameter("rut");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String afp = request.getParameter("afp");
		String sistema_salud = request.getParameter("sistema_salud");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		String edad1 = request.getParameter("edad");

		if (!strId.isEmpty()) {

			int id = Integer.parseInt(strId);
			int edad = Integer.parseInt(edad1);
			Cliente cliente = new Cliente(id, rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion,
					comuna, edad);
			sc.update(cliente);
		} else {

			Cliente cliente = new Cliente();
			cliente.setRut(rut);
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			cliente.setCorreo(correo);
			cliente.setTelefono(telefono);
			cliente.setAfp(afp);
			cliente.setSistema_salud(sistema_salud);
			cliente.setDireccion(direccion);
			cliente.setComuna(comuna);
			cliente.setEdad(Integer.parseInt(edad1));
			sc.create(cliente);
			System.out.println("cliente guardado");

		}
		response.sendRedirect(request.getContextPath() + "/listarcliente");
	}

}
