package com.simplilearn.medicare.service;

import java.util.List;

import com.simplilearn.medicare.entity.Customer;

public interface CustomerServices {
	
	public Customer saveCustomer(Customer c);
    public List<Customer> getAllCustomers();
    public Customer updateCustomer(Customer c);
	public void deleteCustomer(int d);
    public Customer getCustomerById(int id);

	
	
}
