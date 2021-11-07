package pe.edu.upc.galaxy.business.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.galaxy.business.CarteraService;
import pe.edu.upc.galaxy.entity.Cartera;
import pe.edu.upc.galaxy.repository.CarteraRepository;

@Service
public class CarteraServiceImpl implements CarteraService {

	@Autowired
	private CarteraRepository carteraRepository;
	
	@Override
	public JpaRepository<Cartera, Integer> getJpaRepository() {
		return carteraRepository;
	}
	
	@Override
	public List<Cartera> findByFechaDescuento(Date fechaDescuento) throws Exception {
		return carteraRepository.findByFechaDescuento(fechaDescuento);
	}

}
