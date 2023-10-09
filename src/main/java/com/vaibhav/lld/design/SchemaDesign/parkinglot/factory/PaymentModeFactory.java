package com.vaibhav.lld.design.SchemaDesign.parkinglot.factory;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.CardPayment;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.CashPayment;

public class PaymentModeFactory {
    public static CashPayment.CashPaymentBuilder getCashPayment(){
       return CashPayment.builder();
    }
    public static CardPayment.CardPaymentBuilder getCadPayment(){
        return CardPayment.builder();
    }
}
