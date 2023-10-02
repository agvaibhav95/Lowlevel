package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v3;


import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.DummyCell;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Obstacle;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class BoardV3 {
    private CellV3[][] cells;
    public BoardV3(int x, int y,List<Obstacle> obstacleList){

        this.cells=new CellV3[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                int value=10*i;
                this.cells[i][j]=new CellV3(i,j,value+j+1,null,new DummyCell(value,value));
            }
        }
        fillObstacles(obstacleList);
    }
    private void fillObstacles(List<Obstacle> obstacleList){
        for(Obstacle obstacle:obstacleList){
            int value =obstacle.getFrom();
            int y=value%10;
            value=value%10;
            int x=value/10;
            this.cells[x][y].setObstacle(obstacle);
        }

    }
}
