package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicamentoController {

	@GetMapping("/medicamento")
	public String medicamento() {
		return "medicamento";
	}
	
}
