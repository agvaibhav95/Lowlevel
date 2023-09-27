package com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Board;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public abstract class WinningRules {

    private List<WinningPatternsObserver> winningPatternsObservers=new ArrayList<>();

    public void addWinningRules(WinningPatternsObserver winningPatternsObserver) {
        winningPatternsObservers.add(winningPatternsObserver);
    }

    public void removeWinningRules(WinningPatternsObserver winningPatternsObserver) {
        winningPatternsObservers.remove(winningPatternsObserver);
    }

    public boolean checkWinner(Board board) {
        for (WinningPatternsObserver winningPatternsObserver : winningPatternsObservers) {
            if (winningPatternsObserver.checkWinner(board)) {
                return true;
            }
        }
        return false;
    }
}
