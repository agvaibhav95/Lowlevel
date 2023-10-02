package com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.Ticket;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.Vehicle;

public class MediumVehicleFeeCalculation implements FeeCalculationStrategy{
    @Override
    public double calulateFees(Ticket ticket) {
        // here 1st hr--80
        //for 2nd hour 100
        return 200d;
    }
}
