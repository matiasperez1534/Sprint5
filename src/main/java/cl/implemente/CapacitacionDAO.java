package cl.implemente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.conexion.Conexion;
import cl.interfaces.ICapacitacionDAO;
import cl.modelo.dto.Capacitacion;

public class CapacitacionDAO implements ICapacitacionDAO {
	@Override
	public void create(Capacitacion c) {
		String sql = "insert into capacitacion (nombre,detalle,fecha,hora,lugar,duracion,cantidad) values ('"
				+ c.getNombre() + "', '" + c.getDetalle() + "', '" + c.getFecha() + "', '" + c.getHora() + "', '"
				+ c.getLugar() + "', '" + c.getDuracion() + "', '" + c.getCantidad() + "')";
		try {

			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error en método create");
			e.printStackTrace();
		}

	}

	@Override
	public List<Capacitacion> read() {
		List<Capacitacion> lista = new ArrayList<Capacitacion>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, nombre, detalle,fecha,hora,lugar,duracion,cantidad from capacitacion";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Capacitacion c = new Capacitacion();
				c.setId(result.getInt("id"));
				c.setNombre(result.getString("nombre"));
				c.setDetalle(result.getString("detalle"));
				c.setFecha(result.getDate("fecha"));
				c.setHora(result.getTime("hora"));
				c.setLugar(result.getString("lugar"));
				c.setDuracion(result.getString("duracion"));
				c.setCantidad(result.getInt("cantidad"));
				lista.add(c);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Capacitacion read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Capacitacion c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
