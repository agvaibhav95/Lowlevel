package com.vaibhav.lld.design.SchemaDesign.SnakesLadder.flyweight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String name;
    private String mobno;
    private byte[] photo;

}
