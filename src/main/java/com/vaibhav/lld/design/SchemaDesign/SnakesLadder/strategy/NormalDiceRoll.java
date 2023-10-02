package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.strategy;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.Dice;

import java.util.Random;

public class NormalDiceRoll implements RollingDiceStrategy {
    @Override
    public int rollDice(int maxFace) {

        Random random = new Random();
        return random.nextInt((maxFace - 1) + 1) + 1;
    }
}
