package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;
@Getter
@AllArgsConstructor
public class EntryGate  {
    private Ticket ticket;
    private ParkingAttendant attendant;


    public Ticket generateTicket(Vehicle vehicle, List<Slots> availableSlots){
        Slots slots=availableSlots.get(availableSlots.size()-1);
        slots.setSlotStatus(SlotStatus.OCCUPIED);
        //availableSlots.remove();
        return null;
       // return new Ticket(new Date(),vehicle.getRegNo(),slots.getSlotNumber(),false);
    }

    //we can abstract id and name as both entry and exit attendants have id and name

//    public List<Slots> getAvailableParkingSlots(){
//        return null;
//    }
}
