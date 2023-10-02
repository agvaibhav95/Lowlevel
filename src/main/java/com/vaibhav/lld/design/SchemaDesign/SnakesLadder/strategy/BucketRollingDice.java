package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.strategy;

import java.util.Random;

public class BucketRollingDice implements RollingDiceStrategy{


    @Override
    public int rollDice(int maxFace) {
        Random rand = new Random();
        return rand.nextInt((maxFace - 1) + 1) + 1;
    }
}
