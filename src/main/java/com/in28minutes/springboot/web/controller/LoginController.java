package com.in28minutes.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/login")
	
	public String loginMessage() {
		return "Hello World!!!!!~~sdfsdfdf~~~!!";
	}
}
