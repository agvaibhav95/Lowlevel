package com.vaibhav.lld.design.SchemaDesign.v4;

public class Student {
    private String id;
    private String name;
    private Module[] modules;// this will not be there in database as we are creating new table for their relation
}

