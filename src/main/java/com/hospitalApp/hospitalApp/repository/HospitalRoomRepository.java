package com.hospitalApp.hospitalApp.repository;


import com.hospitalApp.hospitalApp.model.HospitalRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HospitalRoomRepository extends JpaRepository <HospitalRoom, Integer> {

}
