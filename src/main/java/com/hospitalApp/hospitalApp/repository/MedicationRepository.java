package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicationRepository extends JpaRepository <Medication, Integer> {

}
