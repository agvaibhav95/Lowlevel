package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@AllArgsConstructor
@Setter
public class Ticket {
    private int id;
    private Date entryTime;
    private Vehicle vehicle;
    private Slots slotNo;

}
