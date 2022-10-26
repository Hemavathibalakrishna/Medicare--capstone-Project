package com.simplilearn.medicare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.User;
import com.simplilearn.medicare.serviceImpl.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService service;

	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		User userObj = null;
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			userObj = service.fetchUserByEmailId(tempEmailId);
			if (userObj != null) {
				throw new Exception("User already exist");
			} else
				userObj = service.saveUser(user);

		}

		return userObj;

	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPasswprd = user.getPassword();
		System.out.println(tempEmailId);
		System.out.println(tempPasswprd);

		User usersObj = null;
		if (tempEmailId != null && tempPasswprd != null) {
			usersObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPasswprd);

		}

		if (usersObj == null) {
			throw new Exception("Wrong credentials");

		} else {
			usersObj.setLoginSuccessful(true);

		}
		return usersObj;
	}
}
