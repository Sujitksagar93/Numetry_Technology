package com.numetry.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.login.model.AdminLogin;

@Repository
public interface AdminLoginDao extends JpaRepository<AdminLogin, Integer> {

}
