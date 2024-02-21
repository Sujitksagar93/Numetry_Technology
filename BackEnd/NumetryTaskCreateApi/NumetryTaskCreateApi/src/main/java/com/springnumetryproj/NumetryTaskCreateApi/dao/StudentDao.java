package com.springnumetryproj.NumetryTaskCreateApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springnumetryproj.NumetryTaskCreateApi.entities.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
