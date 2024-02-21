package com.numetry.schooltransportation.service;

import java.util.List;

import com.numetry.schooltransportation.entity.StudentRegister;

public interface StudentRegisterService {

	public List<StudentRegister> getStudentList();
	
	public StudentRegister addStudent(StudentRegister studentRegister);
	
	
}
