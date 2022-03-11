package com.springct.test.springcttest.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="student_name")
	@NonNull
	private String studentName;
	
	@Column(name="email", unique=true)
	@NonNull
	private String email;
	
	@Column(name="pnone_no", unique=true)
	@NonNull
	private String phone;
	
	@Column(name="course")
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Course> course;
	
	
	
	public Student() {
	}
	public Student(int id, String studentName, String email, String phone, List<Course> course) {
		this.id = id;
		this.studentName = studentName;
		this.email = email;
		this.phone = phone;
		this.course = course;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", email=" + email + ", phone=" + phone
				+ ", course=" + course + "]";
	}
	
	
	
}
