package com.vaibhav.lld.design.SchemaDesign.SnakesLadder;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v1.BoardV1;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.v3.BoardV3;
import lombok.Getter;

import java.util.Objects;

@Getter
public class Game {
    private Player[] players;
    private BoardV3 board;
    private Dice[] dice;
    private LeaderBoard leaderBoard;


    private Game(Player[] players, BoardV3 board, Dice[] dice, LeaderBoard leaderBoard) {
        this.board = board;
        this.dice = dice;
        this.leaderBoard = leaderBoard;
        this.players = players;
    }

    private Game() {
    }

    public static GameBuilder builder() {
        return new GameBuilder();
    }

    public int rollDice(Player player) {
        return player.rollDice(this.dice);
    }

    public BoardV1 move(Player player, Piece piece) {
        return null;
    }

    public PlayerStats[] getLeaderBoard() {
        return this.leaderBoard.getPlayerStats();
    }

    public static class GameBuilder {
        private Game game;

        private GameBuilder() {
            this.game = new Game();
        }

        public GameBuilder board(BoardV3 board) {
            this.game.board = board;
            return this;
        }

        public GameBuilder leaderboard(LeaderBoard board) {
            this.game.leaderBoard = board;
            return this;
        }

        public GameBuilder dice(Dice[] dice) {
            this.game.dice = dice;
            return this;
        }

        public GameBuilder players(Player[] players) {
            this.game.players = players;
            return this;
        }

        public Game build() {
            if (!isValidate()) {
                throw new IllegalArgumentException("Game cannot be created as requirement for game is not fulfilled");
            }
            if (!isPlayerValidation() || !isDiffPlayer()) {
                throw new IllegalArgumentException("Game cannot be started with one player");
            }

            Game game1 = new Game(this.game.players, this.game.board, this.game.dice, this.game.leaderBoard);
            return game1;
        }

        private boolean isValidate() {
            if (Objects.isNull(this.game.board) || Objects.isNull(this.game.dice)
                    || Objects.isNull(this.game.players)) {
                return false;
            }
            return true;
        }

        private boolean isPlayerValidation() {
            if (this.game.players.length >= 2) {
                return true;
            }
            return false;
        }

        private boolean isDiffPlayer() {
            for (int i = 0; i < this.game.getPlayers().length; i++) {
                for (int j = i + 1; j < this.game.getPlayers().length; j++) {
                    if (this.game.players[i].getUser().getId() == this.game.players[j].getUser().getId()) {
                        return false;
                    }
                }

            }
            return true;
        }

    }
}
