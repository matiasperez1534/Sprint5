package cl.interfaces;

import java.util.List;

import cl.modelo.dto.Administrativo;

public interface IAdministrativoDAO {

	/**
	 * C = Create R = Read U = Update D = Delete
	 */

	public void create(Administrativo a);

	public List<Administrativo> read();

	public Administrativo read(int id);

	public void update(Administrativo a);

	public void delete(int id);
}
