package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Medication;
import com.hospitalApp.hospitalApp.services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/medication")
public class MedicationController {

    @Autowired
    private MedicationService service;

    @PostMapping("/create")
    @ResponseBody
    public Medication create(@RequestBody Medication visit) {
        return service.create(visit);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Medication update(@RequestBody Medication visit) {
//        return service.update(visit);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Medication visit, @PathVariable int id){
        service.update(id, visit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Medication read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Medication> getAll() {
        return service.getAll();
    }
    
}
