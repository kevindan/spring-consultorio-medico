package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String hola() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/paciente")
	public String paciente() {
		return "paciente";
	}

	@GetMapping("/personal")
	public String personal() {
		return "personal";
	}
	
	@GetMapping("/programacion_medica")
	public String programacion_medica() {
		return "programacion_medica";
	}

	@GetMapping("/cita_medica")
	public String cita_medica() {
		return "cita_medica";
	}

}
