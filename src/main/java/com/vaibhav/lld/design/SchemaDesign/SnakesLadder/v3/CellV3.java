package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v3;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.Piece;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Obstacle;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class CellV3 {
    private int x;
    private int y;
    private int cellValue;
    private Piece[] pieces;
    //add obstacle here
    private Obstacle obstacle;

}
