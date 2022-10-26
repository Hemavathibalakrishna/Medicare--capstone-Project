package com.simplilearn.medicare.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.Customer;
import com.simplilearn.medicare.service.CustomerServices;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServices service;
	
	@PostMapping("")

	public ResponseEntity<Object> saveCustomer(@RequestBody Customer cust){
	
	Customer resp=service.saveCustomer(cust);
	if(resp!=null)
		return new ResponseEntity<>(resp,HttpStatus.CREATED);
	else
		return new ResponseEntity<>("Error while creating object",HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
}
