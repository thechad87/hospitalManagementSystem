package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Admission;
import com.hospitalApp.hospitalApp.services.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/admission")
public class AdmissionController {

    @Autowired
    private AdmissionService service;

    @PostMapping("/create")
    @ResponseBody
    public Admission create(@RequestBody Admission admission) {
        return service.create(admission);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Admission update(@RequestBody Admission admission) {
//        return service.update(admission);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Admission admission, @PathVariable int id){
        service.update(id, admission);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Admission read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Admission> getAll() {
        return service.getAll();
    }
    
}
