package com.hospitalApp.hospitalApp.model.user;


import com.hospitalApp.hospitalApp.model.PersonalDetails;
import com.hospitalApp.hospitalApp.model.Specialist;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "doctor")
public class Doctor{

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO )
    private int doctorId;

    private String doctorDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specialist", referencedColumnName = "specialistId")
    private Specialist specialist;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="personalDetails", referencedColumnName = "personalDetailsId")
    private PersonalDetails personalDetails;
//    private String name;
//    private String surname;
}
