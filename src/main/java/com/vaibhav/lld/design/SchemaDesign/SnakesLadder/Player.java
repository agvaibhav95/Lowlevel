package com.vaibhav.lld.design.SchemaDesign.SnakesLadder;

import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.flyweight.User;
import com.vaibhav.lld.design.SchemaDesign.SnakesLadder.strategy.RollingDiceStrategy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Player {
    private User user;
    private Piece[] piece;
    private RollingDiceStrategy rollingDiceStrategy;

    public int rollDice(Dice[] dice){
        int sum=0;
        for(Dice dice1:dice){
            sum+= dice1.getFaceNumber();
        }
        return rollingDiceStrategy.rollDice(sum);
    }

}
