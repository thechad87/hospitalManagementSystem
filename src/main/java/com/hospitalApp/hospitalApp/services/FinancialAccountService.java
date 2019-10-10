package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.FinancialAccount;
import com.hospitalApp.hospitalApp.repository.FinancialAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FinancialAccountService {


//    private static FinancialAccountService service = null;

    @Autowired
    private FinancialAccountRepository repository;


    public List<FinancialAccount> getAll() {
        return this.repository.findAll();
    }

    public FinancialAccount create(FinancialAccount financialAccount) {
        return this.repository.save(financialAccount);
    }

//    public FinancialAccount update(FinancialAccount financialAccount) {
//        return this.repository.save(financialAccount);
//    }


    public void update(int id, FinancialAccount financialAccount) {
    repository.save(financialAccount);
}


    public FinancialAccount read(int s) {
        Optional<FinancialAccount> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
