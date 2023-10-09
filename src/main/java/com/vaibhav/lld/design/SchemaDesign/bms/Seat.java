package com.vaibhav.lld.design.SchemaDesign.bms;

public class Seat {
    private int id;
    private SeatType type;
    // why cant i have status here as booked vacant etc
    //bcz if there is a show at 12 and we someone booked a seat then i am booking for show at 6:00 then
    //it will show status as filled bcoz show seat is full but next show seat is empty and this seat is
    //physical seat.
}
