package com.yogesh.EcommerceApplication.products.ProductMicroservices.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {
	int likes;
	int dislike;
	String customerName;
	String review;
	
}
