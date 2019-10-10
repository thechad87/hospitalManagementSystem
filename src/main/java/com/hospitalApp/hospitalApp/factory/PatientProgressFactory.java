package com.hospitalApp.hospitalApp.factory;

import com.hospitalApp.hospitalApp.model.Diagnosis;
import com.hospitalApp.hospitalApp.model.PatientProgress;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
public class PatientProgressFactory {


    public static PatientProgress buildPatientProgress(int patientProgressId,
                                                 String patientDescription, Diagnosis diagnosis) {

        PatientProgress patientProgress = PatientProgress.builder()
                .patientProgressId(patientProgressId)
                .patientDescription(patientDescription)
                .diagnosis(diagnosis)
                .build();
        return patientProgress;
    }

}
