package com.test.figuras.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.figuras.model.dao.IFiguraDao;
import com.test.figuras.model.entity.Figura;


@Service
public class FiguraServiceImp implements IFiguraService{

	@Autowired
	private IFiguraDao dao;
	
	
	@Override
	public Figura save(Figura entity) {
		return dao.save(entity);
	}

	@Override
	public void delete(Figura entity) {
		dao.delete(entity);
	}

	@Override
	public Figura obtenerFiguraByTipo(String tipoFigura) {
		return dao.obtenerFiguraByTipo(tipoFigura);
	}

}
