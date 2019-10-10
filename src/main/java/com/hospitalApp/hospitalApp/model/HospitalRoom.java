package com.hospitalApp.hospitalApp.model;


import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "hospitalRoom")
public class HospitalRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int hospitalRoomNumber;
    private String hospitalFloor;
    private String hospitalRoomSection;
}
