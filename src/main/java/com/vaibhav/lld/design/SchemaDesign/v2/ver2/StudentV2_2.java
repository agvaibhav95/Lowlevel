package com.vaibhav.lld.design.SchemaDesign.v2.ver2;

public class StudentV2_2 {
    private String id;
    private String name;
    private String emailAddress;
    private String phoneNo;
    private String courseId;
}

//so student has a course
//composition
//cardinality will be
//student(M):(Course)1
// now where to add course or student to have relation between them
//always add to M side
//course id will be added in student class
//private String courseId;

// and seperate class for course
