package cl.servicios;

import java.util.List;

import cl.implemente.AdministrativoDAO;
import cl.modelo.dto.Administrativo;

public class ServicioAdministrativo {
	private AdministrativoDAO administrativoDAO = new AdministrativoDAO();

	public List<Administrativo> findAll() {
		return administrativoDAO.read();
	}

	public Administrativo findOne(int id) {
		return administrativoDAO.read(id);
	}

	public void update(Administrativo a) {
		administrativoDAO.update(a);
	}

	public void create(Administrativo a) {
		administrativoDAO.create(a);
	}

	public void delete(int id) {
		administrativoDAO.delete(id);
	}

}
