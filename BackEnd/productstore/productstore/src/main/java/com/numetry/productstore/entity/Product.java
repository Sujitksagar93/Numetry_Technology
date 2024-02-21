package com.numetry.productstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String productName;
	
	
	private int productQuantity;


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String productName, int productQuantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productQuantity=" + productQuantity + "]";
	}

	
	
	
}
