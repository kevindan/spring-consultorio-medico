package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EspecialidadController {

	@GetMapping("/especialidad")
	public String especialidad() {
		return "especialidad";
	}
	
	
}
