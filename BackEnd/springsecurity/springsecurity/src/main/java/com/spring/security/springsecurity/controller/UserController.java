package com.spring.security.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.springsecurity.entity.User;
import com.spring.security.springsecurity.service.UserServiceImp;

@RestController
@RequestMapping("/home")
public class UserController {
	
	@Autowired
	private UserServiceImp userServiceImp;
	
		@GetMapping("/user")
		public  List<User> getAllUser()
		{
			
			return userServiceImp.getAllUser();
		}
		
		@GetMapping("/admin")
		public ResponseEntity<String> adminUser()
		{
			
			return ResponseEntity.ok("Yes i am Admin user");
		}
		@GetMapping("/public")
		public ResponseEntity<String> publicUser()
		{
			
			return ResponseEntity.ok("Yes i am Public user");
		}
}
