package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	/*
	@GetMapping
	String home() {
		return "Hello World";
	}
	*/
	/*
	  * © LearnQuest 2021
	• In your StudentApplication class add one more method
	• This is a redirect Example using org.springframework.web.servlet.view.RedirectView
	• Re launch your Spring Boot application and navigate to http://localhost:8080 and you should be
	redirected to http://localhost:8080/student/msg
	  * */

	  @GetMapping
	  RedirectView home() {
		  return new RedirectView("student/msg");
	  }

}
