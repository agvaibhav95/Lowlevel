package com.vaibhav.lld.design.SchemaDesign.bms.strategt;

import com.vaibhav.lld.design.SchemaDesign.bms.PaymentType;

import java.util.Date;

public class CardPayment extends Payment{
    private int cardNo;
    private String cardHolderName;
    private Date expiryDate;
    private int cvv;

    public CardPayment(int id, PaymentType paymentType,int cardNo,String cardHolderName,Date expiryDate,int cvv) {
        super(id, paymentType);
        this.cardNo=cardNo;
        this.cardHolderName=cardHolderName;
        this.cvv=cvv;
        this.expiryDate=expiryDate;
    }

    @Override
    public void pay() {
System.out.println("Card payment recieved");
    }
}
