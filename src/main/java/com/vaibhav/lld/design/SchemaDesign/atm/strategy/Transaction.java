package com.vaibhav.lld.design.SchemaDesign.atm.strategy;

import com.vaibhav.lld.design.SchemaDesign.atm.Atm;
import lombok.Getter;

import java.util.Date;

@Getter
public abstract class Transaction {
    private int id;
    private int atmid;
    //customer will make a transaction
    private TransactionType transactionType;
    private String accountNo;
    private Date creationDate;
    private TransactionStatus transactionStatus;

    public abstract void perform();
}
