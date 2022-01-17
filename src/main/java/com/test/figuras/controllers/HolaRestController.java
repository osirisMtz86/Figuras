package com.test.figuras.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaRestController {
	
	 @GetMapping("/mensaje")
	  public String mensaje() {
	    return "hola desde spring rest";
	  }

}
