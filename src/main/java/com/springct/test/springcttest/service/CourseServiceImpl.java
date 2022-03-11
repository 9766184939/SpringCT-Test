package com.springct.test.springcttest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springct.test.springcttest.model.Course;
import com.springct.test.springcttest.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(int id) {
		courseRepository.deleteById(id);
	}

}
