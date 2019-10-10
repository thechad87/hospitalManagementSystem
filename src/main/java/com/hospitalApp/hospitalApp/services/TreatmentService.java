package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Treatment;
import com.hospitalApp.hospitalApp.repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TreatmentService {


//    private static TreatmentService service = null;

    @Autowired
    private TreatmentRepository repository;


    public List<Treatment> getAll() {
        return this.repository.findAll();
    }

    public Treatment create(Treatment treatment) {
        return this.repository.save(treatment);
    }

//    public Treatment update(Treatment treatment) {
//        return this.repository.save(treatment);
//    }


    public void update(int id, Treatment treatment) {
    repository.save(treatment);
}


    public Treatment read(int s) {
        Optional<Treatment> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
