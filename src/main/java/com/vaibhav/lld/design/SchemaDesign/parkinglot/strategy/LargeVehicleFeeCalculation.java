package com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.Ticket;

public class LargeVehicleFeeCalculation implements FeeCalculationStrategy{
    @Override
    public double calulateFees(Ticket ticket) {
        return 500d;
    }
}
