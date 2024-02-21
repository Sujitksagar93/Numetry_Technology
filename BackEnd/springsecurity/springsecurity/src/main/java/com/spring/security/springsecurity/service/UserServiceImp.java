package com.spring.security.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.springsecurity.dao.UserDao;
import com.spring.security.springsecurity.entity.User;

@Service
public class UserServiceImp implements UserService{

		@Autowired
		private UserDao userDao ;
	
	@Override
	public List<User> getAllUser() {
	
		return userDao.findAll();
	}

}
