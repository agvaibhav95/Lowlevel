package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;

@Getter
public class Vehicle {
    private String regNo;
    private VehicleType vehicleType;

    public void makePayment(Ticket ticket){}
    public void getTicket(){}
}

