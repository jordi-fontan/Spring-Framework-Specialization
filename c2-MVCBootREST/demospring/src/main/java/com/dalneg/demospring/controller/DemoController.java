package com.dalneg.demospring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Value("${country}")
	String country;
	@GetMapping
	public String demoHome() {
		return "this is home";
	}
	@GetMapping("/subdemo")
	public String subdemo(){
		return "this is not home";
	}
	@GetMapping("/greetMe")
	public String greetme(HttpServletRequest req) {
		return "Hello "+req.getParameter("name") +" from "+ country;	
	}
	
	
}
