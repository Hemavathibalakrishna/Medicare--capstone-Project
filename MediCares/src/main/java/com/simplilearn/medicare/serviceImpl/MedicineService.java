package com.simplilearn.medicare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.medicare.entity.Medicines;
import com.simplilearn.medicare.entity.Product;
import com.simplilearn.medicare.repository.MedicineRepo;

@Service
public class MedicineService {
	
	@Autowired
	MedicineRepo repo;
	
public List<Medicines> getAllMedicines() {
		
		return repo.findAll();
	
	

}
}
