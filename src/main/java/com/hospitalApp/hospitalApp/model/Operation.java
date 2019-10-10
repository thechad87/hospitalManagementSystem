package com.hospitalApp.hospitalApp.model;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int operationId;
    private String operationType;
    private String operationDescription;
    private String operationDate;
    //added
    private String operationResults;

}
