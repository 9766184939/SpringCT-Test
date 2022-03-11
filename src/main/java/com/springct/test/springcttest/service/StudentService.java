package com.springct.test.springcttest.service;

import java.util.List;

import com.springct.test.springcttest.model.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public List<Student> getAllStudent();
}
