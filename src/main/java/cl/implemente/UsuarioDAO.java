package cl.implemente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.conexion.Conexion;
import cl.interfaces.IUsuarioDAO;
import cl.modelo.dto.Usuario;

public class UsuarioDAO implements IUsuarioDAO {
	@Override
	public void create(Usuario u) {
		String sql = "insert into usuario (nombre,username,password) values ('" + u.getNombre() + "', '" + u.getUsername()
				+ "', '" + u.getUsername() + "')";
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
	public List<Usuario> read() {
		List<Usuario> lista = new ArrayList<Usuario>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, nombre, username, password from usuario";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Usuario u = new Usuario();
				u.setId(result.getInt("id"));
				u.setNombre(result.getString("nombre"));
				u.setUsername(result.getString("username"));
				u.setPassword(result.getString("password"));
				lista.add(u);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
