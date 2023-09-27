package com.vaibhav.lld.design.SchemaDesign.TicTacToe;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.strategy.EasyPlayingStrategy;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.strategy.HardPlayingStrategy;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.strategy.MediumPlayingStrategy;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.strategy.PlayingStrategy;


import java.util.Objects;

public class BotPlayer extends Player {
    private DifficultyLevel difficultyLevel;
    //bot will have diff levels
    ///and each level will have diff playing startegy for bot
    private PlayingStrategy playingStrategy;

    private BotPlayer(DifficultyLevel level, Symbol symbol) {
        super(symbol);
        this.difficultyLevel = level;

    }

    @Override
    public Board play(Board board, Cell cell) {
        switch (difficultyLevel) {
            case EASY:
                this.playingStrategy = new EasyPlayingStrategy();
                break;
            case MEDIUM:
                this.playingStrategy = new MediumPlayingStrategy();
                break;
            case HARD:
                this.playingStrategy = new HardPlayingStrategy();
                break;
        }
        playingStrategy.play(board,cell);
        return board;
    }

    public static BotPlayerBuilder builder() {
        return new BotPlayerBuilder();
    }

    public static class BotPlayerBuilder {
        private DifficultyLevel difficultyLevel;
        private Symbol symbol;

        private BotPlayerBuilder() {
        }

        public BotPlayer build() {
            if (!validate()) {
                throw new IllegalArgumentException("player fields cannot be null");
            }
            BotPlayer botPlayer = new BotPlayer(this.difficultyLevel, this.symbol);
            return botPlayer;
        }

        public BotPlayerBuilder difficultyLevel(DifficultyLevel difficultyLevel) {
            this.difficultyLevel = difficultyLevel;
            return this;
        }

        public BotPlayerBuilder symbol(Symbol symbol) {
            this.symbol = symbol;
            return this;
        }

        private boolean validate() {
            if (Objects.isNull(this.symbol) || Objects.isNull(this.difficultyLevel)) {
                return false;
            }
            return true;
        }

    }
}
