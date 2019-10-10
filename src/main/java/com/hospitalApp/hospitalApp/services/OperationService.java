package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Operation;
import com.hospitalApp.hospitalApp.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OperationService {


//    private static OperationService service = null;

    @Autowired
    private OperationRepository repository;


    public List<Operation> getAll() {
        return this.repository.findAll();
    }

    public Operation create(Operation operation) {
        return this.repository.save(operation);
    }

//    public Operation update(Operation operation) {
//        return this.repository.save(operation);
//    }


    public void update(int id, Operation operation) {
    repository.save(operation);
}


    public Operation read(int s) {
        Optional<Operation> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
