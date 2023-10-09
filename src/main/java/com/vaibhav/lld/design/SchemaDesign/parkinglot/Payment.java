package com.vaibhav.lld.design.SchemaDesign.parkinglot;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor

public abstract class Payment {
    private PaymentType paymentType;
    private Date date;
    private PaymentStatus paymentStatus;
    private double amount;
    private String ticketId;

    // why ticket id see we can get the ticket id from invoice class but in reality we need to
    // do some join and them find all the payments done on this ticket.
    // if we add ticket id then we can just get the data for that ticket.
    public abstract void pay();


}
