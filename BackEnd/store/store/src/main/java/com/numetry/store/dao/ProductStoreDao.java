package com.numetry.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.store.entity.ProductStore;

@Repository
public interface ProductStoreDao extends JpaRepository<ProductStore, Integer> {

}
