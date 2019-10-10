package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationRepository extends JpaRepository <Operation, Integer> {


}
