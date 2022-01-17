package com.test.figuras.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.test.figuras.model.entity.DatoFigura;
public interface IDatoFiguraDao extends CrudRepository<DatoFigura, Integer> {
	
	@Query(value = "SELECT d from DatoFigura d WHERE d.figura = :figura")
	public DatoFigura obtenerByFigura(@Param("figura") com.test.figuras.model.entity.Figura figura);

}
