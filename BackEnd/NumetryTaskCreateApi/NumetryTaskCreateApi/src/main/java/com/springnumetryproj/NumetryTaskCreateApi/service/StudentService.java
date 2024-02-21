package com.springnumetryproj.NumetryTaskCreateApi.service;

import java.util.List;

import com.springnumetryproj.NumetryTaskCreateApi.entities.Student;


public interface StudentService {
	
	
	public List<Student> getStudents();

	public Student addStudent( Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(int id);
	

}
