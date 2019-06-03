package com.cts.product.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.main.dao.ProductDao;
import com.cts.product.main.entity.Product;

@Service("prodService")
public class ProductService {
	
	@Autowired
	private ProductDao prodDao;

	public List<Product> getAllProducts() {
		List<Product>  prods = prodDao.getAllProducts();
		return prods;
	}

	public List<Product> addProduct(Product prod) {
		List<Product>  prods = prodDao.addProduct(prod);
		return prods;
	}

}
