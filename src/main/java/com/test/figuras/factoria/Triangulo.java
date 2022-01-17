package com.test.figuras.factoria;

import com.test.figuras.model.entity.DatoFigura;

public class Triangulo extends Figura{

public Triangulo() {}
	
	public Triangulo(DatoFigura datos) {
		setDiametro(null);
		setAltura(datos.getAltura());
		setBase(datos.getBase());
		setSuperficie((datos.getBase() * datos.getAltura()) / 2);
		setTipoFigura("TRIANGULO");
	}

}
