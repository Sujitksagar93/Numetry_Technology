package com.numetry.login.model;



import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "SN")
	@NotNull
	private int serialNo;
	
	@NotNull
	@Column(name = "Email")
	private String email;
	
	@NotNull
	@Column(name = "username")
	private String username;
	
	@NotNull
	@Column(name = "Password")
	private String password;


	public User(int serialNo, String email, String username, String password) {
		super();
		this.serialNo = serialNo;
		this.email = email;
		this.username = username;
		this.password = password;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [serialNo=" + serialNo + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}

	


}
