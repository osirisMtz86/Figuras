package com.test.figuras.model.service;

import com.test.figuras.model.entity.DatoFigura;
import com.test.figuras.factoria.Figura;

public interface IDatosFiguraService {

	
	public DatoFigura save(DatoFigura entity);
	
	public void delete(DatoFigura entity);
	
	public Figura obtenerByFigura(com.test.figuras.model.entity.Figura figura);
	
	public DatoFigura obtenerDatosByFigura(com.test.figuras.model.entity.Figura figura);
	
	
}
