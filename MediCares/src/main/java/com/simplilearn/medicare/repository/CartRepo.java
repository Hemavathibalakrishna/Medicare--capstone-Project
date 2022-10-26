package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Cart;
import com.simplilearn.medicare.entity.Product;
import com.simplilearn.medicare.entity.User;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer>{

	 Cart findByUser(User user);
	

}
