package com.hospitalApp.hospitalApp.factory.user;


import com.hospitalApp.hospitalApp.misc.Misc;
import com.hospitalApp.hospitalApp.model.PersonalDetails;
import com.hospitalApp.hospitalApp.model.Specialist;
import com.hospitalApp.hospitalApp.model.user.Doctor;

public class DoctorFactory {
    
    public static Doctor buildDoctor(PersonalDetails personalDetails,Specialist specialist) {

        Doctor doctor = Doctor.builder()
                .doctorId(Misc.generateRandomId())
                .specialist(specialist)
                .personalDetails(personalDetails)
                .build();
        return doctor;
    }

//    private String name;
//    private String surname;
}


