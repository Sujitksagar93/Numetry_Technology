package com.numetry.schooltransportation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.schooltransportation.entity.StudentRegister;
import com.numetry.schooltransportation.service.StudentRegisterServiceImp;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
public class StudentRegisterController {

	@Autowired
	private StudentRegisterServiceImp studentRegisterServiceImp;
	
	@GetMapping("/list")
	public ResponseEntity<List<StudentRegister>>  geStudentList()
	{
		return ResponseEntity.ok(studentRegisterServiceImp.getStudentList()) ;
	}
	
	@PostMapping("/save")
	public ResponseEntity<StudentRegister>  addStudent(@RequestBody @Valid StudentRegister studentRegister)
	{
		return new ResponseEntity<>(studentRegisterServiceImp.addStudent(studentRegister), HttpStatus.CREATED);
	}
	
	
	

}

