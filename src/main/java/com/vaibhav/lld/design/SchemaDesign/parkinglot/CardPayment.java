package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class CardPayment extends Payment{
    private CardType cardType;
    private String name;
    private String cardNo;
    private Date expiryDate;
    private String cvv;

    public CardPayment( Ticket ticket) {
        super(PaymentType.CARD,new Date(), ticket);
    }
}
