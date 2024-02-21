package com.numetry.schooltransportation.entity;


import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok_ used to generate getter,setter,to_string,constructor
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
@Table(name="studentregister")
public class StudentRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message = "Enter Name ")
	private String studentName;
	
	
	private String schoolName;
	
	private String grade;
	
	private String date;
	
	private String parentName;
	
	@Column(length = 255)
	@NotBlank(message = "Enter address ")
	private String address;
	
	@Column(length = 255)
	private String address1;
	
	@NotBlank(message = "Enter city")
	private String city;
	
	private String state;
	
	@Column(length = 10)
	private String zipcode;
	
	@Column(length = 15)
	
	private long mobile;
	
	@Email(message = "Invalid email address")
	@NotEmpty
	private String email;
}
