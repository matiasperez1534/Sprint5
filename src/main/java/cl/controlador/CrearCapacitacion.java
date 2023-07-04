package cl.controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modelo.dto.Capacitacion;
import cl.servicios.ServicioCapacitacion;

@WebServlet("/crearcapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServicioCapacitacion sc = new ServicioCapacitacion();

	public CrearCapacitacion() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/crearcapacitacion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String detalle = request.getParameter("detalle");
		String fecha1 = request.getParameter("fecha");
		String hora1 = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		String cantidadString = request.getParameter("cantidad");
		int cantidad = Integer.parseInt(cantidadString);

		if (nombre.isEmpty() || detalle.isEmpty()) {
			System.out.println("No puede guardar vacio");
			getServletContext().getRequestDispatcher("/views/crearcapacitacion.jsp").forward(request, response);
		} else {

			Capacitacion capacitacion = new Capacitacion();
			capacitacion.setNombre(nombre);
			capacitacion.setDetalle(detalle);
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha2 = null;
			try {
				fecha2 = formato.parse(fecha1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date fecha = new java.sql.Date(fecha2.getTime());
			capacitacion.setFecha(fecha);

			SimpleDateFormat formato1 = new SimpleDateFormat("HH:mm");
			Date hora2 = null;
			try {
				hora2 = formato1.parse(hora1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Time hora = new java.sql.Time(hora2.getTime());
			capacitacion.setHora(hora);
			capacitacion.setLugar(lugar);
			capacitacion.setDuracion(duracion);
			capacitacion.setCantidad(cantidad);
			sc.create(capacitacion);
			response.sendRedirect(request.getContextPath() + "/listarcapacitacion");
		}

	}

}
