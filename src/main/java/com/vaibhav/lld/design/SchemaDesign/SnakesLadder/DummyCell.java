package com.vaibhav.lld.design.SchemaDesign.SnakesLadder;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Obstacle;
import lombok.Builder;
import lombok.Getter;

@Getter
public class DummyCell extends Obstacle {
    public DummyCell(int from, int to) {
        super(from, to);
    }

    @Override
    public int getDestination() {
        System.out.println("dummy cell");
        return super.getTo();
    }
}

//this is wasteful and not a good fan of this appoach as we have a dummy cell of no use
//it is better to have a null check

