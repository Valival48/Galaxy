package pe.edu.upc.galaxy.business;

import java.util.List;
import pe.edu.upc.galaxy.entity.TipoMoneda;

public interface TipoMonedaService extends Service<TipoMoneda, Integer> {
	
	List<TipoMoneda> listAllMoneda() throws Exception;

}