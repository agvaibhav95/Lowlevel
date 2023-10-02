package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Obstacle;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Ladder extends Obstacle {


    public Ladder(int from,int to){
        super(from,to);
    }

    @Override
    public int getDestination() {
        System.out.println("ladder player is climbing up"+super.getTo());
        return super.getTo();
    }
}
