package com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.Ticket;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.Vehicle;

public interface FeeCalculationStrategy {
    public double calulateFees(Ticket ticket);
}
