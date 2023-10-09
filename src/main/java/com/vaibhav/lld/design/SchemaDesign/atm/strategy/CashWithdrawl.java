package com.vaibhav.lld.design.SchemaDesign.atm.strategy;

public class CashWithdrawl extends Transaction{
    private double amount;

    @Override
    public void perform() {
        System.out.println("cash is withrawing of amount"+amount+" from account"+super.getAccountNo());

    }
}
