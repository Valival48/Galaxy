package pe.edu.upc.galaxy.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.galaxy.business.TasaService;
import pe.edu.upc.galaxy.entity.Tasa;
import pe.edu.upc.galaxy.repository.TasaRepository;

@Service
public class TasaServiceImpl implements TasaService {

	@Autowired
	private TasaRepository tasaRepository;
	
	@Override
	public JpaRepository<Tasa, Integer> getJpaRepository() {
		return tasaRepository;
	}

}
