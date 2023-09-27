package com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Board;

public interface WinningPatternsObserver {
    public boolean checkWinner(Board board);
}
