package pe.edu.upc.galaxy.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.galaxy.business.ValorService;
import pe.edu.upc.galaxy.entity.Valor;
import pe.edu.upc.galaxy.repository.ValorRepository;

@Service
public class ValorServiceImpl implements ValorService {

	@Autowired
	private ValorRepository valorRepository;
	
	@Override
	public JpaRepository<Valor, Long> getJpaRepository() {
		return valorRepository;
	}

}
