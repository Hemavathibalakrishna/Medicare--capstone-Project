package com.simplilearn.medicare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.Admin;
import com.simplilearn.medicare.repository.AdminRepo;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminRepo repo;
	
	@PostMapping("/login")
	public ResponseEntity<?> adminLogin(@RequestBody Admin admindata)
	{
		Admin admin=repo.findByadminId(admindata.getAdminId());
		if(admin.getAdminPassword().equals(admindata.getAdminPassword()))
		return ResponseEntity.ok(admin);
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}

}
