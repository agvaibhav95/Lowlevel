package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2;


import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Obstacle;
import lombok.Getter;

@Getter
public class Snake extends Obstacle {

    public Snake(int from,int to){
        super(from,to);
    }

    @Override
    public int getDestination() {
        System.out.println("snake player is going down "+super.getTo());
        return super.getTo();
    }
    // why diff implementation for snake ladder and frog --> because frog might have some diff implementation logic
    // futuristic design
}
