package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.user.Patient;
import com.hospitalApp.hospitalApp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientService {


//    private static PatientService service = null;

    @Autowired
    private PatientRepository repository;


    public List<Patient> getAll() {
        return this.repository.findAll();
    }

    public Patient create(Patient patient) {
        return this.repository.save(patient);
    }

//    public Patient update(Patient patient) {
//        return this.repository.save(patient);
//    }


    public void update(int id, Patient patient) {
    repository.save(patient);
}


    public Patient read(int s) {
        Optional<Patient> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
