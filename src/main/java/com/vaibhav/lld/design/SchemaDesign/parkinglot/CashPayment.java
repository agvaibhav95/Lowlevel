package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter

public class CashPayment extends Payment {
    private CashPayment(double amount, String ticketId) {
        super(PaymentType.CARD, new Date(), PaymentStatus.PENDING, amount, ticketId);
    }

    @Override
    public void pay() {
        System.out.println("Cash payment recieved");
        super.setPaymentStatus(PaymentStatus.DONE);
    }
    public static CashPaymentBuilder builder(){
        return new CashPaymentBuilder();
    }
    public static class CashPaymentBuilder{
        private double amount;
        private String ticketId;

        private CashPaymentBuilder(){

        }
        public CashPayment build(){
            return new CashPayment(this.amount,this.ticketId);
        }
        //setters

    }
}
