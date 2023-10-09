package com.vaibhav.lld.design.SchemaDesign.atm.strategy;

public class FundTransfer extends Transaction{
    private double amount;
    private String destAccountNo;

    @Override
    public void perform() {
        System.out.println("fund is transferring from account"+super.getAccountNo()+ "to account no "+destAccountNo+" of amount"+amount);

    }
}
