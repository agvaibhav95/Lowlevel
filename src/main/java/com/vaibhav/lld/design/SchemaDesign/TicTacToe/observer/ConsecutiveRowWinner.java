package com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Board;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.Cell;

import java.util.Objects;

public class ConsecutiveRowWinner implements WinningPatternsObserver {
    @Override
    public boolean checkWinner(Board board) {
        System.out.println("checking if row has same sign");
        return ifsameSign(board);
    }

    private boolean ifsameSign(Board board) {

        Cell[][] cells = board.getCells();
        int row = cells.length;
        int col = cells[0].length;
        boolean flag = true;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
               // System.out.println("cel[i][j] -->"+cells[i][j].getSymbol()  +"   and cell[i][j-1] ---->"+cells[i][j-1].getSymbol() );
                if ( Objects.isNull(cells[i][j-1].getSymbol())|| Objects.isNull(cells[i][j].getSymbol()) ||(cells[i][j].getSymbol() != cells[i][j - 1].getSymbol())){
                    flag=false;
                }

            }
            if (flag) {
                return true;
            }
            flag = true;

        }
        return false;
    }
}