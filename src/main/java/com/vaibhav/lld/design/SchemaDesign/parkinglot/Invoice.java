package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;
@Getter
@AllArgsConstructor
@Builder
public class Invoice {
    private String id;
    private Vehicle vehicle;
    private Ticket ticket;
    private Date date;
    private double amount;
}
