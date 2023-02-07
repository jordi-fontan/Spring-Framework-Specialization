package com.student.controller;

 
import java.util.Collection;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.student.core.Student;
import com.student.service.StudentService;
 /*
  * © LearnQuest 2021
• In your project’s application.properties file add the following entries
• In the class StudentController;
• Annotate the class as a RestController tied to a RequestMapping of “/student”
• Annotate the property “message” with the spring @Value annotation and an EL expression of
“${message}“. This should pick up the message literal text via the spring Environment Object
that you placed in your properties file
• Annotate the method getMessage() with @GetMapping(“msg”), this means it is tied to the url
“/student/msg"
In the same Controller class,Inject in the StudentService class using @Inject
Add a new method as below;
Annotate the method with @GetMapping, this means that the method is tied to an HTTP to the url
/student and will return a Collection of student Objects that will be transformed into Json
Launch your Spring boot Application
  */
@RestController
@RequestMapping("/student")

public class StudentController {
	
	@Value("${greeting}")
	private String message;
	
	@Inject
	private StudentService dao;
	
	@GetMapping("/students")
	public Collection<Student> getAll()	{
		return dao.getAllStudents();
	}
	
	@Value("${message}")
	private String message_old;
 
	@GetMapping("/msg")
	public String getMessage() {
		return message;
	}
	
 
}