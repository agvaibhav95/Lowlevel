package com.vaibhav.lld.design.SchemaDesign.pen;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.*;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.flyweight.User;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.strategy.BucketRollingDice;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.strategy.NormalDiceRoll;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Obstacle;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v2.Snake;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v3.BoardV3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnakeLadderTest {
    private List<Obstacle> getObstacles(){
        List<Obstacle> obstacleList=new ArrayList<>();
        obstacleList.add(new Snake(40,5));
        obstacleList.add(new Snake(25,15));
        obstacleList.add(new Snake(11,2));
        obstacleList.add(new Snake(99,1));
        obstacleList.add(new Snake(67,24));
        obstacleList.add(new Snake(11,28));
        obstacleList.add(new Snake(37,48));
        obstacleList.add(new Snake(7,24));
        obstacleList.add(new Snake(70,92));
        return obstacleList;
    }
    private BoardV3 getBoard(){
        BoardV3 boardV3= new BoardV3(10,10,getObstacles());
        return boardV3;
    }
    private Player[] getPlayer(){
        Player[] players=new Player[2];
        Piece[] pieces=new Piece[2];
        pieces[0]=new Piece(COLOR.PINK);
        pieces[1]=new Piece(COLOR.PINK);
        User user= User.builder().id("1").mobno("9999999999").name("vaibhav").photo(new byte[100]).build();
        User user1= User.builder().id("2").mobno("9999990099").name("test").photo(new byte[100]).build();
        players[0]=Player.builder().piece(pieces).user(user).rollingDiceStrategy(new BucketRollingDice()).build();

        Piece[] pieces1=new Piece[2];
        pieces1[0]=new Piece(COLOR.BLACK);
        pieces1[1]=new Piece(COLOR.BLACK);
        players[1]=Player.builder().piece(pieces).user(user1).rollingDiceStrategy(new NormalDiceRoll()).build();
        return players;
    }
    @Test
    public void snakeLadder(){
        Dice[] dice=new Dice[2];
        dice[0]=new Dice(6);
        dice[1]=new Dice(6);
        Game game=Game.builder()
                .board(getBoard())
                .dice(dice)
                .players(getPlayer())
                .build();
    }
}
