package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	//	SpringApplication.run(Application.class, args);
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		productDaoImpl dao= ac.getBean(productDaoImpl.class);
		
		Product prod=new Product();
		
		prod.setId("P1020");
		prod.setName("Laptop");
		prod.setPrice(25897);
		prod.setDescription("DELL Laptop");
		
	//	dao.saveProduct(prod);
		
		for (Product product:dao.listAll()) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			System.out.println("-------------------------------");
		}
		System.out.println("...Done....");
	} 

}
