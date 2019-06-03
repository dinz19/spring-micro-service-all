package com.cts.inventory.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.inventory.main.dao.InventoryDao;
import com.cts.inventory.main.entity.Inventory;

@Service("invService")
public class InventoryService {
	
	@Autowired
	private InventoryDao invDao;

	public List<Inventory> getAllInventorys() {
		List<Inventory>  invents = invDao.getAllInventories();
		return invents;
	}

	public List<Inventory> addInventory(Inventory inv) {
		List<Inventory>  invents = invDao.addInventory(inv);
		return invents;
	}

	public Inventory getInventoryByProductCode(String prodCode) {
		Inventory  invent = invDao.getInventoryByProductCode(prodCode);
		return invent;
	}

}
