package com.hospitalApp.hospitalApp.factory.user;


import com.hospitalApp.hospitalApp.misc.Misc;
import com.hospitalApp.hospitalApp.model.*;
import com.hospitalApp.hospitalApp.model.user.Patient;
//import java.util.List;

public class PatientFactory {

    public static Patient buildPatient(PatientProgress patientProgress,
                                       Operation operation, PersonalDetails personalDetails,
                                       Diagnosis diagnosis, Medication medication) {

        Patient patient = Patient.builder()
                .patientId(Misc.generateRandomId())
                .medications(medication)
                .operation(operation)
                .patientProgress(patientProgress)
                .personalDetails(personalDetails)
                .diagnosis(diagnosis)
                .build();
        return patient;
    }

//    private String patientName;
//    private String patientSurname;

}
