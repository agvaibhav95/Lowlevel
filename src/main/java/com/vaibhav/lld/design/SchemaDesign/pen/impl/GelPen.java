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

import java.util.Objects;


@Getter
public class GelPen extends Pen implements Refillable {
    private Refill refill;
    private GelPen(String name, double cost, WritingBehaviour writingBehaviour, Nib nib,INK ink,boolean refillable) {
        super(name, cost, PenType.GELPEN, writingBehaviour);
        this.refill=getRefill(nib,ink,refillable);
    }


//    @Override
//    public void write() {
//        System.out.println("gel pen is so smooth");
//    }

    @Override
    public void changeRefill(Refill refill) {
        // or we can throw exception by checking type of refills
        if(isRefillable())
        {
            // This is something using same plastic of refill and just addding ink and changing nib and type also.
    this.refill=getRefill(refill.getNib(),refill.getInk(),refill.isRefillable());}
    }

//factory method
    @Override
    public Refill getRefill(Nib nib,INK ink,boolean refillable) {
        return Refill.builder().nib(nib)
                .ink(ink)
                .type(RefillType.GELPENREFILL)
                .isRefillable(refillable).build();
    }

    @Override
    public boolean isRefillable() {
        return this.refill.isRefillable();
    }
    public static GelPenBuilder getGelPenBuilder(){
        return new GelPenBuilder();
    }

    public static class GelPenBuilder{
        private String name;
        private double cost;
        private WritingBehaviour writingBehaviour;
        private INK ink;
        private Nib nib;
        private boolean isRefillable;

        GelPenBuilder(){}

       public GelPen toBuild(){
            if(!isValid()){
                throw new IllegalArgumentException("pen cannot be created");
            }

           GelPen gelPen=new GelPen(this.name,this.cost,this.writingBehaviour,this.nib,this.ink,this.isRefillable);
           return gelPen;
       }
       private boolean isValid(){
            if(Objects.isNull(writingBehaviour) || Objects.isNull(nib) ||Objects.isNull(ink)){
             return false;
            }

            return true;
       }
       public GelPenBuilder nib(Nib nib){
           this.nib=nib;
           return this;

       }
        public GelPenBuilder ink(INK ink){
            this.ink=ink;
            return this;

        }
        public GelPenBuilder isRefillable(boolean isRefillable){
            this.isRefillable=isRefillable;
            return this;

        }

        public GelPenBuilder writingBehaviour(WritingBehaviour writingBehaviour){
            this.writingBehaviour=writingBehaviour;
            return this;

        }
        public GelPenBuilder name(String name){
            this.name=name;
            return this;

        }
        public GelPenBuilder cost(double cost){
            this.cost=cost;
            return this;

        }
    }
}
