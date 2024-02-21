package com.numetry.productstore.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.numetry.productstore.dao.ProductStoreDao;
import com.numetry.productstore.entity.Product;

@Service
public class ProductStoreServiceImp implements ProductStoreService {

	
	@Autowired
	private ProductStoreDao productStoreDao;

	
	public List<Product> getAllProduct() {
		
		return productStoreDao.findAll();
	}


	@Override
	public Product saveProduct(Product product) {
		
		return productStoreDao.save(product);
	}


	@Override
	public String deleteProduct( int id) {
		
			productStoreDao.deleteById(id);;
		
		return "deleted successfully";
		
	}


	@Override
	public Product updateProduct(Product product) {
		
		Product update= productStoreDao.findById(product.getId()).orElse(null);
		
		if(update != null)
		{
			
			update.setProductName(product.getProductName());
			update.setProductQuantity(product.getProductQuantity());
			
			 productStoreDao.save(update);
			 return update;
		}
		
		return null;
	}
	
	
	
}
