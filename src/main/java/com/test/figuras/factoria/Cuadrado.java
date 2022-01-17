package com.test.figuras.factoria;

import com.test.figuras.model.entity.DatoFigura;

public class Cuadrado extends Figura {

	
	public Cuadrado() {}
	
	public Cuadrado(DatoFigura datos) {
		setDiametro(null);
		setAltura(datos.getAltura());
		setBase(datos.getBase());
		setSuperficie(datos.getBase() * datos.getAltura());
		setTipoFigura("CUADRADO");
	}
	

	

}
