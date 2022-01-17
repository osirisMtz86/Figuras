package com.test.figuras.model.service;

import com.test.figuras.model.entity.Figura;

public interface IFiguraService {
	
	
	public Figura save(Figura entity);
	
	public void delete(Figura entity);
	
	public Figura obtenerFiguraByTipo(String tipoFigura);
	

}
