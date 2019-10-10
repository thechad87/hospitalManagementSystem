package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.HospitalRoom;
import com.hospitalApp.hospitalApp.repository.HospitalRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class HospitalRoomService {


//    private static HospitalRoomService service = null;

    @Autowired
    private HospitalRoomRepository repository;


    public List<HospitalRoom> getAll() {
        return this.repository.findAll();
    }

    public HospitalRoom create(HospitalRoom hospitalRoom) {
        return this.repository.save(hospitalRoom);
    }

//    public HospitalRoom update(HospitalRoom hospitalRoom) {
//        return this.repository.save(hospitalRoom);
//    }


    public void update(int id, HospitalRoom hospitalRoom) {
    repository.save(hospitalRoom);
}


    public HospitalRoom read(int s) {
        Optional<HospitalRoom> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
