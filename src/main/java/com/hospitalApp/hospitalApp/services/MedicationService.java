package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Medication;
import com.hospitalApp.hospitalApp.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MedicationService {


//    private static MedicationService service = null;

    @Autowired
    private MedicationRepository repository;


    public List<Medication> getAll() {
        return this.repository.findAll();
    }

    public Medication create(Medication medication) {
        return this.repository.save(medication);
    }

//    public Medication update(Medication medication) {
//        return this.repository.save(medication);
//    }


    public void update(int id, Medication medication) {
    repository.save(medication);
}


    public Medication read(int s) {
        Optional<Medication> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
