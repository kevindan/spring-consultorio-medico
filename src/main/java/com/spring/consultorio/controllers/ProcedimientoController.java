package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProcedimientoController {

	@GetMapping("/procedimiento")
	public String procedimiento() {
		return "procedimiento";
	}
	
}
