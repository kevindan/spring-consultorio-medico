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
	
	@GetMapping("/atender_cita_medica")
	public String atender_cita_medica() {
		return "atender_cita_medica";
	}
	
	@GetMapping("/imagenologia")
	public String imagenologia() {
		return "imagenologia";
	}
	
	@GetMapping("/consultorio")
	public String consultorio() {
		return "consultorio";
	}
	
	@GetMapping("/medicamento")
	public String medicamento() {
		return "medicamento";
	}
	
	@GetMapping("/diagnostico")
	public String diagnostico() {
		return "diagnostico";
	}
	
	@GetMapping("/especialidad")
	public String especialidad() {
		return "especialidad";
	}
	
	@GetMapping("/examen_laboratorio")
	public String examen_laboratorio() {
		return "examen_laboratorio";
	}
	
	@GetMapping("/procedimiento")
	public String procedimiento() {
		return "procedimiento";
	}
	
	@GetMapping("/establecimiento")
	public String establecimiento() {
		return "establecimiento";
	}
	
	@GetMapping("/usuario")
	public String usuario() {
		return "usuario";
	}
}
