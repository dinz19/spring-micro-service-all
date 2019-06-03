package com.cts.inventory.main.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.inventory.main.entity.Inventory;
import com.cts.inventory.main.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	private InventoryService invService;

@RequestMapping("/")
public String welcome() {
	return "welcome to inventory micro service";
}


@RequestMapping("/all")
public List<Inventory> getAllInventorys() {
	List<Inventory> invs = invService.getAllInventorys();
	return invs;
}


@RequestMapping(value = "/add", method = RequestMethod.POST)
public List<Inventory> addInventory(@RequestBody Inventory inven) {
	List<Inventory> invs  = invService.addInventory(inven);
	return invs;
}

@RequestMapping(value = "/inventbyprod", method = RequestMethod.GET)
public Inventory getIventoryByProductCode(@RequestParam(required = false, value = "prodCode") String prodCode) {
	Inventory invent = invService.getInventoryByProductCode(prodCode);
	return invent;
}


}
