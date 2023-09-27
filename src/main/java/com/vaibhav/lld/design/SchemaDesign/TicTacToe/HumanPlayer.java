package com.vaibhav.lld.design.SchemaDesign.TicTacToe;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.flyweight.User;

import java.util.Objects;

public class HumanPlayer extends Player {
    private String id;
    private User user;

    private HumanPlayer(Symbol symbol, User user, String id) {
        super(symbol);
        this.id = id;
        this.user = user;
    }

    private HumanPlayer() {
    }

    @Override
    public Board play(Board board,Cell cell) {
System.out.println("cell is" +cell.getSymbol()+cell.getX()+cell.getY());
        Cell[][] cells =board.getCells();
        cells[cell.getX()][cell.getY()]=cell;
        return board;
    }


    public static HumanPlayerBuilder builder() {
        return new HumanPlayerBuilder();
    }

    public static class HumanPlayerBuilder {
        private HumanPlayer humanPlayer;
        private Symbol symbol;

        private HumanPlayerBuilder() {
            this.humanPlayer = new HumanPlayer();
        }

        public HumanPlayerBuilder id(String id) {
            this.humanPlayer.id = id;
            return this;
        }

        public HumanPlayerBuilder symbol(Symbol symbol) {
            this.symbol = symbol;
            return this;
        }

        public HumanPlayerBuilder user(User user) {
            this.humanPlayer.user = user;
            return this;
        }

        public HumanPlayer build() {
            if(!validate()){
                throw new IllegalArgumentException("player fields cannot be null");
            }
            HumanPlayer humanPlayer1 = new HumanPlayer(this.symbol, this.humanPlayer.user, this.humanPlayer.id);
            return humanPlayer1;
        }

        private boolean validate() {
            if (Objects.isNull(this.humanPlayer.id )|| (Objects.isNull(this.symbol)) || Objects.isNull(this.humanPlayer.user)) {
                return false;
            }
            return true;
        }
    }
}
