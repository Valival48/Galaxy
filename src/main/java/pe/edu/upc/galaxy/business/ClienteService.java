package pe.edu.upc.galaxy.business;

import java.util.List;

import pe.edu.upc.galaxy.entity.Cliente;

public interface ClienteService extends Service<Cliente, Integer> {
		List<Cliente>listClientes() throws Exception;
}
