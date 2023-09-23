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
public class GelPen extends Pen implements Refillable {
    private Refill refill;
    public GelPen(String name, double cost, WritingBehaviour writingBehaviour, INK ink,Nib nib,boolean refillable) {
        super(name, cost, PenType.GELPEN, writingBehaviour);
        this.refill=getRefill(nib,ink,refillable);
    }


//    @Override
//    public void write() {
//        System.out.println("gel pen is so smooth");
//    }

    @Override
    public void changeRefill(Refill refill) {
        if(isRefillable())
        {
    this.refill=getRefill(refill.getNib(),refill.getInk(),refill.isRefillable());}
    }
//factory method
    @Override
    public Refill getRefill(Nib nib,INK ink,boolean refillable) {
        return new Refill(nib,ink, RefillType.GELPENREFILL,refillable) ;
    }

    @Override
    public boolean isRefillable() {
        return this.refill.isRefillable();
    }
}
