package com.tnsif.springcoreexample;

public class Student {
	public static Object display;
	private String name;
	public void setname(String name) {
		this.name= name;
	}
	public Student() {
		System.out.println("Student object cretaed.....");
	}
	public void display() {
		System.out.println("Student Name:" + name);
	}

}
