package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonalDetailsRepository extends JpaRepository <PersonalDetails, Integer> {
}
