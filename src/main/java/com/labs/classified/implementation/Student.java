package com.labs.classified.implementation;

import java.util.Date;

public class Student implements Member {
    private String name;
    private int age;
    private String address;
    private String subjectInterest;
    public Date dateOfRegistration;

    public Student(String name, String address,
                   int age, String subjectInterest){
        dateOfRegistration = new Date();
        this.name= name;
        this.age = age;
        this.address = address;
        this.subjectInterest = subjectInterest;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubjectInterest() {
        return subjectInterest;
    }

    public void setSubjectInterest(String subjectInterest) {
        this.subjectInterest = subjectInterest;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }
}
