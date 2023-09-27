package com.vaibhav.lld.design.SchemaDesign.pen.impl;

public class PenFactory {

    public static GelPen.GelPenBuilder getGelPen(){
        return GelPen.getGelPenBuilder();
    }
    // we dont want client code to be dependent on sub class so we are creating a factory for this
    // on the basis of type we can return the object
    // here we are returning builder for them as i dont want to pass the parameters
    // of pen or some dto
    // we can have diff methods as mentioned below





//    public static BallPen. getBallPen(){
//        return BallPen.builder();
//    }

//    public static FountainPen. getFountainPen(){
//        return FountainPen.builder();
//    }
}
