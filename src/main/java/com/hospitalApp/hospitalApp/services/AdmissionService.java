package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Admission;
import com.hospitalApp.hospitalApp.repository.AdmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdmissionService {


//    private static AdmissionService service = null;

    @Autowired
    private AdmissionRepository repository;


    public List<Admission> getAll() {
        return this.repository.findAll();
    }

    public Admission create(Admission admission) {
        return this.repository.save(admission);
    }

//    public Admission update(Admission admission) {
//        return this.repository.save(admission);
//    }


    public void update(int id, Admission admission) {
    repository.save(admission);
}


    public Admission read(int s) {
        Optional<Admission> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
