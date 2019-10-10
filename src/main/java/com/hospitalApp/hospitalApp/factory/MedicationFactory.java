package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Medication;


public class MedicationFactory {

    public static Medication buildMedication(int medicationId,
                                           String medicationType, String medicationQuantity, String medicationDescription) {

        Medication medication = Medication.builder()
                .medicationId(medicationId)
                .medicationType(medicationType)
                .medicationQuantity(medicationQuantity)
                .medicationDescription(medicationDescription)
                .build();
        return medication;
    }
}
