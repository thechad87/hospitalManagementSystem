package com.hospitalApp.hospitalApp.model.user;


import com.hospitalApp.hospitalApp.model.*;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int patientId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medication", referencedColumnName = "medicationId")
    private Medication medications;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operation", referencedColumnName = "operationId")
    private Operation operation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patientProgress", referencedColumnName = "patientProgressId")
    private PatientProgress patientProgress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personalDetails", referencedColumnName = "personalDetailsId")
    private PersonalDetails personalDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diagnosis", referencedColumnName = "diagnosisId")
    private Diagnosis diagnosis;

}
