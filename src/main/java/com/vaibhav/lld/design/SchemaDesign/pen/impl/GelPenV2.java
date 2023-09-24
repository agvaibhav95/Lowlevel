package com.vaibhav.lld.design.SchemaDesign.pen.impl;

import com.vaibhav.lld.design.SchemaDesign.pen.Pen;
import com.vaibhav.lld.design.SchemaDesign.pen.RefillableV2;
import com.vaibhav.lld.design.SchemaDesign.pen.WritingBehaviour;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.PenType;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.RefillType;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Refill;
import lombok.Getter;

import java.util.Objects;
@Getter
public class GelPenV2 extends Pen implements RefillableV2 {
    private Refill refill;

    private GelPenV2(String name, double cost, WritingBehaviour writingBehaviour,Refill refill) {
        super(name, cost, PenType.GELPEN, writingBehaviour);
        this.refill=refill;
    }

    @Override
    public void changeRefill(Refill refill) {
        if (RefillType.GELPENREFILL != refill.getType()) {
            throw new IllegalArgumentException("incompatiable refill with pen");
        }
        if (refill.isRefillable()) {
            this.refill = refill;
        }
    }


    @Override
    public boolean isRefillable() {
        return refill.isRefillable();
    }

    public static GelPenBuilder getBuilder(){
        return new GelPenBuilder();
    }
    public static class GelPenBuilder {
        private String name;
        private double cost;
        private WritingBehaviour writingBehaviour;
        private Refill refill;

        GelPenBuilder() {
        }

        public GelPenV2 build() {
            if(!isValid()){
             throw new IllegalArgumentException("Pen cannot be created");
            }
            if(RefillType.GELPENREFILL != this.refill.getType()){
                throw new IllegalArgumentException("Refill incompatiable");
            }
            GelPenV2 gelPen = new GelPenV2(this.name, this.cost, this.writingBehaviour, this.refill);
            return gelPen;
        }
        private boolean isValid(){
            if(Objects.isNull(writingBehaviour) || Objects.isNull(refill)){
                return false;
            }
            return true;
        }
        public GelPenBuilder name(String name){this.name=name;
            return this;}
        public GelPenBuilder cost(double cost){this.cost=cost;
        return this;}
        public GelPenBuilder writingBehaviour(WritingBehaviour writingBehaviour){this.writingBehaviour=writingBehaviour;
            return this;}
        public GelPenBuilder refill(Refill refill){this.refill=refill;
            return this;}
    }
}
