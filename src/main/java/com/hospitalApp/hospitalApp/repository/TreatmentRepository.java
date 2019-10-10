package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TreatmentRepository extends JpaRepository <Treatment, Integer> {

}
