package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultorioController {

	@GetMapping("/consultorio")
	public String consultorio() {
		return "consultorio";
	}
	
}
