package com.springct.test.springcttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springct.test.springcttest.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
