package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VisitRepository extends JpaRepository <Visit, Integer> {

}
