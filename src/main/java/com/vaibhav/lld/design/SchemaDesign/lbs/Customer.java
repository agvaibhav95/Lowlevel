package com.vaibhav.lld.design.SchemaDesign.lbs;

public class Customer extends User{
    private Book[] books;
    private Booking[] bookings;

    public double fetchFine(){
        return 0.0;
    }
}
