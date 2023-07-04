package cl.implemente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.conexion.Conexion;
import cl.interfaces.IAdministrativoDAO;
import cl.modelo.dto.Administrativo;

public class AdministrativoDAO implements IAdministrativoDAO {
	@Override
	public void create(Administrativo a) {
		String sql = "insert into administrativo (run,nombre,apellido,correo,area) values ('" + a.getRun() + "','"
				+ a.getNombre() + "', '" + a.getApellido() + "', '" + a.getCorreo() + "', '" + a.getArea() + "')";
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
	public List<Administrativo> read() {
		List<Administrativo> lista = new ArrayList<Administrativo>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, area from administrativo";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Administrativo a = new Administrativo();
				a.setId(result.getInt("id"));
				a.setRun(result.getString("run"));
				a.setNombre(result.getString("nombre"));
				a.setApellido(result.getString("apellido"));
				a.setCorreo(result.getString("correo"));
				a.setArea(result.getString("area"));
				lista.add(a);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Administrativo read(int id) {
		Administrativo administrativo = null;

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, area from administrativo where id = " + id;

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				administrativo = new Administrativo(rs.getInt("id"), rs.getString("run"), rs.getString("nombre"),
						rs.getString("apellido"), rs.getString("correo"), rs.getString("area"));
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}

		return administrativo;
	}

	@Override
	public void update(Administrativo a) {
		String sql = "update administrativo set run = '" + a.getRun() + "',nombre = '" + a.getNombre() + "', apellido = '" + a.getApellido()
				+ "', correo = '" + a.getCorreo() + "', area = '" + a.getArea() + "' where id = " + a.getId();

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();

			System.out.println(sql);
			statement.execute(sql);
			System.out.println("administrativo actualizado");

		} catch (SQLException e) {
			System.out.println("Erorr en método update");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		String sql = "delete from administrativo where id = " + id;
		try {

			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);
			System.out.println("administrativo eliminado");
			

		} catch (SQLException e) {
			System.out.println("Error en método delete");
			e.printStackTrace();
		}

	}

}
