package com.numetry.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.numetry.login.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	
	
}

