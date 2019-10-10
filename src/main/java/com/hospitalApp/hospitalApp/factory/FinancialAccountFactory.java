package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.FinancialAccount;


public class FinancialAccountFactory {
    
    public static FinancialAccount buildFinancialAccount(int financialAccountId,
                                           String accountType, String amountOwed, String medicalAidSupport, String date) {

        FinancialAccount financialAccount = FinancialAccount.builder()
                .financialAccountId(financialAccountId)
                .accountType(accountType)
                .amountOwed(amountOwed)
                .medicalAidSupport(medicalAidSupport)
                .date(date)
                .build();
        return financialAccount;
    }
}
