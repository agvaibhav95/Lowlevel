package com.vaibhav.lld.design.SchemaDesign.v3.ver2;

public class Student {
    private String id;
    private String name;
    private String emailAddress;
    private String phoneNo;
    private Course[] courses;
}

// here we are taking array of courses
// here is M:M mapping
// whenever there is m:m mapping
//we tend to create new relationship table
//student_course_mapping table name
//id   student_id   course_id
