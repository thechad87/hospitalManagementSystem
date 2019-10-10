package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.HospitalRoom;
import com.hospitalApp.hospitalApp.services.HospitalRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/hospitalRoom")
public class HospitalRoomController {

    @Autowired
    private HospitalRoomService service;

    @PostMapping("/create")
    @ResponseBody
    public HospitalRoom create(@RequestBody HospitalRoom hospitalRoom) {
        return service.create(hospitalRoom);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public HospitalRoom update(@RequestBody HospitalRoom hospitalRoom) {
//        return service.update(hospitalRoom);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  HospitalRoom hospitalRoom, @PathVariable int id){
        service.update(id, hospitalRoom);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public HospitalRoom read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<HospitalRoom> getAll() {
        return service.getAll();
    }
    
}
