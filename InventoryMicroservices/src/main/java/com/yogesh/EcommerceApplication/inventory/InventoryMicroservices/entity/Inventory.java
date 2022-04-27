package com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.entity;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document("inventory")
public class Inventory {

	@Id
	private String id;
	private String productId;
	private String productName;
	private ArrayList<StockDetail> variantDetail;
	
}
