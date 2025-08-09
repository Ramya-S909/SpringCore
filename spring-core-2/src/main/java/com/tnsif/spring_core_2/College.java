package com.tnsif.spring_core_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	private Student student;
	//constructor injection
	@Autowired
	public College(Student student) {
		this.student = student;
	}
	
	public void showCollegeDetails() {
		System.out.println("Welcome to college...");
		student.showStudentName();
	}
}