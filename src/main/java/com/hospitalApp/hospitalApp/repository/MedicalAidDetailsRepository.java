package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.MedicalAidDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicalAidDetailsRepository extends JpaRepository <MedicalAidDetails, Integer> {

}
