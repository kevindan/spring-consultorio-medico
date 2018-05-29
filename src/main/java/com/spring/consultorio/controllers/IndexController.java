package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String hola() {
		return "index";
	}
	
	@GetMapping("/programacion_medica")
	public String programacion_medica() {
		return "programacion_medica";
	}

	@GetMapping("/cita_medica")
	public String cita_medica() {
		return "cita_medica";
	}
	
	@GetMapping("/atender_cita_medica")
	public String atender_cita_medica() {
		return "atender_cita_medica";
	}
	
	@GetMapping("/imagenologia")
	public String imagenologia() {
		return "imagenologia";
	}

	@GetMapping("/diagnostico")
	public String diagnostico() {
		return "diagnostico";
	}


	
}
