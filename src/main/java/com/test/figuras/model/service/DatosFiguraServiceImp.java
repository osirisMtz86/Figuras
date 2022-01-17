package com.test.figuras.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.figuras.factoria.FiguraFactory;
import com.test.figuras.model.dao.IDatoFiguraDao;
import com.test.figuras.model.entity.DatoFigura;
import com.test.figuras.factoria.Figura;


@Service
public class DatosFiguraServiceImp implements IDatosFiguraService {

	@Autowired
	private IDatoFiguraDao dao;
	
	@Override
	public DatoFigura save(DatoFigura entity) {
		return dao.save(entity);
	}

	@Override
	public void delete(DatoFigura entity) {
		dao.delete(entity);

	}
	
	@Override
	public DatoFigura obtenerDatosByFigura(com.test.figuras.model.entity.Figura figura) {
		return dao.obtenerByFigura(figura);
	}
	
	@Override
	public Figura obtenerByFigura(com.test.figuras.model.entity.Figura figura) {
		return FiguraFactory.tipoFigura(dao.obtenerByFigura(figura));
	}



	

}
