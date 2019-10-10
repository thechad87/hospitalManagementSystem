package com.hospitalApp.hospitalApp.model;

import com.hospitalApp.hospitalApp.model.user.Doctor;
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
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int scheduleId;
    private String scheduleType;
    private String scheduleDescription;
    private String time;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor", referencedColumnName = "doctorId")
    private Doctor doctor;

}
