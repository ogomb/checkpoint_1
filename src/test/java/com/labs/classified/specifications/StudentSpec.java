package com.labs.classified.specifications;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentSpec {
    private Student student;
    private final String subjectInterest = "Science";

    @Before
    public final void before(){
        student = new Student();
    }

    @Test
    public void whenInstantiatedThenSubjectIntrestIsSet(){
        assertEquals(student.getSubjectIntrest(), subjectInterest);
    }
}
