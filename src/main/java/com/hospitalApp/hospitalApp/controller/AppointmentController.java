package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Appointment;
import com.hospitalApp.hospitalApp.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping("/create")
    @ResponseBody
    public Appointment create(@RequestBody Appointment visit) {
        return service.create(visit);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Appointment update(@RequestBody Appointment visit) {
//        return service.update(visit);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Appointment visit, @PathVariable int id){
        service.update(id, visit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Appointment read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Appointment> getAll() {
        return service.getAll();
    }
    
}
