package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Parkinglot {
    private Gate[] entryGates;
    private Gate[] exitGates;
    //private DisplayBoard displayBoard;
    // as we do have multiple entry gates and it is better to have this at each entry level in order to assign
    private Floor[] floors;
    private String id;
    private String name;
    private String address;

}
