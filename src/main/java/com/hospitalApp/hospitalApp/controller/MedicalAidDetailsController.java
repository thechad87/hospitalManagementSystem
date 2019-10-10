package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.MedicalAidDetails;
import com.hospitalApp.hospitalApp.services.MedicalAidDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/medicalAidDetails")
public class MedicalAidDetailsController {

    @Autowired
    private MedicalAidDetailsService service;

    @PostMapping("/create")
    @ResponseBody
    public MedicalAidDetails create(@RequestBody MedicalAidDetails visit) {
        return service.create(visit);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public MedicalAidDetails update(@RequestBody MedicalAidDetails visit) {
//        return service.update(visit);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  MedicalAidDetails visit, @PathVariable int id){
        service.update(id, visit);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MedicalAidDetails read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<MedicalAidDetails> getAll() {
        return service.getAll();
    }
    
}
