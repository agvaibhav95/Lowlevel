package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.CellV1;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.Piece;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public class BoardV21 {
    private List<Obstacle> obstacleList;
    private CellV1[][] cells;
    public BoardV21(int x, int y, List<Obstacle> obstacleList){

        //this.obstacleList=obstacleList;

        this.cells=new CellV1[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                this.cells[i][j]=new CellV1();
            }
        }
    }
}
