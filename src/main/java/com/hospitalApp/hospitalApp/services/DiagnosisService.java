package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Diagnosis;
import com.hospitalApp.hospitalApp.repository.DiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DiagnosisService {


//    private static DiagnosisService service = null;

    @Autowired
    private DiagnosisRepository repository;


    public List<Diagnosis> getAll() {
        return this.repository.findAll();
    }

    public Diagnosis create(Diagnosis diagnosis) {
        return this.repository.save(diagnosis);
    }

//    public Diagnosis update(Diagnosis diagnosis) {
//        return this.repository.save(diagnosis);
//    }


    public void update(int id, Diagnosis diagnosis) {
    repository.save(diagnosis);
}


    public Diagnosis read(int s) {
        Optional<Diagnosis> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
