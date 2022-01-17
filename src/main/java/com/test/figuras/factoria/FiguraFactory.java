package com.test.figuras.factoria;

import com.test.figuras.model.entity.DatoFigura;

public class FiguraFactory {

	public static Figura tipoFigura(DatoFigura datos) {
		
		if("Circulo".equalsIgnoreCase(datos.getFigura().getFigura()))
			return new Circulo(datos);
		
		if("Cuadrado".equalsIgnoreCase(datos.getFigura().getFigura()))
			return new Cuadrado(datos);
		
		if("Rectangulo".equalsIgnoreCase(datos.getFigura().getFigura()))
			return new Rectangulo(datos);
		
		if("Triangulo".equalsIgnoreCase(datos.getFigura().getFigura()))
			return new Triangulo(datos);
		
		return null;
		
	}
}
