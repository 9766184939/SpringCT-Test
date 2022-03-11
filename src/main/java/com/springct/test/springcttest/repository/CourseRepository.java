package com.springct.test.springcttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springct.test.springcttest.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	
}
