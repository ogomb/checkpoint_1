package com.labs.classified.implementation;

import java.util.Date;

public class Staff implements Member {
    private double hoursWorked;
    private double salaryPaid;
    private String staffName;
    private int staffAge;
    private String staffAddress;
    private Date dateOfRegistration;

    public Staff(){
        dateOfRegistration = new Date();
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
}
