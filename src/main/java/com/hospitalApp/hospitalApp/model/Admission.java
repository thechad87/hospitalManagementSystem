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
@Table(name = "admission")
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int admissionId;
    private String admissionDate;
    private String admissionTime;
    private String admissionDescription;

}
