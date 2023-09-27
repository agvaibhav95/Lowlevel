package com.vaibhav.lld.design.SchemaDesign.TicTacToe;

import lombok.*;

@Setter
@Getter
public class Cell {
    private int x;
    private int y;
    private Symbol symbol;
    public Cell(int x,int y){
        this.x=x;
        this.y=y;
    }
}
