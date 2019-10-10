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
@Table(name = "medicalAidDetails")
public class MedicalAidDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int medicalAidDetailsId;
    private String medicalAidDetailsType;
    private String medicalAidDetailsDescription;
    private String amountOwed;
}
