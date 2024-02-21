package com.numetry.login.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import com.numetry.login.dao.UserDao;
import com.numetry.login.model.User;


@Controller
public class UserController {

	@Autowired
	private UserDao userDao;
	

	
	@GetMapping("/")
	public String registerForm() {
		
		return "index" ;
	}
	
	@PostMapping("/register")
	public String userRegister(@ModelAttribute  User user   ) {
		
	
		User save_userUser= userDao.save(user);
		
		System.out.println(save_userUser);
		
		return "welcome";
		
	}
	


}
