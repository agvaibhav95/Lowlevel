package com.vaibhav.lld.design.SchemaDesign.TicTacToe.strategy;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Board;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Cell;

public class MediumPlayingStrategy implements PlayingStrategy{
    @Override
    public Cell play(Board board,Cell cell) {
        System.out.println("medium level play move from bot side");
        board.getCells()[cell.getX()][cell.getY()]=cell;
        return cell;
    }
}
