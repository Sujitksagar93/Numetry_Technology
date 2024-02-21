package com.spring.security.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.springsecurity.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
