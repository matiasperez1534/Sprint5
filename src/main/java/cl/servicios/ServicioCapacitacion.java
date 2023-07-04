package cl.servicios;

import java.util.List;

import cl.implemente.CapacitacionDAO;
import cl.modelo.dto.Capacitacion;

public class ServicioCapacitacion {

	private CapacitacionDAO capacitacionDAO = new CapacitacionDAO();

	public List<Capacitacion> findAll() {
		return capacitacionDAO.read();
	}

	public Capacitacion findOne(int id) {
		return capacitacionDAO.read(id);
	}

	public void update(Capacitacion c) {
		capacitacionDAO.update(c);
	}

	public void create(Capacitacion c) {
		capacitacionDAO.create(c);
	}

	public void delete(int id) {
		capacitacionDAO.delete(id);
	}

}
