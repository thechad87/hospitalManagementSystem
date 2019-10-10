package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.PatientProgress;
import com.hospitalApp.hospitalApp.services.PatientProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/patientProgress")
public class PatientProgressController {

    @Autowired
    private PatientProgressService service;

    @PostMapping("/create")
    @ResponseBody
    public PatientProgress create(@RequestBody PatientProgress patientProgress) {
        return service.create(patientProgress);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public PatientProgress update(@RequestBody PatientProgress patientProgress) {
//        return service.update(patientProgress);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  PatientProgress patientProgress, @PathVariable int id){
        service.update(id, patientProgress);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientProgress read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<PatientProgress> getAll() {
        return service.getAll();
    }
    
}
