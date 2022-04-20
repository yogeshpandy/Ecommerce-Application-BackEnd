package com.yogesh.EcommerceApplication.inventory.InventoryMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMicroservicesApplication.class, args);
		System.out.println("Spring Boot Inventory Server MS");
	}

}
