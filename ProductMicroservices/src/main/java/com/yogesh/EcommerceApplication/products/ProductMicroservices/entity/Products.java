package com.yogesh.EcommerceApplication.products.ProductMicroservices.entity;

//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

//import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Document("products")
public class Products {
	
	 @Id
     private String id;
	 private String category;
	 private String brand;
     private String name;
     private long basePrice;
     private String description;
     private List<String> option;
     private Map<String, Long> variantPrice;
//	   List<Map<OptionX, ArrayList<Map<price, quantity>>>>  option
//     private Map<String, Integer> optionX;//color
//     private Map<String, Integer> optionY;//size
//     private ArrayList<ArrayList<Integer>> variantPrice;
//     private List<Map<String, ArrayList<Map<Integer, Integer>>>> option1;
     /*
      * Options
      * 	Color -> red blue orange
      * 	Size  -> xl, xxl, xxxl
      */
     private int ratings;
     private List<Review> reviews;// like, dislike, review, customerName
	
     public Products(String id, String category, String brand, String name, long basePrice, String description, List<String> option,
			Map<String, Long> variantPrice, int ratings, List<Review> reviews) {
		super();
		this.id = id;
		this.category=category;
		this.brand=brand;
		this.name = name;
		this.basePrice=basePrice;
		this.description = description;
		this.option = option;
		this.variantPrice = variantPrice;
		this.ratings = ratings;
		this.reviews = reviews;
	}
     
     
     
}
