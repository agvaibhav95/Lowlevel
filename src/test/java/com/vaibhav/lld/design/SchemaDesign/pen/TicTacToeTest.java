package com.vaibhav.lld.design.SchemaDesign.pen;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.*;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.flyweight.User;
import org.junit.Test;

import java.util.InputMismatchException;

public class TicTacToeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testGame(){
        Game game= Game.getBuilder().build();
        game.startGame();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGame1(){
        User user=new User("Vaibhav","vaibhav@test.com",new byte[100]);
        Board board=  Board.builder().x(3).y(3).build();

        Player player1= HumanPlayer.builder().id("1").symbol(Symbol.X).build();
        Player player2= HumanPlayer.builder().id("2").symbol(Symbol.X).build();
        Game game= Game.getBuilder().board(board).players(player1,player2).build();
        game.startGame();
    }

    @Test(expected = InputMismatchException.class)
    public void testGame2(){
        User user=new User("Vaibhav","vaibhav@test.com",new byte[100]);
        User user1=new User("abc","abcv@test.com",new byte[100]);
        Board board=  Board.builder().x(3).y(3).build();

        Player player1= HumanPlayer.builder().id("1").symbol(Symbol.X).user(user).build();
        Player player2= HumanPlayer.builder().id("2").symbol(Symbol.O).user(user1).build();
        Game game= Game.getBuilder().board(board).players(player1,player2).build();
        game.startGame();
        game.makeMove(player2, 1,2);
    }

    @Test(expected = RuntimeException.class)
    public void testGame3(){
        User user=new User("Vaibhav","vaibhav@test.com",new byte[100]);
        User user1=new User("abc","abcv@test.com",new byte[100]);
        Board board=  Board.builder().x(3).y(3).build();

        Player player1= HumanPlayer.builder().id("1").symbol(Symbol.X).user(user).build();
        Player player2= HumanPlayer.builder().id("2").symbol(Symbol.O).user(user1).build();
        Game game= Game.getBuilder().board(board).players(player1,player2).build();
        game.startGame();
        game.makeMove(player1, 1,2);
        game.makeMove(player2, 1,2);
    }

    @Test
    public void testGame4Win(){
        User user=new User("Vaibhav","vaibhav@test.com",new byte[100]);
        User user1=new User("abc","abcv@test.com",new byte[100]);
        Board board=  Board.builder().x(3).y(3).build();

        Player player1= HumanPlayer.builder().id("1").symbol(Symbol.X).user(user).build();
        Player player2= HumanPlayer.builder().id("2").symbol(Symbol.O).user(user1).build();
        Game game= Game.getBuilder().board(board).players(player1,player2).build();
        game.startGame();
        game.makeMove(player1, 1,2);
        game.makeMove(player2, 0,2);
        game.makeMove(player1, 1,1);
        game.makeMove(player2, 0,1);
        game.makeMove(player1, 1,0);
    }

    @Test
    public void testGame5Tie(){
        User user=new User("Vaibhav","vaibhav@test.com",new byte[100]);
        User user1=new User("abc","abcv@test.com",new byte[100]);
        Board board=  Board.builder().x(3).y(3).build();

        Player player1= HumanPlayer.builder().id("1").symbol(Symbol.X).user(user).build();
        Player player2= HumanPlayer.builder().id("2").symbol(Symbol.O).user(user1).build();
        Game game= Game.getBuilder().board(board).players(player1,player2).build();
        game.startGame();
        game.makeMove(player1, 1,2);
        game.makeMove(player2, 0,2);
        game.makeMove(player1, 1,1);
        game.makeMove(player2, 0,1);
        game.makeMove(player1, 0,0);
        game.makeMove(player2, 1,0);
        game.makeMove(player1, 2,0);
        game.makeMove(player2, 2,2);
        game.makeMove(player1, 2,1);
    }
}
