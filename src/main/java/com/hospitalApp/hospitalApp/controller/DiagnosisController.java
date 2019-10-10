package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Diagnosis;
import com.hospitalApp.hospitalApp.services.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/diagnosis")
public class DiagnosisController {

    @Autowired
    private DiagnosisService service;

    @PostMapping("/create")
    @ResponseBody
    public Diagnosis create(@RequestBody Diagnosis diagnosis) {
        return service.create(diagnosis);
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Diagnosis diagnosis, @PathVariable int id){
        service.update(id, diagnosis);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Diagnosis read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Diagnosis> getAll() {
        return service.getAll();
    }
    
}
