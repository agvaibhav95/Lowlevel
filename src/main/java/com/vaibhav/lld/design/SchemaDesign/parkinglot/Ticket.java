package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@AllArgsConstructor
@Setter
public class Ticket {
    private int id;
    private Date date;
    private String vehicleNo;
    private Slots slotNo;
    private boolean isPayed;

}
