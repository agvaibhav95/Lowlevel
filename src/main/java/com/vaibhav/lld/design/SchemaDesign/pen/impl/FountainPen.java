package com.vaibhav.lld.design.SchemaDesign.pen.impl;

import com.vaibhav.lld.design.SchemaDesign.pen.Pen;
import com.vaibhav.lld.design.SchemaDesign.pen.WritingBehaviour;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.INK;
import com.vaibhav.lld.design.SchemaDesign.pen.constants.PenType;
import com.vaibhav.lld.design.SchemaDesign.pen.model.Nib;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter

public class FountainPen extends Pen {
    private Nib nib;
    private INK ink;


    public FountainPen(String name, double cost, WritingBehaviour writingBehaviour,INK ink,Nib nib) {
        super(name, cost, PenType.FOUNTAIN, writingBehaviour);
        this.nib=nib;
        this.ink=ink;
    }

    public void fillInk(INK ink){
        this.ink=ink;
    }

}
