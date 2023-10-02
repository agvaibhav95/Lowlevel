package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EntryGate extends Gate {
    //  private Ticket ticket;
    //why entry gate will not have a ticket?
    //bcoz entry gate will issue a ticket and it just not have a single ticket for every car
    // as vehicle left the parking lot then again we can issue a ticket and
    // if we take ticket[] then what size bcoz each slot can be filled multiple times
    private DisplayBoard displayBoard; // because we have multiple entry gates and keeping display board at

    public EntryGate(ParkingAttendant parkingAttendant) {
        super(parkingAttendant);
    }
    //parking level might not help.


    public Ticket generateTicket(Vehicle vehicle, List<Slots> availableSlots) {
        Slots slots = availableSlots.get(availableSlots.size() - 1);
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
