package com.vaibhav.lld.design.SchemaDesign.parkinglot;

import com.vaibhav.lld.design.SchemaDesign.parkinglot.factory.FeeCalculationFactory;
import com.vaibhav.lld.design.SchemaDesign.parkinglot.strategy.FeeCalculationStrategy;

public class PaymentCounter {
    private ParkingAttendant attendant;
    // private Invoice invoice;
    // again same explanation as of ticket in entry gate as we have multiple invoices generated fot same slot and
    //even for same vehicle
    private FeeCalculationStrategy feeCalculationStrategy;

    public void pay(Payment payment) {
        payment.pay();
    }

    public void checkout() {
        // it will fetch all the payments made for the ticket id and it will calculate agin price if
        //paid amount is same then true
        //or ask for payment
    }
    public double getFare(Vehicle vehicle, Ticket ticket){
      return FeeCalculationFactory.getFeeCalculator(vehicle).calulateFees(ticket);
    }

}
