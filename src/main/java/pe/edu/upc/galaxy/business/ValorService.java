package pe.edu.upc.galaxy.business;

import java.util.List;

import pe.edu.upc.galaxy.entity.Valor;

public interface ValorService extends Service<Valor, Long> {
	List<Valor> filterByME();
	List<Valor> filterByMN();
}
