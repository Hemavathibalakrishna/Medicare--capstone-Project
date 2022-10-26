package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.medicare.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, String>{

	

	Admin findByadminId(int adminId);

}
