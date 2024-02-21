package com.numetry.schooltransportation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.schooltransportation.entity.StudentRegister;

@Repository
public interface StudentRegisterDao extends JpaRepository<StudentRegister, Integer> {

}
 