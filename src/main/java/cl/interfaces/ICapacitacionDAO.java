package cl.interfaces;

import java.util.List;

import cl.modelo.dto.Capacitacion;

public interface ICapacitacionDAO {

	/**
	 * C = Create R = Read U = Update D = Delete
	 */

	public void create(Capacitacion c);

	public List<Capacitacion> read();

	public Capacitacion read(int id);

	public void update(Capacitacion c);

	public void delete(int id);

}
