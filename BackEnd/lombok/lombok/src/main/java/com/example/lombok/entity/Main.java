package com.example.lombok.entity;

public class Main extends Student {

	
	public static void main(String []args) {
		
		Student student = new Student();
		
		student.setFirstName("sujit");
		System.out.println(student.getFirstName());
		
	}
}
