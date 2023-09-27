package com.vaibhav.lld.design.SchemaDesign.pen;

import com.vaibhav.lld.design.SchemaDesign.pen.constants.PenType;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public abstract class Pen {

     private String name;
    private double cost;
    private PenType type;
    //writing strategy as some pens can write same and some can write diff
    // so if child class will implement write method there will be code duplication
    //same as fly behaviour
    private WritingBehaviour writingBehaviour;

    public  void write(){
        writingBehaviour.write();
    }
    // we are removing abstract as we can implement write method here only and child classes
    //no need to override this method as they just need to inject dependency
    //as fountain pen does not have refill so we cannot add refillable method here(LSP)

}
