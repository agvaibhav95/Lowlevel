package com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Board;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Cell;

public class ConsecutiveColWinner implements WinningPatternsObserver{
    @Override
    public boolean checkWinner(Board board) {
        return false;
    }
    private boolean ifsameSign(Board board) {

        Cell[][] cells = board.getCells();
        int row = cells.length;
        int col = cells[0].length;
        boolean flag = false;
        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (cells[j][i].getSymbol() != cells[j-1][i].getSymbol()) {
                    flag=false;
                } else {
                    if (flag) {
                        flag = true;
                    }
                }

            }
            if (flag) {
                return true;
            }
            flag = false;

        }
        return false;
    }
}
