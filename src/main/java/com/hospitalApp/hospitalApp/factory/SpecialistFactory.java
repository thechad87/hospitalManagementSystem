package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Specialist;

public class SpecialistFactory {


    public static Specialist buildSpecialist(int specialistId,
                                           String specialistType, String specialistDescription) {

        Specialist specialist = Specialist.builder()
                .specialistId(specialistId)
                .specialistType(specialistType)
                .specialistDescription(specialistDescription)
                .build();
        return specialist;
    }

}
