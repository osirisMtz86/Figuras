package com.test.figuras.factoria;

import com.test.figuras.model.entity.DatoFigura;

public class Rectangulo extends Figura {

	public Rectangulo() {}
	
	public Rectangulo(DatoFigura datos) {
		setDiametro(null);
		setAltura(datos.getAltura());
		setBase(datos.getBase());
		setSuperficie(datos.getBase() * datos.getAltura());
		setTipoFigura("RECTANGULO");
	}

}
