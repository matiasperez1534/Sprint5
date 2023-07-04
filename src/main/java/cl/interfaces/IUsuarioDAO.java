package cl.interfaces;

import java.util.List;

import cl.modelo.dto.Usuario;

public interface IUsuarioDAO {

	/**
	 * C = Create R = Read U = Update D = Delete
	 */

	public void create(Usuario u);

	public List<Usuario> read();

	public Usuario read(int id);

	public void update(Usuario u);

	public void delete(int id);
}
