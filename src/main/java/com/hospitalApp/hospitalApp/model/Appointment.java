package com.hospitalApp.hospitalApp.model;


import com.hospitalApp.hospitalApp.model.user.Doctor;
import com.hospitalApp.hospitalApp.model.user.Patient;
import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int appointmentId;
    private String appointmentTime;
    private String appointmentDate;
    private String appointmentDescription;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor", referencedColumnName = "doctorId")
    private Doctor doctor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient", referencedColumnName = "patientId")
    private Patient patient;
}
