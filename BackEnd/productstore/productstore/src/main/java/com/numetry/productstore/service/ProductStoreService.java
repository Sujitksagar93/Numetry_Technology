package com.numetry.productstore.service;

import java.util.List;

import com.numetry.productstore.entity.Product;

public interface ProductStoreService {

	
	public List<Product> getAllProduct();
	
	public Product saveProduct(Product product);
	
	public String  deleteProduct( int id);
	
	public Product updateProduct(Product product);
}

