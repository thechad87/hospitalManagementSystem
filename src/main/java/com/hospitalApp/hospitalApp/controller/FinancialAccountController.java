package com.hospitalApp.hospitalApp.controller;

import com.hospitalApp.hospitalApp.model.FinancialAccount;
import com.hospitalApp.hospitalApp.services.FinancialAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
@RestController
@RequestMapping("/hms/financialAccount")
public class FinancialAccountController {

    @Autowired
    private FinancialAccountService service;

    @PostMapping("/create")
    @ResponseBody
    public FinancialAccount create(@RequestBody FinancialAccount financialAccount) {
        return service.create(financialAccount);
    }

//    @PutMapping("/update")
//    @ResponseBody
//    public FinancialAccount update(@RequestBody FinancialAccount financialAccount) {
//        return service.update(financialAccount);
//    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody  FinancialAccount financialAccount, @PathVariable int id){
        service.update(id, financialAccount);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public FinancialAccount read(@PathVariable int id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<FinancialAccount> getAll() {
        return service.getAll();
    }
    
}
