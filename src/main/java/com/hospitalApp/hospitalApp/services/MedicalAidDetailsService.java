package com.hospitalApp.hospitalApp.services;


import com.hospitalApp.hospitalApp.model.MedicalAidDetails;
import com.hospitalApp.hospitalApp.repository.MedicalAidDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MedicalAidDetailsService {


//    private static MedicalAidDetailsService service = null;

    @Autowired
    private MedicalAidDetailsRepository repository;


    public List<MedicalAidDetails> getAll() {
        return this.repository.findAll();
    }

    public MedicalAidDetails create(MedicalAidDetails medicalAidDetails) {
        return this.repository.save(medicalAidDetails);
    }

//    public MedicalAidDetails update(MedicalAidDetails medicalAidDetails) {
//        return this.repository.save(medicalAidDetails);
//    }


    public void update(int id, MedicalAidDetails medicalAidDetails) {
    repository.save(medicalAidDetails);
}


    public MedicalAidDetails read(int s) {
        Optional<MedicalAidDetails> opt = this.repository.findById(s);
        return opt.orElse(null);
    }

    public void delete(int s) {
        this.repository.deleteById(s);
    }
}
