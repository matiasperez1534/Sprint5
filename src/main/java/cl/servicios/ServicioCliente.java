package cl.servicios;

import java.util.List;

import cl.implemente.ClienteDAO;
import cl.modelo.dto.Cliente;

public class ServicioCliente {
	private ClienteDAO clienteDAO = new ClienteDAO();

	public List<Cliente> findAll() {
		return clienteDAO.read();
	}

	public Cliente findOne(int id) {
		return clienteDAO.read(id);
	}

	public void update(Cliente c) {
		clienteDAO.update(c);
	}

	public void create(Cliente c) {
		clienteDAO.create(c);
	}

	public void delete(int id) {
		clienteDAO.delete(id);
	}

}
