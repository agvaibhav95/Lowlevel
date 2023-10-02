package com.vaibhav.lld.design.SchemaDesign.SnakesLadder;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.Piece;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class CellV1 {

    //private CellType cellType;
    private int value;
    private Piece[] pieces;

}
