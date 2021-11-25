package pe.edu.upc.galaxy.business;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.galaxy.entity.Valor;

public interface ValorService extends Service<Valor, Long> {
	List<Valor> filterByME();
	List<Valor> filterByMN();
	Optional<Valor> findById(Integer id);
	
}
