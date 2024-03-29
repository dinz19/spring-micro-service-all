package com.cts.inventory.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.inventory.main.entity.Inventory;
import com.cts.inventory.main.repository.InventoryRepository;

@Repository("inventoryDao")
public class InventoryDao {
@Autowired
	private InventoryRepository invRepo;
	
public List<Inventory> getAllInventories() {
	return invRepo.findAll();
}

public List<Inventory> addInventory(Inventory inv) {
	 invRepo.save(inv);
	 return invRepo.findAll();
	
}

public Inventory getInventoryByProductCode(String prodCode){
	return  invRepo.findByProductCode(prodCode);
}
}
