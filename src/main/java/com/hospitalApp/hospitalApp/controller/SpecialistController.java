package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Specialist;
import com.hospitalApp.hospitalApp.services.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/specialist")
public class SpecialistController {

    @Autowired
    private SpecialistService service;

    @PostMapping("/create")
    @ResponseBody
    public Specialist create(@RequestBody Specialist specialist) {
        return service.create(specialist);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Specialist update(@RequestBody Specialist specialist) {
//        return service.update(specialist);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Specialist specialist, @PathVariable int id){
        service.update(id, specialist);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Specialist read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Specialist> getAll() {
        return service.getAll();
    }
    
}
