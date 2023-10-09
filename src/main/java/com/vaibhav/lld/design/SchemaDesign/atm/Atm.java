package com.vaibhav.lld.design.SchemaDesign.atm;

import java.util.Map;

public class Atm {
    private int id;
    private Screen screen;
    private Printer printer;
    private CashDispenser cashDispenser;
    private CashDeposit cashDeposit;
    private Map<Denominator,Integer> cash;
    private CardHolder cardHolder;
    private Key[] keys;
}
