package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExitGate {
    private PaymentCounter paymentCounter;
    private ParkingAttendant attendant;



    public void collectPayement(Ticket ticket){
        ticket.setPayed(true);
    }
    public void collectPayment(Ticket ticket){
        if(!ticket.isPayed()){}
    }
    public boolean checkout(Ticket ticket){return ticket.isPayed();}
}
