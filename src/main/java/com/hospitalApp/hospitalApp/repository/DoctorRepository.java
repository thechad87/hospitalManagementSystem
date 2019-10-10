package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.user.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository <Doctor, Integer> {
//    private String name;
//    private String surname;
}
