package com.guigaspar.assignment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
}