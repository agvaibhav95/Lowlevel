package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v1;


import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.CellV1;

public class BoardV1 {
    private CellV1[][] cells;
    private SnakeV1[] snakes;
    private LadderV1[] ladders;

    public BoardV1(int x,int y,SnakeV1[] snakes,LadderV1[] ladders){
        this.cells=new CellV1[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                this.cells[i][j]=new CellV1();
            }
        }
    }
// suppose tomorow frog also added then i need to add frog attribute here this is not extensible
    //ocp violation

}
