package com.labs.classified.specifications;

import com.labs.classified.implementation.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class StudentSpec {
    private Student student;
    private final String subjectInterest = "Science";
    private final String name = "Lewis Taylor";
    private final String address = "1344 NY";
    private final int age = 31;

    @Before
    public final void before(){
        student = new Student(name,address,age,subjectInterest);
    }

    @Test
    public void whenInstantiatedThenSubjectIntrestIsSet(){
        assertEquals(student.getSubjectInterest(), subjectInterest);
    }

    @Test
    public void whenInstantiatedThenNameIsSet() {
        assertEquals(student.getName(), name);
    }

    @Test
    public void whenInstantiatedThenAgeIsSet() {
        assertEquals(student.getAge(), age);
    }

    @Test
    public void whenInstantiatedThenAddressIsSet(){
        assertEquals(student.getAddress(), address);
    }
    @Test
    public void whenInstantiatedThenDateOfRegistrationIsSet() {
        assertEquals(student.dateOfRegistration, new Date());
    }
}
