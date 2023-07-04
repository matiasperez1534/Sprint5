package cl.interfaces;

import java.util.List;

import cl.modelo.dto.Profesional;

public interface IProfesionalDAO {

	/**
	 * C = Create R = Read U = Update D = Delete
	 */

	public void create(Profesional p);

	public List<Profesional> read();

	public Profesional read(int id);

	public void update(Profesional p);

	public void delete(int id);
}
