package com.vaibhav.lld.design.SchemaDesign.TicTacToe.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    // all intrinsic value of player
    private String name;
    private String email;
    private byte[] photo;
}
