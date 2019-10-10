package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.Appointment;

public class AppointmentFactory {

    public static Appointment buildAppointment(int appointmentId,
          String appointmentTime, String appointmentDescription){

        Appointment appointment = Appointment.builder()
                .appointmentId(appointmentId)
                .appointmentTime(appointmentTime)
                .appointmentDescription(appointmentDescription)
//                .doctor(doctor)
//                .patient(patient)
                .build();
        return appointment;
    }

}
