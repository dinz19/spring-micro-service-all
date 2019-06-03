package com.cts.product.main.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.main.entity.Product;
import com.cts.product.main.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService prodService;

@RequestMapping("/")
public String welcome() {
	return "welcome to product micro service";
}


@RequestMapping("/all")
public List<Product> getAllProducts() {
	List<Product> prods = prodService.getAllProducts();
	return prods;
}


@RequestMapping(value = "/add", method = RequestMethod.POST)
public List<Product> addProduct(@RequestBody Product product) {
	List<Product> prods  = prodService.addProduct(product);
	return prods;
}


}
