package com.labs.classified.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookClub {
    public List<Student> studentMembers =new ArrayList<>();

    public void addMember(){
        Student member = new Student("Lewis Taylor",
                "34311 TX", 32,
                "Maths");
        studentMembers.add(member);
        Collections.sort(studentMembers);
    }
}
