package com.hospitalApp.hospitalApp.model;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "specialist")
public class Specialist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int specialistId;
    private String specialistType;
    private String specialistDescription;
}
