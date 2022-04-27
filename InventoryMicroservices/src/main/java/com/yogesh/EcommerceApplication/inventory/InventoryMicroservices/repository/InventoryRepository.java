package com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.entity.Inventory;


public interface InventoryRepository extends MongoRepository<Inventory, String> {
	
}
