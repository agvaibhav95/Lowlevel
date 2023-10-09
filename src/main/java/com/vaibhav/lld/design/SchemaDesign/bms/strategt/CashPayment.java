package com.vaibhav.lld.design.SchemaDesign.bms.strategt;

import com.vaibhav.lld.design.SchemaDesign.bms.PaymentType;

public class CashPayment extends Payment {

    public CashPayment(int id, PaymentType paymentType) {
        super(id, paymentType);
    }

    @Override
    public void pay() {
        System.out.println("payment recieved by cash");
    }
}
