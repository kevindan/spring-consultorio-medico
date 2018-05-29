package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstablecimientoController {

	@GetMapping("/establecimiento")
	public String establecimiento() {
		return "establecimiento";
	}
	
}
