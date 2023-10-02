package com.vaibhav.lld.design.SchemaDesign.parkinglot.factory;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.Ticket;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.Vehicle;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy.FeeCalculationStrategy;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy.LargeVehicleFeeCalculation;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy.MediumVehicleFeeCalculation;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy.SmallVehicleFeeCalulation;

public class FeeCalculationFactory {
    public static FeeCalculationStrategy getFeeCalculator(Vehicle vehicle){
        switch (vehicle.getVehicleType()){
            case SMALL:
                return new SmallVehicleFeeCalulation();
            case MEDIUM:
                return new MediumVehicleFeeCalculation();
            case LARGE:
                return new LargeVehicleFeeCalculation();
        }
        throw new IllegalArgumentException("Invalid vehicle type");
    }
}
