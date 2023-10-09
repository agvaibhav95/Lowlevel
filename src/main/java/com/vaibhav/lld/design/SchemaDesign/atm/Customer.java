package com.vaibhav.lld.design.SchemaDesign.atm;

import com.vaibhav.lld.design.SchemaDesign.atm.strategy.Transaction;

public class Customer extends User{
    private AccountDetails accountDetails;
    private Card card;
    public void makeTransaction(Transaction transaction){
        transaction.perform();
    }
}
