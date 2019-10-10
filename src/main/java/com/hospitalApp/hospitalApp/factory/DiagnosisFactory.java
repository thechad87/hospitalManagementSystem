package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Diagnosis;


public class DiagnosisFactory {

    public static Diagnosis buildDiagnosis(int diagnosisId,
         String diagnosisType, String diagnosisDescription) {

        Diagnosis diagnosis = Diagnosis.builder()
                .diagnosisId(diagnosisId)
                .diagnosisType(diagnosisType)
                .diagnosisDescription(diagnosisDescription)
//                .doctor(doctor)
                .build();
        return diagnosis;
    }
}
