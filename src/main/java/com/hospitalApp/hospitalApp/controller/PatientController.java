package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.user.Patient;
import com.hospitalApp.hospitalApp.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/patient")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping("/create")
    @ResponseBody
    public Patient create(@RequestBody Patient visit) {
        return service.create(visit);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Patient update(@RequestBody Patient visit) {
//        return service.update(visit);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Patient visit, @PathVariable int id){
        service.update(id, visit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Patient read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Patient> getAll() {
        return service.getAll();
    }
    
}
