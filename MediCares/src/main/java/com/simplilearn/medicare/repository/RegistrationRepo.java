package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.User;

@Repository
public interface RegistrationRepo extends JpaRepository<User, Integer>{

	User findByEmailId(String email);

	User findByEmailIdAndPassword(String email, String password);

}
