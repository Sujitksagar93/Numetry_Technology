package com.numetry.store.service;

import java.util.List;

import com.numetry.store.entity.ProductStore;

public interface ProductStoreService {
	
	public List<ProductStore> getAllProducts();

	public ProductStore saveProduct(ProductStore productStore);
}
