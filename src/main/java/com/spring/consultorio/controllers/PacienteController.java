package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {
	
	@GetMapping("/paciente")
	public String paciente() {
		return "paciente";
	}

}
