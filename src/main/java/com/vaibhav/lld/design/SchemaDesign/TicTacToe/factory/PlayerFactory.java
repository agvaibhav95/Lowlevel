package com.vaibhav.lld.design.SchemaDesign.TicTacToe.factory;

import com.vaibhav.lld.design.SchemaDesign.TicTacToe.BotPlayer;
import com.vaibhav.lld.design.SchemaDesign.TicTacToe.HumanPlayer;

public class PlayerFactory {
    //in order to remove dependency on subclasses as client code just need to pass type and it should be returned
    //player object
    public static HumanPlayer.HumanPlayerBuilder getHumanPlayer(){
        return HumanPlayer.builder();
    }

    public static BotPlayer.BotPlayerBuilder getBotPlayer(){
        return BotPlayer
                .builder();
    }
}
