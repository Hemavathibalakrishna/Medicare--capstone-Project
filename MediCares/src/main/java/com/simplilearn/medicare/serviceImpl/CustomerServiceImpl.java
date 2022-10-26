package com.simplilearn.medicare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.medicare.entity.Customer;
import com.simplilearn.medicare.repository.CustomerRepo;
import com.simplilearn.medicare.service.CustomerServices;

@Service
public class CustomerServiceImpl implements CustomerServices {
	
	@Autowired
	CustomerRepo repo;
	
	@Override
	public Customer saveCustomer(Customer c) {
		return repo.save(c);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
