package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.user.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Integer> {

//    private String patientName;
//    private String patientSurname;

}
