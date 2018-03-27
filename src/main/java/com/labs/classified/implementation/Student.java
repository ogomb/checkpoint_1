package com.labs.classified.implementation;

import java.util.Date;
import java.util.Objects;

public class Student implements Member, Comparable<Student> {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(dateOfRegistration, student.dateOfRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfRegistration);
    }

    @Override
    public int compareTo(Student student) {
        return dateOfRegistration.compareTo(student.dateOfRegistration);
    }
}
