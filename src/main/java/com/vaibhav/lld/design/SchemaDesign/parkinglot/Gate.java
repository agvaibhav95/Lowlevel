package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Gate {
    private ParkingAttendant parkingAttendant;
}
