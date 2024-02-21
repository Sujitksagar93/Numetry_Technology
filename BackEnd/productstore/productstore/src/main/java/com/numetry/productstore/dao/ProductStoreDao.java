package com.numetry.productstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.productstore.entity.Product;

@Repository
public interface ProductStoreDao extends JpaRepository<Product, Integer>{

}
