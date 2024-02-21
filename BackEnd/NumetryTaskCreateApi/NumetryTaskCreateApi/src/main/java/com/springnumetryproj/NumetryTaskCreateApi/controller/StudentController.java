package com.springnumetryproj.NumetryTaskCreateApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springnumetryproj.NumetryTaskCreateApi.entities.Student;
import com.springnumetryproj.NumetryTaskCreateApi.service.StudentService;
import com.springnumetryproj.NumetryTaskCreateApi.service.StudentServiceImp;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImp studentServiceImp; 
	
	@CrossOrigin
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		
		return studentServiceImp.getStudents(); 
		
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) 
	{
		
			return studentServiceImp.addStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentServiceImp.updateStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentServiceImp.deleteStudent(id);
		
	}
	

}
