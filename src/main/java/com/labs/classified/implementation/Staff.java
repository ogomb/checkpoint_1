package com.labs.classified.implementation;

import java.util.Date;
import java.util.Objects;

public class Staff implements Member, Comparable<Staff> {
    private double hoursWorked;
    private double salaryPaid;
    private String staffName;
    private int staffAge;
    private String staffAddress;
    public Date dateOfRegistration;
    private String bookBorrowed;

    public Staff(String staffName, String staffAddress,
                 int staffAge, double salaryPaid,
                 double hoursWorked) {
        dateOfRegistration = new Date();
        this.staffAddress = staffAddress;
        this.staffName =staffName;
        this.staffAge = staffAge;
        this.hoursWorked = hoursWorked;
        this.salaryPaid = salaryPaid;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalaryPaid() {
        return salaryPaid;
    }

    public void setSalaryPaid(double salaryPaid) {
        this.salaryPaid = salaryPaid;
    }

    public String getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(String bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }

    @Override
    public String getName() {
        return staffName;
    }

    @Override
    public void setName(String name) {
      this.staffName = name;
    }

    @Override
    public int getAge() {
        return staffAge;
    }

    @Override
    public void setAge(int age) {
        this.staffAge = age;
    }

    @Override
    public String getAddress() {
        return staffAddress;
    }

    @Override
    public void setAddress(String address) {
        this.staffAddress = address;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(dateOfRegistration, staff.dateOfRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfRegistration);
    }

    @Override
    public int compareTo(Staff student) {
        return dateOfRegistration.compareTo(student.dateOfRegistration);
    }
}
