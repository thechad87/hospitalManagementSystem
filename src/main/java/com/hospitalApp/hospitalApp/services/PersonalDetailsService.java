package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.PersonalDetails;
import com.hospitalApp.hospitalApp.repository.PersonalDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonalDetailsService {


//    private static PersonalDetailsService service = null;

    @Autowired
    private PersonalDetailsRepository repository;


    public List<PersonalDetails> getAll() {
        return this.repository.findAll();
    }

    public PersonalDetails create(PersonalDetails personalDetails) {
        return this.repository.save(personalDetails);
    }

//    public PersonalDetails update(PersonalDetails personalDetails) {
//        return this.repository.save(personalDetails);
//    }


    public void update(int id, PersonalDetails personalDetails) {
    repository.save(personalDetails);
}


    public PersonalDetails read(int s) {
        Optional<PersonalDetails> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
