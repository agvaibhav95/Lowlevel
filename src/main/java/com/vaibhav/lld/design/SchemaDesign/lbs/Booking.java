package com.vaibhav.lld.design.SchemaDesign.lbs;

import java.util.Date;

public class Booking {
    private int id;
    private Book book;
    private Date issueDate;
    private Date returnDate;
    private User issuer;
    private User issuee;
}
