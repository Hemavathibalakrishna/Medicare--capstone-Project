package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Medicines;

@Repository
public interface MedicineRepo extends JpaRepository<Medicines, String> {

}
