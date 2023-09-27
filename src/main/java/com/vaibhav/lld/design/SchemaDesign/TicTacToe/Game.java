package com.vaibhav.lld.design.SchemaDesign.TicTacToe;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer.ConsecutiveColWinner;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer.ConsecutiveRowWinner;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer.WinningPatternsObserver;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.observer.WinningRules;
import lombok.Getter;

import java.util.*;

@Getter
public class Game extends WinningRules {
    private Board board;
    private Player[] players;
    // we can change to list as we can have multiple players

    private Queue<Player> playersQueue;


    //in order to record which player will move next
    private Game(Board board, Player[] players, List<WinningPatternsObserver> winningPatternsObservers) {
        this.players = new Player[2];
        this.board = board;

        this.players = players;
        this.playersQueue = new LinkedList<>();
        for (int i = 0; i < players.length; i++) {
            playersQueue.add(players[i]);
        }
        winningPatternsObservers.forEach(x -> addWinningRules(x));
    }

    public void startGame() {
        Player player = playersQueue.peek();
        System.out.println("game started");
        System.out.println("player please move " + player.getSymbol().toString());


    }

    public boolean checkWinner( Player player) {
        if (checkWinner(this.board)) {
            System.out.println("Game is over as winner is"+player.getSymbol());
            return true;
        }
        return false;
    }

    private boolean checkGameTie( Player player) {
        if (this.board.getAvailbaleCells().isEmpty()) {
            System.out.println("Game is tie");
            return true;
        }
        return false;
    }

    private void fetchPlayerAndPlay(Player player, Cell cell) {
        playersQueue.poll();
        playersQueue.add(player);
        player.play(board, cell);
    }

    public void makeMove(Player player, int x,int y) {
        Player player1 = playersQueue.peek();

            Cell cell=this.board.getCells()[x][y];

            cell.setSymbol(player.getSymbol());
            if (player1.equals(player)) {
                if (this.board.getAvailbaleCells().contains(cell)) {
                    this.board.removeAvailableCells(cell);
                } else {
                    throw new RuntimeException("invalid move as this cell is alread filled " + this.board);
                }
                fetchPlayerAndPlay(player1, cell);
            } else {
                throw new InputMismatchException("player " + player.getSymbol() + " cannot move");
            }
            if(checkWinner(player1) ||checkGameTie(player1)){
                return;
            }

        player1 = playersQueue.peek();
        if (player1 instanceof BotPlayer) {
            Cell abvailableCell=this.board.getAvailbaleCells().get(this.board.getAvailbaleCells().size()-1);
            fetchPlayerAndPlay(player1, abvailableCell);
            this.board.removeAvailableCells(abvailableCell);

        }
        if(checkWinner(player1) ||checkGameTie(player1)){
            return;
        }
        System.out.println("now player " + player1.getSymbol() + " will move");

    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }

    public static class GameBuilder {
        private Board board;
        private Player[] players;
        private List<WinningPatternsObserver> winningPatternsObservers;


        private GameBuilder() {
        }

        public GameBuilder board(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder players(Player player1, Player player2) {
            this.players = new Player[2];
            this.players[0] = player1;
            this.players[1] = player2;
            return this;
        }


        public Game build() {

            if (!validate()) {
                throw new IllegalArgumentException("Game cannot be created as mandotory fields are null");
            }
            if (!playerValidation()) {
                throw new IllegalArgumentException("both players cannot be bot");
            }
            if (!playerValidationSymbol()) {
                throw new IllegalArgumentException("both players cannot have same symbol");
            }
            List<WinningPatternsObserver> winningPatternsObservers1 = new ArrayList<>();
            winningPatternsObservers1.add(new ConsecutiveRowWinner());
            winningPatternsObservers1.add(new ConsecutiveColWinner());
            this.winningPatternsObservers = winningPatternsObservers1;

            Game game = new Game(this.board, this.players, this.winningPatternsObservers);
            return game;
        }

        private boolean validate() {
            if (Objects.isNull(this.board) || Objects.isNull(this.players) || Objects.isNull(this.players[0]) || Objects.isNull(this.players[1])) {
                return false;
            }

            return true;
        }

        private boolean playerValidation() {
            int botPlayers = 0;
            for (int i = 0; i < this.players.length; i++) {
                if (this.players[i] instanceof BotPlayer) {
                    botPlayers++;
                }

            }
            if (botPlayers >= 2) {
                return false;
            }
            return true;

        }

        private boolean playerValidationSymbol() {
            Map<Symbol, Integer> map = new HashMap<>();
            for (int i = 0; i < this.players.length; i++) {
                if (map.containsKey(players[i].getSymbol())) {
                    return false;
                } else {
                    map.put(players[i].getSymbol(), 1);
                }

            }
            return true;

        }

    }
}