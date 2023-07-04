package cl.interfaces;

import java.util.List;

import cl.modelo.dto.Cliente;

public interface IClienteDAO {

	/**
	 * C = Create R = Read U = Update D = Delete
	 */

	public void create(Cliente c);

	public List<Cliente> read();

	public Cliente read(int id);

	public void update(Cliente c);

	public void delete(int id);
}
