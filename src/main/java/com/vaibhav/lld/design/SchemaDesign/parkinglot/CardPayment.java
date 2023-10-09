package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class CardPayment extends Payment {
    private CardType cardType;
    private String name;
    private String cardNo;
    private Date expiryDate;
    private String cvv;

    private CardPayment(double amount, String ticketId,CardType cardType,String name,String cardNo,Date expiryDate,String cvv) {
        super(PaymentType.CARD, new Date(), PaymentStatus.PENDING, amount, ticketId);
        this.cardNo=cardNo;
        this.cardType=cardType;
        this.cvv=cvv;
        this.expiryDate=expiryDate;
        this.name=name;
    }
    private CardPayment(){}


    @Override
    public void pay() {
        System.out.println("Card payment recieved");
        super.setPaymentStatus(PaymentStatus.DONE);
    }
    public static CardPaymentBuilder builder(){
        return new CardPaymentBuilder();
    }

    public static class CardPaymentBuilder{
        private CardPayment cardPayment;
        private double amount;
        private String ticketId;

        private CardPaymentBuilder(){
            this.cardPayment=new CardPayment();
        }
        public CardPayment build(){
          return new CardPayment(this.amount,this.ticketId,this.cardPayment.cardType,this.cardPayment.getName(),this
                  .cardPayment.getCardNo(),this.cardPayment.expiryDate,this.cardPayment.getCvv());
        }
    //setters


    }
}
