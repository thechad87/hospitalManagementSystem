package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Treatment;
import com.hospitalApp.hospitalApp.services.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/treatment")
public class TreatmentController {

    @Autowired
    private TreatmentService service;

    @PostMapping("/create")
    @ResponseBody
    public Treatment create(@RequestBody Treatment treatment) {
        return service.create(treatment);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Treatment update(@RequestBody Treatment treatment) {
//        return service.update(treatment);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Treatment treatment, @PathVariable int id){
        service.update(id, treatment);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Treatment read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Treatment> getAll() {
        return service.getAll();
    }
    
}
