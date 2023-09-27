package com.vaibhav.lld.design.SchemaDesign.TicTacToe;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class Board {
    private Cell[][] cells;
    private List<Cell> availbaleCells;

    private Board(int x,int y){
        this.availbaleCells=new ArrayList<>();
        this.cells=new Cell[x][y];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                this.cells[i][j]= new Cell(i,j);
                this.availbaleCells.add(this.cells[i][j]);
            }
        }
    }
    private Board(){}
    public void removeAvailableCells(Cell cell){
        availbaleCells.remove(cell);
    }
    public static BoardBuilder builder(){
        return new BoardBuilder();
    }

    public static class BoardBuilder{

        private int row;
        private int col;
        private BoardBuilder (){
        }
        public BoardBuilder x(int x){
            this.row=x;
            return this;
        }
        public BoardBuilder y(int y){
            this.col=y;
            return this;
        }
        public Board build(){
            Board board1=new Board(row,col);
            return board1;
        }
    }
}
