package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Treatment;

public class TreatmentFactory {

    public static Treatment buildTreatment(int treatmentId,
                                           String treatmentType, String treatmentDescription, String treatmentPeriod) {

        Treatment treatment = Treatment.builder()
                .treatmentId(treatmentId)
                .treatmentType(treatmentType)
                .treatmentDescription(treatmentDescription)
                .treatmentPeriod(treatmentPeriod)
                .build();
        return treatment;
    }
}
