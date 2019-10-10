package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentRepository extends JpaRepository <Appointment, Integer> {
    }


