package com.vaibhav.lld.design.SchemaDesign.basics.v1;

public class Student {
    private String id;
    private String name;
    private String emailAddress;
    private String phoneNo;
}

/*
Version 1
        Following are the requirements of the ReScaler application:

        A student should be able to login with their email address and password.
        Students should be able to view their profile which includes their name, email address and phone number.
*/


// class diagram will be table in database
// attributes are columns
//class name is table name





//    ---------------------------------------------v2----------------------------///
//suppose we have multiple course
//each student can enroll in single courses

//if we use course in student class
//private String courseName;
//like this so db looks like
// 1 vaibhav abc@abc 123456789  biology
// 2 test    test@tes 454665644  maths
// 3 qwet    qwe@qwe   78945466  biology

// we have duplicat or redundant data in student class
// anomolies-- insert as i have to add new course which doesnt have any student so i have to
//NULL NULL NULL NULL  physics

//delete anomoly as well
//student data will get deleted



//so student has a course
//composition
//cardinality will be
//student(M):(Course)1
// now where to add course or student to have relation between them
//always add to M side
//course id will be added in student class
//private String courseId;


//now v3
// if