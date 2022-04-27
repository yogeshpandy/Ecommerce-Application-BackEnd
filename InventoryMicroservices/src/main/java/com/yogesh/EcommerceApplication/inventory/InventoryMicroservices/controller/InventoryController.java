package com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.entity.Inventory;
import com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.repository.InventoryRepository;

@RestController
public class InventoryController {

	@Autowired
	private  InventoryRepository inventoryRepo;
	
	@PostMapping("/inventory")
	public Inventory createInventory(@RequestBody Inventory inventory) {
		System.out.println(inventory);
		return inventoryRepo.save(inventory);
	}

	@GetMapping("/inventory/{id}")
	public Inventory getInventoryById(@PathVariable String id) {
		return inventoryRepo.findById(id).get();
	}
	
	@GetMapping("/inventory/all")
	public List<Inventory> getAllInventory() {
		return inventoryRepo.findAll();
	}
	
	//Update inventory by Id
	@PutMapping("/inventory/{id}")
	public Inventory updateInventory(@PathVariable String id, @RequestBody Inventory newInventory) {
		Inventory inventory = inventoryRepo.findById(id).get();
		
		if(inventory.getProductName()!=null) {
			inventory.setProductName(newInventory.getProductName());
		}
		inventory.setProductName(newInventory.getProductName());
		if(newInventory.getVariantDetail()!=null) {
			inventory.setVariantDetail(newInventory.getVariantDetail());
		}
		return inventoryRepo.save(inventory);
	}
	
	@GetMapping
	public String welcome() {
		return "Welcome to INVENTORY.... Service REST API works";
	}
}
