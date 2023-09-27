package com.vaibhav.lld.design.SchemaDesign.pen.impl;

public class PenFactory {

    public static GelPen.GelPenBuilder getGelPen(){
        return GelPen.getGelPenBuilder();
    }

//    public static BallPen. getBallPen(){
//        return BallPen.builder();
//    }

//    public static FountainPen. getFountainPen(){
//        return FountainPen.builder();
//    }
}
