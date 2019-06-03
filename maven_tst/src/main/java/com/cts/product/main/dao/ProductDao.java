package com.cts.product.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.cts.product.main.entity.InventoryResponse;
import com.cts.product.main.entity.Product;
import com.cts.product.main.repository.ProductRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Repository("productDao")
public class ProductDao {

	@Autowired
	private ProductRepository prodRepo;

	@Autowired
	private RestTemplate restTemplate;

	public List<Product> getAllProducts() {
		return prodRepo.findAll();
	}

	public List<Product> addProduct(Product prod) {
		prodRepo.save(prod);
		return prodRepo.findAll();

	}

	@HystrixCommand(fallbackMethod = "findByProductCodeFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")
	})
	
	public Product findByProductCode(String prodCode) {
		/*
		 * try { Thread.sleep(5000); }catch (Exception e) {
		 * System.out.println("Thread sleep"); }
		 */
		Product prod = prodRepo.findByProductCode(prodCode);
		if (prod != null) {
			/* String url = "http://inventory-microservice/shop/inventory/"+prodCode; */
			String url = "http://localhost:8080/shop/inventory/" + prodCode;
			ResponseEntity<InventoryResponse> invresp = restTemplate.getForEntity(url, InventoryResponse.class);
			System.out.println("response received from inventory micro service");
			if (invresp.getStatusCode() == HttpStatus.OK) {
				if (invresp.getBody().getQuantity() > 0) {
					prod.setStockStatus(true);
					prodRepo.save(prod);
				} else {
					System.out.println("Unable to get Prod code :" + prod.getProductCode());
					System.out.println("Error Code :" + invresp.getStatusCodeValue());
					prod.setStockStatus(false);
					prodRepo.save(prod);
				}
			}
			return prod;
		}
		return prod;

	}

	public Product findByProductCodeFallback(String code) {
		System.out.println("#####entering fallback####");
		Product p1 = new Product();
		p1.setId(1000);
		p1.setName("Dummy");
		p1.setPrice("2000");
		p1.setStockStatus(false);
		return p1;
	}
}
