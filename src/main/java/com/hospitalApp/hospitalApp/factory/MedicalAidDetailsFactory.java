package com.hospitalApp.hospitalApp.factory;

import com.hospitalApp.hospitalApp.model.MedicalAidDetails;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
public class MedicalAidDetailsFactory {


    public static MedicalAidDetails buildMedicalAidDetails(int medicalAidDetailsId,
                                                 String medicalAidDetailsType, String medicalAidDetailsDescription, String amountOwed) {

        MedicalAidDetails medicalAidDetails = MedicalAidDetails.builder()
                .medicalAidDetailsId(medicalAidDetailsId)
                .medicalAidDetailsType(medicalAidDetailsType)
                .medicalAidDetailsDescription(medicalAidDetailsDescription)
                .amountOwed(amountOwed)
                .build();
        return medicalAidDetails;
    }
    
}
