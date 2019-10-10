package com.hospitalApp.hospitalApp.factory;

import com.hospitalApp.hospitalApp.model.Schedule;
import com.hospitalApp.hospitalApp.model.user.Doctor;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
public class ScheduleFactory {


    public static Schedule buildSchedule(int scheduleId,
                                         String scheduleType, String scheduleDescription, String Time, Doctor doctor) {

        Schedule schedule = Schedule.builder()
                .scheduleId(scheduleId)
                .scheduleType(scheduleType)
                .scheduleDescription(scheduleDescription)
                .time(scheduleDescription)
                .doctor(doctor)
                .build();
        return schedule;
    }
}

