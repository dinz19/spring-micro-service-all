package com.cts.product.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String price;
	
	@Column
	private Boolean stockStatus;
	
	@Column
	private String productCode;

	/*
	 * public long getId() { return id; }
	 * 
	 * public void setId(long id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getPrice() { return price; }
	 * 
	 * public void setPrice(String price) { this.price = price; }
	 * 
	 * public boolean isStockStatus() { return stockStatus; }
	 * 
	 * public void setStockStatus(boolean stockStatus) { this.stockStatus =
	 * stockStatus; }
	 * 
	 * public Product(long id, String name, String price, boolean stockStatus) {
	 * super(); this.id = id; this.name = name; this.price = price; this.stockStatus
	 * = stockStatus; }
	 * 
	 * public Product() { super();
	 * 
	 * }
	 */
	
	

}
