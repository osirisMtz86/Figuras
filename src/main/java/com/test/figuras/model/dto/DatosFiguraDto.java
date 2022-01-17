package com.test.figuras.model.dto;

import java.io.Serializable;

public class DatosFiguraDto implements Serializable{
	
	
	private Double base;
	private Double altura;
	private Double diametro;
	private String tipoFigura;
	
	public DatosFiguraDto() {}
	
	

	public Double getBase() {
		return base;
	}



	public void setBase(Double base) {
		this.base = base;
	}



	public Double getAltura() {
		return altura;
	}



	public void setAltura(Double altura) {
		this.altura = altura;
	}



	public Double getDiametro() {
		return diametro;
	}



	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public String getTipoFigura() {
		return tipoFigura;
	}



	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
