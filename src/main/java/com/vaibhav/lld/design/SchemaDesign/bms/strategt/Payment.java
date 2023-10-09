package com.vaibhav.lld.design.SchemaDesign.bms.strategt;

import com.vaibhav.lld.design.SchemaDesign.bms.PaymentType;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.PaymentStatus;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public abstract class Payment {
    private int id;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    private int bookingId;
    private double amount;
    private Date txnDate;
    public abstract void pay();
}
