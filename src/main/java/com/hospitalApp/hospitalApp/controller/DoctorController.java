package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.user.Doctor;
import com.hospitalApp.hospitalApp.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/doctor")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping("/create")
    @ResponseBody
    public Doctor create(@RequestBody Doctor visit) {
        return service.create(visit);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Doctor update(@RequestBody Doctor visit) {
//        return service.update(visit);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Doctor visit, @PathVariable int id){
        service.update(id, visit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Doctor read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Doctor> getAll() {
        return service.getAll();
    }
    
}
