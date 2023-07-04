package cl.servicios;

import java.util.List;

import cl.implemente.UsuarioDAO;
import cl.modelo.dto.Usuario;

public class ServicioUsuario {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	public List<Usuario> findAll() {
		return usuarioDAO.read();
	}

	public Usuario findOne(int id) {
		return usuarioDAO.read(id);
	}

	public void update(Usuario u) {
		usuarioDAO.update(u);
	}

	public void create(Usuario u) {
		usuarioDAO.create(u);
	}

	public void delete(int id) {
		usuarioDAO.delete(id);
	}

}
