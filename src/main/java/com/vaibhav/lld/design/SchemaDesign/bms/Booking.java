package com.vaibhav.lld.design.SchemaDesign.bms;

import com.vaibhav.lld.design.SchemaDesign.bms.strategt.Payment;

public class Booking {
    private int id;
    private Seat[] seats;
    private Hall hall;
    private Payment payment;
    private BookingStatus bookingStatus;
    private Coupon coupon;
    private Show show;
    private double price;
}
