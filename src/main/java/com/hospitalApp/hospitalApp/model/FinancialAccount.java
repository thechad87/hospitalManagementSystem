package com.hospitalApp.hospitalApp.model;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "financialAccount")
public class FinancialAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int financialAccountId;
    private String accountType;
    private String amountOwed;
    private String medicalAidSupport;
    private String date;

}
