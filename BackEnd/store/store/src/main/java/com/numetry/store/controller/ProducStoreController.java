package com.numetry.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.store.entity.ProductStore;
import com.numetry.store.service.ProductStoreServiceImp;

@RestController
public class ProducStoreController {

	@Autowired
	private ProductStoreServiceImp productStoreServiceImp;
	
	@GetMapping("/list")
	public List<ProductStore> getAllProducts()
	{
		return productStoreServiceImp.getAllProducts();
	}
	
	@PostMapping("/save")
	public ProductStore saveProduct(@RequestBody ProductStore productStore)
	{
		return productStoreServiceImp.saveProduct(productStore);
	}
}