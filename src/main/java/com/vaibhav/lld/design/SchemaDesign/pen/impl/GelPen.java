package com.vaibhav.lld.design.SchemaDesign.pen.impl;

import com.vaibhav.lld.design.SchemaDesign.pen.Pen;
import com.vaibhav.lld.design.SchemaDesign.pen.Refillable;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Refill;

public class GelPen extends Pen implements Refillable {
    private Refill refill;
//    @Override
//    public void write() {
//        System.out.println("gel pen is so smooth");
//    }

    @Override
    public void refill() {
        System.out.println("GEL PEN is refilling");
    }
}
