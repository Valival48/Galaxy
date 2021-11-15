package pe.edu.upc.galaxy.business;

import java.util.List;
import pe.edu.upc.galaxy.entity.TipoMoneda;

public interface TipoMonedaService extends Service<TipoMoneda, Integer> {
	
	public abstract List<TipoMoneda> listAllMoneda();

}
