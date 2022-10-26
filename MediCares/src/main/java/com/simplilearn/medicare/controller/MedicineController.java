package com.simplilearn.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.Medicines;
import com.simplilearn.medicare.entity.Product;
import com.simplilearn.medicare.serviceImpl.MedicineService;

@RestController
public class MedicineController {
	
	@Autowired	
	MedicineService service;

	@GetMapping("/medicines")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Medicines> getAll(){
		
		System.out.println("success");
		return service.getAllMedicines();
}
}