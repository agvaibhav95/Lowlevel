package com.vaibhav.lld.design.SchemaDesign.basics.v3.ver1;

public class Student {
    private String id;
    private String name;
    private String emailAddress;
    private String phoneNo;
    private String courseId1;
    private String courseId2;
    private String courseId3;
    private String courseId4;
}

//this is M:M relationship
// lots of null values
// wastage of space
//quering
//--- get all students with courseid1--> then need to query in all four col
