package com.vaibhav.lld.design.SchemaDesign.TicTacToe.strategy;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Board;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Cell;

public interface PlayingStrategy {
    public Cell play(Board board,Cell cell);
}
