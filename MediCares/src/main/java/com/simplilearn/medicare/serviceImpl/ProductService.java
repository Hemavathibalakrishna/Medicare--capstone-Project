package com.simplilearn.medicare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.medicare.entity.Product;
import com.simplilearn.medicare.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	public Product findByProductId(int productId) {
		return repo.findBypId(productId);
		
	}

}
