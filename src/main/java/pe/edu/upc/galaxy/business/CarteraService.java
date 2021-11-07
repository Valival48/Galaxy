package pe.edu.upc.galaxy.business;

import java.util.Date;
import java.util.List;

import pe.edu.upc.galaxy.entity.Cartera;

public interface CarteraService extends Service<Cartera, Integer> {
	List<Cartera> findByFechaDescuento(Date fechaDescuento) throws Exception;
}
