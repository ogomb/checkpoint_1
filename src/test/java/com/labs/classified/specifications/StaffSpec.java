package com.labs.classified.specifications;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StaffSpec {
    private Staff staff;
    private final double hoursWorked = 3.5;
    private final double salaryPaid = 43123.00;

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
}
