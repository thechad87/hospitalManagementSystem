package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.Schedule;
import com.hospitalApp.hospitalApp.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @PostMapping("/create")
    @ResponseBody
    public Schedule create(@RequestBody Schedule schedule) {
        return service.create(schedule);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public Schedule update(@RequestBody Schedule schedule) {
//        return service.update(schedule);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  Schedule schedule, @PathVariable int id){
        service.update(id, schedule);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Schedule read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Schedule> getAll() {
        return service.getAll();
    }
    
}
