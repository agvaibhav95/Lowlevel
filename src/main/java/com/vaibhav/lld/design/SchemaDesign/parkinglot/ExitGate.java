package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExitGate extends Gate {
    private PaymentCounter paymentCounter;

    public ExitGate(ParkingAttendant parkingAttendant) {
        super(parkingAttendant);
    }


    public void collectPayement(Ticket ticket) {

    }

    public void collectPayment(Ticket ticket) {

    }

    public boolean checkout(Ticket ticket) {
        return false;
    }
}
