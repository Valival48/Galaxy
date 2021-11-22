package pe.edu.upc.galaxy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import pe.edu.upc.galaxy.entity.Valor;


@Repository
public interface ValorRepository extends JpaRepository<Valor, Long> {

	@Query("SELECT v FROM Valor v WHERE v.tipoMoneda.id = '1002'")
	List<Valor> filterByME();
	
	@Query("SELECT v FROM Valor v WHERE v.tipoMoneda.id = '1001'")
	List<Valor> filterByMN();
	
}
