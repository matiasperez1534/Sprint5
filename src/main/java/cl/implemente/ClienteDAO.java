package cl.implemente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.conexion.Conexion;
import cl.interfaces.IClienteDAO;
import cl.modelo.dto.Cliente;

public class ClienteDAO implements IClienteDAO {
	@Override
	public void create(Cliente c) {
		String sql = "insert into cliente (rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad) values ('"
				+ c.getRut() + "','" + c.getNombre() + "', '" + c.getApellido() + "', '" + c.getCorreo() + "', '"
				+ c.getTelefono() + "', '" + c.getAfp() + "', '" + c.getSistema_salud() + "', '" + c.getDireccion()
				+ "', '" + c.getComuna() + "', '" + c.getEdad() + "')";
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
	public List<Cliente> read() {
		List<Cliente> lista = new ArrayList<Cliente>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad from cliente";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Cliente c = new Cliente();
				c.setId(result.getInt("id"));
				c.setRut(result.getString("rut"));
				c.setNombre(result.getString("nombre"));
				c.setApellido(result.getString("apellido"));
				c.setCorreo(result.getString("correo"));
				c.setTelefono(result.getString("telefono"));
				c.setAfp(result.getString("afp"));
				c.setSistema_salud(result.getString("sistema_salud"));
				c.setDireccion(result.getString("direccion"));
				c.setComuna(result.getString("comuna"));
				c.setEdad(result.getInt("edad"));
				lista.add(c);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Cliente read(int id) {
		Cliente cliente = null;

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad from cliente where id = "
					+ id;

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				cliente = new Cliente(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"),
						rs.getString("apellido"), rs.getString("correo"), rs.getString("telefono"), rs.getString("afp"),
						rs.getString("sistema_salud"), rs.getString("direccion"), rs.getString("comuna"),
						rs.getInt("edad"));
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}

		return cliente;
	}

	@Override
	public void update(Cliente c) {
		String sql = "update cliente set rut = '" + c.getRut() + "',nombre = '" + c.getNombre() + "', apellido = '" + c.getApellido()
				+ "', correo = '" + c.getCorreo() + "', telefono = '" + c.getTelefono() + "', afp = '" + c.getAfp()
				+ "', sistema_salud = '" + c.getSistema_salud() + "', direccion = '" + c.getDireccion()
				+ "', comuna = '" + c.getComuna() + "', edad = '" + c.getEdad() + "' where id = " + c.getId();

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();

			System.out.println(sql);
			statement.execute(sql);
			System.out.println("cliente actualizado");

		} catch (SQLException e) {
			System.out.println("Erorr en método update");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		String sql = "delete from cliente where id = " + id;
		try {

			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);
			System.out.println("cliente eliminado");

		} catch (SQLException e) {
			System.out.println("Error en método delete");
			e.printStackTrace();
		}

	}

}
