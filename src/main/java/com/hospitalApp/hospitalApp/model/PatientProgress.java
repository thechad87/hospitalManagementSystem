package com.hospitalApp.hospitalApp.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "patientProgress")
public class PatientProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientProgressId;
    private String patientDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diagnosis", referencedColumnName = "diagnosisId")
    private Diagnosis diagnosis;
}
