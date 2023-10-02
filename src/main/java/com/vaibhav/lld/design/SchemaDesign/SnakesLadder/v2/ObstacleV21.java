package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.CellType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ObstacleV21 {
    private int from;
    private CellType cellType;
    private int to;
    public int getDestination(){System.out.println("Inside ObstacleV21 and go to"+to);
        return to;
    }
}

//can we do it in this wAY-->? yes but what if getDestination method implemenation is diff;