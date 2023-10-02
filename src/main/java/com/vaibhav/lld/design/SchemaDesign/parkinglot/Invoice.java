package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
@Builder
public class Invoice {
    //this is same as receipt
    private String id;
    private Vehicle vehicle;
    private Ticket ticket;

    //ticket can have multiple invoice as user can do partial payment
    private Date exitTime;
    private double amount;
}
