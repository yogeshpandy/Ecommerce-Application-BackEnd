package com.yogesh.EcommerceApplication.products.ProductMicroservices.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Query;

import com.yogesh.EcommerceApplication.products.ProductMicroservices.entity.Products;

public interface ProductRepository extends MongoRepository<Products, String> {

	@Query("{ 'category' : ?0 }")
	List<Products> findProductsByCategory(String category);

	@Query("{ 'name' : ?0 }")
	List<Products> findProductsByName(String name);
	
	@Query("{ 'brand' : ?0 }")
	List<Products> findProductsByBrand(String brand);

	List<Products> findByNameStartingWith(String string);

	List<Products> findByNameEndingWith(String name);
		
//		@Query("{name:'?0'}")
//	    Products findItemByName(String name);
//	    
//	    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
//	    List<Products> findAll(String category);
//	    
//	    public long count();
}
