package com.cts.product.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.main.entity.Product;
import com.cts.product.main.repository.ProductRepository;

@Repository("productDao")
public class ProductDao {
@Autowired
	private ProductRepository prodRepo;
	
public List<Product> getAllProducts() {
	return prodRepo.findAll();
}

public List<Product> addProduct(Product prod) {
	 prodRepo.save(prod);
	 return prodRepo.findAll();
	
}
}
