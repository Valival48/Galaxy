package pe.edu.upc.galaxy.business.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Valor> filterByME() {
		return valorRepository.filterByME();
	}

	@Override
	public List<Valor> filterByMN() {
		return valorRepository.filterByMN();
	}

	@Override
	public Optional<Valor> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
