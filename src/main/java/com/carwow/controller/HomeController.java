package com.carwow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping(path = {"/", "/home"})
	public String home() {
		
		return "home";
	}
	
	@GetMapping(path = {"/about"})
	public String about() {
		
		return "about";
	}

}







