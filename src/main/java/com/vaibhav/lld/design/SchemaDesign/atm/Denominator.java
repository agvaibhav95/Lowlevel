package com.vaibhav.lld.design.SchemaDesign.atm;

public enum Denominator {
    FIVEHUNDERED(500),
    HUNDERED(100),
    TWOHUNDERED(200),
    TWOTHOUSAND(2000);

    private int numVal;

    Denominator(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }



}
