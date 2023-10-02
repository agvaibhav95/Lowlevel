package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UpiPayment extends Payment {
    public UpiPayment(double amount, String ticketId) {
        super(PaymentType.CARD, new Date(), PaymentStatus.PENDING, amount, ticketId);
    }

    @Override
    public void pay() {

        super.setPaymentStatus(PaymentStatus.DONE);
    }
}
