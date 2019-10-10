package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Appointment;
import com.hospitalApp.hospitalApp.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AppointmentService {


//    private static AppointmentService service = null;

    @Autowired
    private AppointmentRepository repository;


    public List<Appointment> getAll() {
        return this.repository.findAll();
    }

    public Appointment create(Appointment appointment) {
        return this.repository.save(appointment);
    }

//    public Appointment update(Appointment appointment) {
//        return this.repository.save(appointment);
//    }


    public void update(int id, Appointment appointment) {
    repository.save(appointment);
}


    public Appointment read(int s) {
        Optional<Appointment> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
