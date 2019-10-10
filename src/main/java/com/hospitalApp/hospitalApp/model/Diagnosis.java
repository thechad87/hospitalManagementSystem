package com.hospitalApp.hospitalApp.model;


import com.hospitalApp.hospitalApp.model.user.Doctor;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "diagnosis")
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int diagnosisId;
    private String diagnosisType;
    private String diagnosisDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor", referencedColumnName = "doctorId")
    private Doctor doctor;
}
