package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.medicare.entity.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem, Integer>{

}
