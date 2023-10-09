package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.factory.PaymentModeFactory;
import lombok.Getter;

@Getter
public class Vehicle {
    private String regNo;
    private VehicleType vehicleType;


    public void makePayment(Ticket ticket,Payment payment) {
        Payment payments=null;
       switch (payment.getPaymentType()){
           case CASH:
               CashPayment.CashPaymentBuilder cashPayment= PaymentModeFactory.getCashPayment();
                cashPayment.build().pay();
           case CARD:
               CardPayment.CardPaymentBuilder cardPayment= PaymentModeFactory.getCadPayment();
               cardPayment.build().pay();
           case UPI:
              // CashPayment.CashPaymentBuilder cashPayment= PaymentModeFactory.getCashPayment();
             //  cashPayment.build().pay();

       }
    }

    public void getTicket() {
    }
}

