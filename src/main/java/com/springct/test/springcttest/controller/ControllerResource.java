package com.springct.test.springcttest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springct.test.springcttest.model.Course;
import com.springct.test.springcttest.model.Student;
import com.springct.test.springcttest.service.CourseService;
import com.springct.test.springcttest.service.StudentService;

@RestController
public class ControllerResource {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/getAllStudents")
	public List<Student> getStudent() {
		return studentService.getAllStudent();
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@DeleteMapping("/deleteCourseById/{id}")
	public String deleteCourseById(@PathVariable int id) {
		courseService.deleteCourseById(id);
		return "Deleted course successfully for id "+id;
	}

}
