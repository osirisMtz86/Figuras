package com.test.figuras.factoria;

import com.test.figuras.model.entity.DatoFigura;

public class Circulo extends Figura {

	public Circulo() {}
	
	public Circulo(DatoFigura datos) {
		setDiametro(datos.getDiametro());
		setAltura(null);
		setBase(null);
		setSuperficie(Math.PI * (Math.pow((datos.getDiametro() / 2),2)));
		setTipoFigura("CIRCULO");
	}


}
