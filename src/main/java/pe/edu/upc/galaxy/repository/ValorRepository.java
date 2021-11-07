package pe.edu.upc.galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.galaxy.entity.Valor;

@Repository
public interface ValorRepository extends JpaRepository<Valor, Long> {

}
