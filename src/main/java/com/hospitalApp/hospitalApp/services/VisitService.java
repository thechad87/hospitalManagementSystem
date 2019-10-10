package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Visit;
import com.hospitalApp.hospitalApp.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VisitService  {


//    private static VisitService service = null;

    @Autowired
    private VisitRepository repository;


    public List<Visit> getAll() {
        return this.repository.findAll();
    }

    public Visit create(Visit visit) {
        return this.repository.save(visit);
    }

//    public Visit update(Visit visit) {
//        return this.repository.save(visit);
//    }


    public void update(int id, Visit visit) {
    repository.save(visit);
}


    public Visit read(int s) {
        Optional<Visit> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
