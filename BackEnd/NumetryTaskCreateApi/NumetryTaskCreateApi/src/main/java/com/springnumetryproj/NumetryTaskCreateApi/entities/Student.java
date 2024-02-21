package com.springnumetryproj.NumetryTaskCreateApi.entities;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
	
	@Id
	private int ID;
	
	private String name;
	
	private int age;
	
	private int rollNo;

	public Student(int iD, String name, int age, int rollNo) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
	}
	
	

}
