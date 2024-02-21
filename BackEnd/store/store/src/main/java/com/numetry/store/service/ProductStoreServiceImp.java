package com.numetry.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.store.dao.ProductStoreDao;
import com.numetry.store.entity.ProductStore;

@Service
public class ProductStoreServiceImp implements ProductStoreService {

	@Autowired
	private ProductStoreDao productStoreDao;
	
	@Override
	public List<ProductStore> getAllProducts() {
		
		return productStoreDao.findAll();
	}

	public ProductStore saveProduct(ProductStore productStore)
	{
		return productStoreDao.save(productStore);
	}
	
}
