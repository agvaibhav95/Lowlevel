package com.vaibhav.lld.design.SchemaDesign.TicTacToe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Player {

    private Symbol symbol;
    public abstract Board play(Board board,Cell cell);

    // why board as a input param bcoz player can look at the whole board and determine where to move
    // and return as cell where to move.
}
