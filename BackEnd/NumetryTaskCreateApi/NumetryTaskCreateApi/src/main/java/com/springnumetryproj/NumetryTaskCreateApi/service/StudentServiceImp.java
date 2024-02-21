package com.springnumetryproj.NumetryTaskCreateApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springnumetryproj.NumetryTaskCreateApi.dao.StudentDao;
import com.springnumetryproj.NumetryTaskCreateApi.entities.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> getStudents() {
		
		
		return studentDao.findAll() ;
	}

	@Override
	public Student addStudent(Student student) {
		// 
		return studentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentDao.save(student);
	}

	public void deleteStudent(int id) {
		
		Student delete = studentDao.getOne(id);
		studentDao.delete(delete);
	}





	
	
	

	
	
}
