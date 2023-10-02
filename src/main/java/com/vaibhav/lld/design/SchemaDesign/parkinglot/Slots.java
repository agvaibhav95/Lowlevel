package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Slots {
    private int id;
    private SlotStatus slotStatus;
    private SlotType slotType;
    private Vehicle vehicle;
    private int floorId;
    //can i have vehicle info at slot level
    // depends on requirements as tomorow some one can ask on a particular slot give me the car details.
    //then yes we will have
}
