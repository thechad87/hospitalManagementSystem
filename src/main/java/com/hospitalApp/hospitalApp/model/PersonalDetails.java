package com.hospitalApp.hospitalApp.model;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "personalDetails")
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int personalDetailsId;
    private String name;
    private String surname;
    private String contactDetails;
    private String emailAddress;
    private String homeAddress;
    private String sex;
    private String personalDetailsDescription;
}
