package com.labs.classified.implementation;

public class Student implements Member {
    private String name;
    private int age;
    private String address;
    private String subjectInterest;

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
}
