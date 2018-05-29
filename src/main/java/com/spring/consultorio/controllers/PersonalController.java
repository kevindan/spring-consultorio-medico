package com.spring.consultorio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalController {

	@GetMapping("/personal")
	public String personal() {
		return "personal";
	}
	
}
