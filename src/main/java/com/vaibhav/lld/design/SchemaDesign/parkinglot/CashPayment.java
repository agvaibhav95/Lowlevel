package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class CashPayment extends Payment{
    public CashPayment(Ticket ticket) {
        super(PaymentType.CASH, new Date(), ticket);
    }
}
