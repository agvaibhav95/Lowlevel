package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@AllArgsConstructor
@Getter
public class DisplayBoard {
    List<Slots> availableSlots;
}
