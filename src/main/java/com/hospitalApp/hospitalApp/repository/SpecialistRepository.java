package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecialistRepository extends JpaRepository <Specialist, Integer> {

}
