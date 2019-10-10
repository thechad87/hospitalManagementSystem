package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Specialist;
import com.hospitalApp.hospitalApp.repository.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SpecialistService {


//    private static SpecialistService service = null;

    @Autowired
    private SpecialistRepository repository;


    public List<Specialist> getAll() {
        return this.repository.findAll();
    }

    public Specialist create(Specialist specialist) {
        return this.repository.save(specialist);
    }

//    public Specialist update(Specialist specialist) {
//        return this.repository.save(specialist);
//    }


    public void update(int id, Specialist specialist) {
    repository.save(specialist);
}


    public Specialist read(int s) {
        Optional<Specialist> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
