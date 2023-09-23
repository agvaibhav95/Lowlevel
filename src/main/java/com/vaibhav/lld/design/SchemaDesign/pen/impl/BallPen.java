package com.vaibhav.lld.design.SchemaDesign.pen.impl;

import com.vaibhav.lld.design.SchemaDesign.pen.Pen;
import com.vaibhav.lld.design.SchemaDesign.pen.Refillable;
import com.vaibhav.lld.design.SchemaDesign.pen.WritingBehaviour;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.INK;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.PenType;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.RefillType;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Nib;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Refill;
import lombok.Getter;


@Getter
public class BallPen extends Pen implements Refillable {

    private Refill refill;
    public BallPen(String name, double cost,  WritingBehaviour writingBehaviour,Nib nib,INK ink,boolean refillable) {
        super(name, cost, PenType.BALLPEN, writingBehaviour);
        this.refill=getRefill(nib,ink,refillable);
    }

    @Override
    public void changeRefill(Refill refill) {
        if(isRefillable())
        {
        this.refill=getRefill(refill.getNib(), refill.getInk(),refill.isRefillable());}
    }

    @Override
    public Refill getRefill(Nib nib, INK ink,boolean refillable) {
        return  new Refill(nib,ink, RefillType.BALLPENREFILL,refillable);
    }

    @Override
    public boolean isRefillable() {
        return this.refill.isRefillable();
    }
}
