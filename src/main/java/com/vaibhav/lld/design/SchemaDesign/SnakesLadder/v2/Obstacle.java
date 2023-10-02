package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Obstacle {
    private int from;
    private int to;
    public abstract int getDestination();
}
//suppose we have a ladder which starts from 2 and end at 18 then we getDestination wil give --->18
// and we have a snake which starts at 25 and ends at 5 then  getDestination will give you --->5