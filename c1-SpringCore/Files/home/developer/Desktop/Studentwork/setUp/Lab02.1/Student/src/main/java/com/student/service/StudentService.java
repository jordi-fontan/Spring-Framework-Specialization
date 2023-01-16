package com.student.service;

import java.util.Collection;

import com.student.core.Student;
/*
 * service
 */
public interface StudentService {
	
	Student get(long id);
	Collection<Student> getAllStudents();

}
