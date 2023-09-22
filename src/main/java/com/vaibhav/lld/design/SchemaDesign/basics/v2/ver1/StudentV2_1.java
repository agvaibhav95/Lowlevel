package com.vaibhav.lld.design.SchemaDesign.basics.v2.ver1;

public class StudentV2_1{
    private String id;
    private String name;
    private String emailAddress;
    private String phoneNo;
    private String courseName;
}


//if we use coursename in student class without having any course class
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

// so course cannot exist without student obj



