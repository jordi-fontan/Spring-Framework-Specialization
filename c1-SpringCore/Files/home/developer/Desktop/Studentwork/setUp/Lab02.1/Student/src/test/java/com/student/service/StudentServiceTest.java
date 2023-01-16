package com.student.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentServiceTest {
	
	private ClassPathXmlApplicationContext context;
	private StudentService service;

	@BeforeEach
	void setUp() {
		  
	}
	
 
	@Test
	void testGetOneStudent() {
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("beans.xml");
		service=cnt.getBean("studentService", StudentService.class);
		assertThat(service,notNullValue());
		  //TODO
	}
	
	@Test
	void tesGetAll() {
		 
	}
}
