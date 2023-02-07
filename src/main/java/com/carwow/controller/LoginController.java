package com.carwow.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.carwow.dto.LoginDto;
import com.carwow.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	@Qualifier("LoginService")
	private LoginService loginService;
	
	@GetMapping(path = { "/login" })
	public String showLoginForm(LoginDto user) {
		
		return "/login";
	}
	
	@PostMapping(path = { "/login" })
	public String login(String userId, String passwd, HttpSession session, Model model) {
		
		LoginDto user = loginService.findLoginByIdAndPasswd(userId, passwd);
		
		if(user != null) {
				session.setAttribute("loginuser", user);
		} else {
				model.addAttribute("loginfail", userId);
				return "/login";
		}
		
		
		return "redirect:/home";
	}
}
