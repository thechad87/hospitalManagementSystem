package com.hospitalApp.hospitalApp.repository;

import com.hospitalApp.hospitalApp.model.PatientProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@Repository
public interface PatientProgressRepository extends JpaRepository<PatientProgress, Integer> {

}
