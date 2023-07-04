package cl.servicios;

import java.util.List;

import cl.implemente.ProfesionalDAO;
import cl.modelo.dto.Profesional;

public class ServicioProfesional {
	private ProfesionalDAO profesionalDAO = new ProfesionalDAO();

	public List<Profesional> findAll() {
		return profesionalDAO.read();
	}

	public Profesional findOne(int id) {
		return profesionalDAO.read(id);
	}

	public void update(Profesional p) {
		profesionalDAO.update(p);
	}

	public void create(Profesional p) {
		profesionalDAO.create(p);
	}

	public void delete(int id) {
		profesionalDAO.delete(id);
	}

}
