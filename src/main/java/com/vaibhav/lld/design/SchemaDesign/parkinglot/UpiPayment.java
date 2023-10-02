package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class UpiPayment extends Payment{
    public UpiPayment( Ticket ticket) {
        super(PaymentType.UPI, new Date(), ticket);
    }
}
