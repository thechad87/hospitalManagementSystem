package com.hospitalApp.hospitalApp.model;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "treatment")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int treatmentId;
    private String treatmentType;
    private String treatmentDescription;
    private String treatmentPeriod;
    //added
    private String prescription;
}
