package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.user.Doctor;
import com.hospitalApp.hospitalApp.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DoctorService {


//    private static DoctorService service = null;

    @Autowired
    private DoctorRepository repository;


    public List<Doctor> getAll() {
        return this.repository.findAll();
    }

    public Doctor create(Doctor doctor) {
        return this.repository.save(doctor);
    }

//    public Doctor update(Doctor doctor) {
//        return this.repository.save(doctor);
//    }


    public void update(int id, Doctor doctor) {
    repository.save(doctor);
}


    public Doctor read(int s) {
        Optional<Doctor> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
