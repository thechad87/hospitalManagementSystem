package com.hospitalApp.hospitalApp.factory;


import com.hospitalApp.hospitalApp.model.HospitalRoom;


public class HospitalRoomFactory {

    public static HospitalRoom buildHospitalRoom(int hospitalRoomNumber,
                                           String hospitalFloor, String hospitalRoomSection) {

        HospitalRoom hospitalRoom = HospitalRoom.builder()
                .hospitalRoomNumber(hospitalRoomNumber)
                .hospitalFloor(hospitalFloor)
                .hospitalRoomSection(hospitalRoomSection)
                .build();
        return hospitalRoom;
    }
}
