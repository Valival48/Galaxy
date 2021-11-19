package pe.edu.upc.galaxy.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.galaxy.business.TipoMonedaService;
import pe.edu.upc.galaxy.entity.TipoMoneda;
import pe.edu.upc.galaxy.repository.TipoMonedaRepository;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService {

	
	@Autowired
	private TipoMonedaRepository tipoMonedaRepository;
	
	@Override
	public JpaRepository<TipoMoneda, Integer> getJpaRepository() {
		return tipoMonedaRepository;
	}
	
	@Override
	public List<TipoMoneda> listAllMoneda() {
		return tipoMonedaRepository.findAll();
	}

	

}