package com.numetry.schooltransportation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.schooltransportation.entity.StudentRegister;
import com.numetry.schooltransportation.repository.StudentRegisterDao;

@Service
public class StudentRegisterServiceImp implements StudentRegisterService {

	@Autowired
	private StudentRegisterDao studentRegisterDao;
	@Override
	public List<StudentRegister> getStudentList() {
		
		return studentRegisterDao.findAll() ;
	}

	@Override
	public StudentRegister addStudent(StudentRegister studentRegisters) {
		
//		StudentRegister studentRegister = StudentRegister.build(0, studentRegisters.getStudentName(),
//				
//				studentRegisters.getSchoolName(),
//				 
//				studentRegisters.getGrade(),
//				studentRegisters.getDate(),
//				studentRegisters.getParentName(),
//				studentRegisters.getAddress(), 
//				studentRegisters.getAddress1(), 
//				studentRegisters.getCity(),
//				studentRegisters.getState(),
//				studentRegisters.getZipcode(),
//				studentRegisters.getMobile(),
//				 studentRegisters.getEmail() 
//				  
//				);
		//above code is optional for error handling
		
		return studentRegisterDao.save(studentRegisters);
	}
	


}
