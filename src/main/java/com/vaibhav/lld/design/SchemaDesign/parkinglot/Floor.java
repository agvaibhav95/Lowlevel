package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Floor {
    private int id;
    List<Slots> slotsList;
    private DisplayBoard displayBoard;
    private PaymentCounter paymentCounter;

}
