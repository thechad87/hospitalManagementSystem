package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.PatientProgress;
import com.hospitalApp.hospitalApp.repository.PatientProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientProgressService {

//    private static PatientProgressService service = null;

    @Autowired
    private PatientProgressRepository repository;


    public List<PatientProgress> getAll() {
        return this.repository.findAll();
    }

    public PatientProgress create(PatientProgress patientProgress) {
        return this.repository.save(patientProgress);
    }

//    public PatientProgress update(PatientProgress patientProgress) {
//        return this.repository.save(patientProgress);
//    }


    public void update(int id, PatientProgress patientProgress) {
    repository.save(patientProgress);
}


    public PatientProgress read(int s) {
        Optional<PatientProgress> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
