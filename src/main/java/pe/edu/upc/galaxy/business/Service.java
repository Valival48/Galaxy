package pe.edu.upc.galaxy.business;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface Service<T, ID> {
	
JpaRepository<T, ID> getJpaRepository();
	
	@Transactional
	default T create(T entity) throws Exception {
		return getJpaRepository().save(entity);
	}
	
	@Transactional
	default T update(T entity) throws Exception {
		return getJpaRepository().save(entity);
	}
	
	@Transactional(readOnly = true)
	default Optional<T> findById(ID id) throws Exception {
		return getJpaRepository().findById(id);
	}
	
	@Transactional(readOnly = true)
	default boolean existsById(ID id) throws Exception {
		return getJpaRepository().existsById(id);
	}
	
	@Transactional(readOnly = true)
	default List<T> getAll() throws Exception {
		return getJpaRepository().findAll();
	}
	
	@Transactional
	default void deleteById(ID id) throws Exception {
		getJpaRepository().deleteById(id);
	}

}
