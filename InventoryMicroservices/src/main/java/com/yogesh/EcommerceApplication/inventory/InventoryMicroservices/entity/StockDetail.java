package com.yogesh.EcommerceApplication.inventory.InventoryMicroservices.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StockDetail {
	private String variantName;
	private Long variantPrice;
	private int quantity;
	
}
