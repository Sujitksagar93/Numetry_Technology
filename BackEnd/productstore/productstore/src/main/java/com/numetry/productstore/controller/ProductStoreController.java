package com.numetry.productstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.productstore.entity.Product;
import com.numetry.productstore.service.ProductStoreServiceImp;

@RestController
@RequestMapping("/product")
public class ProductStoreController {

	@Autowired
	private ProductStoreServiceImp productStoreServiceImp;
	
	@GetMapping("/list")
	public List<Product> getAllProduct()
	{
		return productStoreServiceImp.getAllProduct();
	}
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product)
	{
		return productStoreServiceImp.saveProduct(product);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		
		return productStoreServiceImp.updateProduct(product);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		 productStoreServiceImp.deleteProduct(id);
		
		 System.out.println("deleted successfully");
		 
	}
	
}
