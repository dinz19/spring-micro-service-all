package com.cts.inventory.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.inventory.main.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	Inventory findByProductCode(String prodCode);
	

}
