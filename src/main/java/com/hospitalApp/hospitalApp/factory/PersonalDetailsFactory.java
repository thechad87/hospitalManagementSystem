package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.PersonalDetails;

public class PersonalDetailsFactory {
    
    public static PersonalDetails buildPersonalDetails(int personalDetailsId,
                                           String name, String surname, String contactDetails, String emailAddress,
                                            String homeAddress, String sex, String personalDetailsDescription ) {

        PersonalDetails personalDetails = PersonalDetails.builder()
                .personalDetailsId(personalDetailsId)
                .name(name)
                .surname(surname)
                .contactDetails(contactDetails)
                .emailAddress(emailAddress)
                .homeAddress(homeAddress)
                .sex(sex)
                .personalDetailsDescription(personalDetailsDescription)
                .build();
        return personalDetails;
    }

}
