package com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.Ticket;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.Vehicle;

public class SmallVehicleFeeCalulation implements FeeCalculationStrategy{
    @Override
    public double calulateFees(Ticket ticket) {
        // for 1 hr--50
        // then 2nd hr --80
        return 100d;
    }
}
