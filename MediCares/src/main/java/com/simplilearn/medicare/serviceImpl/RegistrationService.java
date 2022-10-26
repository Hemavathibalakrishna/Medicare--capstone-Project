package com.simplilearn.medicare.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.medicare.entity.User;
import com.simplilearn.medicare.repository.RegistrationRepo;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepo repo;
	
	public User saveUser(User user)
	{
		return repo.save(user);
	}

	public User fetchUserByEmailId(String email) {
		
		return repo.findByEmailId(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		
		return repo.findByEmailIdAndPassword(email,password);
	}
	
}
