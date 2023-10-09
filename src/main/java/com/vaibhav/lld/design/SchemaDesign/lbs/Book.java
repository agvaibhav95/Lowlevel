package com.vaibhav.lld.design.SchemaDesign.lbs;

import java.util.Date;

public class Book {
    private int id;
    private String category;
    private String name;
    private String author;
    private Date dateOfPublication;
    //private IssueCard[] issueCard;
    //why multiple issue cards as if issue card gets fulled then new issue card
    //why not to keep in book class
    //bcoz it has 1:m relationship
    // and we try to keep things at 1 side
}
