package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Admission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdmissionRepository extends JpaRepository <Admission, Integer> {

}
