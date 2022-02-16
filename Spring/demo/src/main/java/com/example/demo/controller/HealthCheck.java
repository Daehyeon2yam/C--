package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	
	@GetMapping("/")
	public String HelloCheck() {
		return "The Server is up and running";
	}

}
