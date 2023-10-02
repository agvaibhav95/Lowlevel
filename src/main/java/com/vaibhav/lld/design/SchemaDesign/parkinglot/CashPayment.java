package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;

import java.util.Date;

@Getter
public class CashPayment extends Payment {
    public CashPayment(double amount, String ticketId) {
        super(PaymentType.CARD, new Date(), PaymentStatus.PENDING, amount, ticketId);
    }

    @Override
    public void pay() {
        super.setPaymentStatus(PaymentStatus.DONE);
    }
}
