package pe.edu.upc.galaxy.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.galaxy.entity.Cartera;

@Repository
public interface CarteraRepository extends JpaRepository<Cartera, Integer> {
	List<Cartera> findByFechaDescuento(Date fechaDescuento);
}
