package com.vaibhav.lld.design.SchemaDesign.atm.strategy;

public class CashDepositTransaction extends Transaction{

    private double amount;


    @Override
    public void perform() {
        System.out.println("cash deposited of amount"+amount+ "in account no"+super.getAccountNo());
    }
}
