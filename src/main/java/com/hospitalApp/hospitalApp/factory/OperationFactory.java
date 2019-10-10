package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Operation;


public class OperationFactory {


    public static Operation buildOperation(int operationId,
                                           String operationType, String operationDescription,String operationDate) {

        Operation operation = Operation.builder()
                .operationId(operationId)
                .operationType(operationType)
                .operationDescription(operationDescription)
                .operationDate(operationDate)
                .build();
        return operation;
    }
}
