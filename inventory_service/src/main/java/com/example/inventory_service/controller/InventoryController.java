package com.example.inventory_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory_service.model.Inventory;



@RestController
public class InventoryController {

	List<Inventory> inventoryList = new ArrayList<Inventory>();
	
	@GetMapping(path = "/inventory/{productId}")
	public Inventory getInventoryDetails(@PathVariable("productId") Long productId) {
		//Get name and description from product_service
		Inventory inventory = getInventoryInfo(productId);
		
		
		return inventory;
	}
	
	
	private Inventory getInventoryInfo(Long productId) {
		populateInventoryList();
		
		for(Inventory i : inventoryList) {
			if(productId.equals(i.getProductId())) {
				return i;
			}
		}
		
		return null;
	}


	private void populateInventoryList() {
		inventoryList.add(new Inventory(1521,101,true));
		inventoryList.add(new Inventory(1522,102,false));
		inventoryList.add(new Inventory(1523,103,true));
		inventoryList.add(new Inventory(1524,104,true));
		
	}
}
