package com.vaibhav.lld.design.SchemaDesign.bms.strategt;

import com.vaibhav.lld.design.SchemaDesign.bms.PaymentType;

public class UPIPayment extends Payment{
    private int upiID;

    public UPIPayment(int id, PaymentType paymentType,int upiID) {
        super(id, paymentType);
        this.upiID=upiID;
    }

    @Override
    public void pay() {
        System.out.println("UPI payment recieved");
    }
}
