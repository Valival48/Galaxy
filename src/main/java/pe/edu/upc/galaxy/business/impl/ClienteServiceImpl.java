package pe.edu.upc.galaxy.business.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.galaxy.business.ClienteService;
import pe.edu.upc.galaxy.entity.Cliente;
import pe.edu.upc.galaxy.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public JpaRepository<Cliente, Integer> getJpaRepository() {
		return clienteRepository;
	}

	@Override
	public List<Cliente> listClientes() throws Exception {
		return clienteRepository.findAll();
	}

}
