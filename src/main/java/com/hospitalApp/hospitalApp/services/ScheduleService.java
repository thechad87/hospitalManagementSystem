package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.Schedule;
import com.hospitalApp.hospitalApp.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ScheduleService {


//    private static ScheduleService service = null;

    @Autowired
    private ScheduleRepository repository;


    public List<Schedule> getAll() {
        return this.repository.findAll();
    }

    public Schedule create(Schedule schedule) {
        return this.repository.save(schedule);
    }

//    public Schedule update(Schedule schedule) {
//        return this.repository.save(schedule);
//    }


    public void update(int id, Schedule schedule) {
    repository.save(schedule);
}


    public Schedule read(int s) {
        Optional<Schedule> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
