package com.labs.classified.specifications;

import static org.junit.Assert.*;

import com.labs.classified.implementation.Staff;
import org.junit.Before;
import org.junit.Test;

public class StaffSpec {
    private Staff staff;
    private final double hoursWorked = 3.5;
    private final double salaryPaid = 43123.00;
    private final String name = "Lewis Taylor";
    private final String address = "1344 NY";
    private final int age = 31;

    @Before
    public final void before(){
        staff = new Staff();
    }

    @Test
    public void whenInstantiatedThenSalaryPaidIsSet() {
        assertEquals(staff.getSalaryPaid(), salaryPaid);
    }

    @Test
    public void whenInstantiatedThenHoursWorkedIsSet(){
        assertEquals(staff.getHoursWorked(), hoursWorked);
    }
    @Test
    public void whenInstantiatedThenNameIsSet() {
        assertEquals(staff.getName(), name);
    }

    @Test
    public void whenInstantiatedThenAgeIsSet() {
        assertEquals(staff.getAge(), age);
    }

    @Test
    public void whenInstantiatedThenAddressIsSet(){
        assertEquals(staff.getAddress(), address);
    }
}
