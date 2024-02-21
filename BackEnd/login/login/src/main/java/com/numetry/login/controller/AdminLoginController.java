package com.numetry.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.numetry.login.dao.AdminLoginDao;
import com.numetry.login.model.AdminLogin;

@Controller
public class AdminLoginController {

	@Autowired
	private AdminLoginDao adminLoginDao;
	
	@GetMapping("/admin")
	public String registerAdmin() {
		
		return "admin" ;
	}

	
	@PostMapping("/admin")
	public String adminRegister(@ModelAttribute AdminLogin adminLogin)
	{
		AdminLogin save_admin = adminLoginDao.save(adminLogin);
		
		return "welcome";
	}
}
