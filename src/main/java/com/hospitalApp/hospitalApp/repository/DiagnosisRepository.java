package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DiagnosisRepository extends JpaRepository <Diagnosis, Integer> {

}
