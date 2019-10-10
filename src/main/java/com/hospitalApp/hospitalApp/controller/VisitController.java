package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Visit;
import com.hospitalApp.hospitalApp.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/visit")
public class VisitController {

    @Autowired
    private VisitService service;

    @PostMapping("/create")
    @ResponseBody
    public Visit create(@RequestBody Visit visit) {
        return service.create(visit);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Visit update(@RequestBody Visit visit) {
//        return service.update(visit);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Visit visit, @PathVariable int id){
        service.update(id, visit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Visit read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Visit> getAll() {
        return service.getAll();
    }
    
}
