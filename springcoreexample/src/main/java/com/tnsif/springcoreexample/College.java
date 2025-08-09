package com.tnsif.springcoreexample;

public class College {
	private Student student;
	
	public College() {
		System.out.println("College object created...");
	}
	public void Show() {
		System.out.println("welcome to the college");
		student.display();
	}
 }
