package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/usuario")
	public String usuario() {
		return "usuario";
	}
	
}
