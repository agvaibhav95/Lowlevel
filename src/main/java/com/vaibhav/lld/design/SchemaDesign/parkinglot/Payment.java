package com.vaibhav.lld.design.SchemaDesign.parkinglot;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
@Getter@AllArgsConstructor
public abstract class Payment {
    private PaymentType paymentType;
    private Date date;
    private Ticket ticket;


}
