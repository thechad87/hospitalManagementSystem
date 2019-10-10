package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Visit;


public class VisitFactory {

    public static Visit buildVisit(int visitId, String visitType, String visitDescription, String visitDate) {

        Visit visit = Visit.builder()
                .visitId(visitId)
                .visitType(visitType)
                .visitDescription(visitDescription)
                .visitDate(visitDate)
                .build();
        return visit;
    }
}
