package com.test.figuras.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.test.figuras.model.entity.Figura;

public interface IFiguraDao extends CrudRepository<Figura, Integer> {
	
	@Query(value = "SELECT f FROM Figura f WHERE UPPER(TRIM(f.figura)) = UPPER(TRIM(:figura))")
	public Figura obtenerFiguraByTipo(@Param("figura") String figura);

}
