package com.student.service;

import java.util.Collection;
import java.util.stream.Collector;

import com.student.core.Student;
import com.student.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	private int numberOfStudents;

	@Override
	public Student get(long id) {
		return studentDao.getOne(id);
	}

	@Override
	public Collection<Student> getAllStudents() {
		return studentDao.getAll();
		//return studentDao.getAll().stream().limit(numberOfStudents).collect(Collector.toList());
	}

}
