package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.CellV1;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v1.LadderV1;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v1.SnakeV1;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class BoardV2 {
    private CellV1[][] cells;
   // private List<Obstacle> obstacleList;
    //read readme
    private Map<Integer,Obstacle> map; // solution 1 instead of using obstacle list


    public BoardV2(int x, int y, List<Obstacle> obstacleList){
            map=new HashMap<Integer,Obstacle>();
        //this.obstacleList=obstacleList;
        for(Obstacle obstacle:obstacleList){
            map.put(obstacle.getFrom(),obstacle);
        }
        this.cells=new CellV1[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                this.cells[i][j]=new CellV1();
            }
        }
    }

}
//check readme file in v2
