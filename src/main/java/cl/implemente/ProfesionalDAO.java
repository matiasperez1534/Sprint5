package cl.implemente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.conexion.Conexion;
import cl.interfaces.IProfesionalDAO;
import cl.modelo.dto.Profesional;

public class ProfesionalDAO implements IProfesionalDAO {
	@Override
	public void create(Profesional p) {
		String sql = "insert into profesional (run,nombre,apellido,correo,telefono,cargo) values ('" + p.getRun()
				+ "','" + p.getNombre() + "', '" + p.getApellido() + "', '" + p.getCorreo() + "', '" + p.getTelefono()
				+ "'," + " '" + p.getCargo() + "')";
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
	public List<Profesional> read() {
		List<Profesional> lista = new ArrayList<Profesional>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, telefono, cargo from profesional";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Profesional p = new Profesional();
				p.setId(result.getInt("id"));
				p.setRun(result.getString("run"));
				p.setNombre(result.getString("nombre"));
				p.setApellido(result.getString("apellido"));
				p.setCorreo(result.getString("correo"));
				p.setTelefono(result.getString("telefono"));
				p.setCargo(result.getString("cargo"));
				lista.add(p);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Profesional read(int id) {
		Profesional profesional = null;

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, telefono, cargo  from profesional where id = " + id;

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				profesional = new Profesional(rs.getInt("id"), rs.getString("run"), rs.getString("nombre"),
						rs.getString("apellido"), rs.getString("correo"), rs.getString("telefono"),
						rs.getString("cargo"));
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}

		return profesional;
	}

	@Override
	public void update(Profesional p) {
		String sql = "update profesional set run = '" + p.getRun() + "',nombre = '" + p.getNombre() + "', apellido = '" + p.getApellido()
				+ "', correo = '" + p.getCorreo() + "', telefono = '" + p.getTelefono() + "', cargo = '"
				+ p.getCargo() + "' where id = " + p.getId();

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();

			System.out.println(sql);
			statement.execute(sql);
			System.out.println("profesional actualizado");

		} catch (SQLException e) {
			System.out.println("Erorr en método update");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		String sql = "delete from profesional where id = " + id;
		try {

			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);
			System.out.println("profesional eliminado");
			

		} catch (SQLException e) {
			System.out.println("Error en método delete");
			e.printStackTrace();
		}

	}

}
