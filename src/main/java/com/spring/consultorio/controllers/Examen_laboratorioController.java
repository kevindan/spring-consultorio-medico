package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Examen_laboratorioController {

	@GetMapping("/examen_laboratorio")
	public String examen_laboratorio() {
		return "examen_laboratorio";
	}
	
}
