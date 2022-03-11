package com.springct.test.springcttest.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	
	@Column(name="course_name")
	private String name;
	
	@Column(name="professor_name")
	private String professorName;
	
	@Column(name="description")
	private String description;
	
	public Course() {
	}

	public Course(int courseId, String name, String professorName, String description, List<Student> student) {
		this.courseId = courseId;
		this.name = name;
		this.professorName = professorName;
		this.description = description;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", professorName=" + professorName + ", description="
				+ description + "]";
	}
	
	
}
