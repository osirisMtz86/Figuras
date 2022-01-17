package com.test.figuras.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.test.figuras.model.dto.DatosFiguraDto;
import com.test.figuras.model.entity.DatoFigura;
import com.test.figuras.model.entity.Figura;
import com.test.figuras.model.service.IDatosFiguraService;
import com.test.figuras.model.service.IFiguraService;

@RestController
public class FiguraRestController {

	@Autowired
	private IDatosFiguraService servicio;
	@Autowired
	private IFiguraService figuraService;

	@PostMapping("/figura")
	public ResponseEntity<?> insert(@RequestBody DatosFiguraDto datos) {

		Map<String, Object> response = new HashMap<>();
		DatoFigura datoFigura = null;
		Figura figura = null;

		try {

			if (datos == null) {
				response.put("msn", "Figura no contiene Informacion");
				response.put("error", "Los datos de la figura no pueden venir vacios");
				response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}

			figura = figuraService.obtenerFiguraByTipo(datos.getTipoFigura());

			if (figura == null) {
				response.put("msn", "Figura no existe");
				response.put("error", "La figura no existe. Favor de ingresa una figura valida");
				response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			datoFigura = servicio.obtenerDatosByFigura(figura);
			
			if(datoFigura != null) {
				
				servicio.delete(datoFigura);
			}
		
			datoFigura = new DatoFigura();

			datoFigura.setAltura(datos.getAltura());
			datoFigura.setBase(datos.getBase());
			datoFigura.setDiametro(datos.getDiametro());
			datoFigura.setFigura(figura);
			datoFigura = servicio.save(datoFigura);
			
			response.put("msn", "Registro creado");

		} catch (DataAccessException e) {
			response.put("msn", "Ocurrio un Error...");
			response.put("error", e.getMessage());
			response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		} finally {
			if (datoFigura != null)
				datoFigura = null;
			if (figura != null)
				figura = null;
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}


	@GetMapping("/figura/{nombreFigura}")
	public ResponseEntity<?> getFigura(@PathVariable String nombreFigura) {
		Map<String, Object> response = new HashMap<>();
		
		DatoFigura datoFigura = null;
		com.test.figuras.factoria.Figura figura = null;
		Figura figuraDB = null;
		
		
		try {
			
			if (nombreFigura == null) {
				response.put("msn", "Figura no contiene Informacion");
				response.put("error", "Los datos de la figura no pueden venir vacios");
				response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			figuraDB = figuraService.obtenerFiguraByTipo(nombreFigura);
			
			if (figuraDB == null) {
				response.put("msn", "Figura no Existe. Favor de Ingresar figura valida...");
				response.put("error", "Los datos de la figura no pueden venir vacios");
				response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			figura = servicio.obtenerByFigura(figuraDB);
			
			response.put("figura", figura);
			
		} catch (DataAccessException e) {
			response.put("msn", "Ocurrio un Error...");
			response.put("error", e.getMessage());
			response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		} finally {
			if (datoFigura != null)
				datoFigura = null;
			if (figuraDB != null)
				figuraDB = null;
			
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

}
