package com.hospitalApp.hospitalApp.factory;

import com.hospitalApp.hospitalApp.model.Admission;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
public class AdmissionFactory {


    public static Admission buildAdmission(int admissionId,
                                           String admissionDate, String admissionTime, String admissionDescription) {

        Admission admission = Admission.builder()
                .admissionId(admissionId)
                .admissionDate(admissionDate)
                .admissionTime(admissionTime)
                .admissionDescription(admissionDescription)
                .build();
        return admission;
    }
}
