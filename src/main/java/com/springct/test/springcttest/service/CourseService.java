package com.springct.test.springcttest.service;

import com.springct.test.springcttest.model.Course;

public interface CourseService {
	public Course addCourse(Course course);
	public void deleteCourseById(int id);
}
