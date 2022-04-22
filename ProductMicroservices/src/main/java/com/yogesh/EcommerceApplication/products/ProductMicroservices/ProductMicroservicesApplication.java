package com.yogesh.EcommerceApplication.products.ProductMicroservices;

//import java.util.ArrayList;
//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//import com.yogesh.EcommerceApplication.products.ProductMicroservices.entity.Products;
//import com.yogesh.EcommerceApplication.products.ProductMicroservices.repository.ProductRepository;

@SpringBootApplication
@EnableMongoRepositories
public class ProductMicroservicesApplication {
//	public class ProductMicroservicesApplication implements CommandLineRunner {
	
//	@Autowired
//    ProductRepository productItemRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductMicroservicesApplication.class, args);
		System.out.println("Spring Boot Product Server MS");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		productItemRepo.deleteAll();
//		
//		System.out.println("-------------CREATE GROCERY ITEMS-------------------------------\n");
//		
//		createProducts();
//		
//		System.out.println("\n----------------SHOW ALL GROCERY ITEMS---------------------------\n");
//		
//		showAllGroceryItems();
//	}
//	
//	// CRUD operations
//
//		//CREATE
//		void createProducts() {
//			System.out.println("Data creation started...");
//
//			productItemRepo.save(new Products("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
//			productItemRepo.save(new Products("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
//			productItemRepo.save(new Products("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
//			productItemRepo.save(new Products("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
//			productItemRepo.save(new Products("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
//			
//			System.out.println("Data creation complete...");
//		}
//		
//		// READ
//		// 1. Show all the data
//		List<Products> itemList = new ArrayList<Products>();
//		
//		 public void showAllGroceryItems() {
//			 
//			 itemList = productItemRepo.findAll();
//			 
//			 itemList.forEach(item -> System.out.println(getItemDetails(item)));
//		 }
//		 
////		 // 2. Get item by name
////		 public void getProductsByName(String name) {
////			 System.out.println("Getting item by name: " + name);
////			 Products item = productItemRepo.findItemByName(name);
////			 System.out.println(getItemDetails(item));
////		 }
//		 
//		 public String getItemDetails(Products item) {
//
//			 System.out.println(
//			 "Item Name: " + item.getName() + 
//			 ", \nItem Quantity: " + item.getQuantity() + 
//			 ", \nItem Category: " + item.getCategory()
//			 );
//			 
//			 return "";
//		 }
}
