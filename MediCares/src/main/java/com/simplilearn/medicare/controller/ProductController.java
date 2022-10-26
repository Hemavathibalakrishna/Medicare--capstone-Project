package com.simplilearn.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.Product;
import com.simplilearn.medicare.serviceImpl.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> getAll(){
		
		System.out.println("success");
		return service.getAllProducts();
	
	}

}
