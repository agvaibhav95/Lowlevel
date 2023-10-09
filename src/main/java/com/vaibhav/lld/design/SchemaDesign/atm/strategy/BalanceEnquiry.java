package com.vaibhav.lld.design.SchemaDesign.atm.strategy;

public class BalanceEnquiry extends Transaction{

    @Override
    public void perform() {
        System.out.println("your account bal is"+10d);
    }
}
