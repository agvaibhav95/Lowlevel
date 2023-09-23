package com.vaibhav.lld.design.SchemaDesign.pen.impl;

import com.vaibhav.lld.design.SchemaDesign.pen.Pen;
import com.vaibhav.lld.design.SchemaDesign.pen.Refillable;
import com.vaibhav.lld.design.SchemaDesign.pen.WritingBehaviour;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.INK;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.PenType;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.RefillType;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Nib;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Refill;

import java.sql.Ref;

public class BallPen extends Pen implements Refillable {

    private Refill refill;
    public BallPen(String name, double cost, PenType type, WritingBehaviour writingBehaviour,Nib nib,double radius,INK ink,boolean refillable) {
        super(name, cost, type, writingBehaviour);
        this.refill=getRefill(nib,ink,radius,refillable);
    }

    @Override
    public void changeRefill(Refill refill) {
        this.refill=getRefill(refill.getNib(), refill.getInk(),refill.getRadius(),refill.isRefillable());
    }

    @Override
    public Refill getRefill(Nib nib, INK ink, double radius,boolean refillable) {
        return  new Refill(nib,ink,radius, RefillType.BALLPENREFILL,refillable);
    }

    @Override
    public boolean isRefillable() {
        return this.refill.isRefillable();
    }
}
