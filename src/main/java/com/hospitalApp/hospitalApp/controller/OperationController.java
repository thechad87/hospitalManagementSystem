package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Operation;
import com.hospitalApp.hospitalApp.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/operation")
public class OperationController {

    @Autowired
    private OperationService service;

    @PostMapping("/create")
    @ResponseBody
    public Operation create(@RequestBody Operation operation) {
        return service.create(operation);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Operation update(@RequestBody Operation operation) {
//        return service.update(operation);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Operation operation, @PathVariable int id){
        service.update(id, operation);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Operation read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Operation> getAll() {
        return service.getAll();
    }
    
}
