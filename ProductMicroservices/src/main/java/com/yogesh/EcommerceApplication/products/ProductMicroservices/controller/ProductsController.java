package com.yogesh.EcommerceApplication.products.ProductMicroservices.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.EcommerceApplication.products.ProductMicroservices.entity.Products;
import com.yogesh.EcommerceApplication.products.ProductMicroservices.repository.ProductRepository;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductRepository productsRepo;
	
	//Add a Product to Database
	@PostMapping("/add")
	public Products addProduct(@RequestBody Products product) {
		System.out.println(product);
		return productsRepo.save(product);
	}	
	
	//Retrieve Product by ID
	@GetMapping("/products/{id}")
	public Optional<Products> findProductById(@PathVariable String id) {
		return productsRepo.findById(id);
	}
	
	//Retrieve Product by Name
	@GetMapping("/products/name/{name}")
	public Set<Products> findProductByName(@PathVariable String name) {
		List<Products> start = productsRepo.findByNameStartingWith(name);
		List<Products> end = productsRepo.findByNameEndingWith(name);
		Set<Products> byName = new HashSet<Products>();
		for(Products pdt: start) {
			byName.add(pdt);
		}
		for(Products pdt: end) {
			byName.add(pdt);
		}
		return byName;
	}
	
	
	//Retrieve Product by Brand
	@GetMapping("/products/brand/{brand}")
	public List<Products> findProductByBrand(@PathVariable String brand) {
		System.out.println("Name "+ brand);
		List<Products> byBrand = productsRepo.findProductsByBrand(brand);
		return byBrand;
	}
	
	//Retrieve Product by Category
	@GetMapping("/products/category/{category}")
	public List<Products> findProductByCategory(@PathVariable String category) {
		System.out.println("findProductByCategory "+ category);
		return productsRepo.findProductsByCategory(category);
	}
		
	//Retrieve All Products from Database
	@GetMapping("/products")
	public List<Products> getAllProducts() {
		return productsRepo.findAll();
	}
	
	//Delete a product by ID
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable String id) {
		 productsRepo.deleteById(id);
		 return;
	}
}
