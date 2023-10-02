package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@Getter
@AllArgsConstructor
public class Parkinglot {
    private List<EntryGate> entryPointList;
    private List<ExitGate> exitPointList;
    private DisplayBoard displayBoard;
    private Floor[] floors;
    private String id;
    private String name;
    private String address;

}
