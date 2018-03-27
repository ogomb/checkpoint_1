package com.labs.classified.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookClub {
    public List<Student> studentMembers =new ArrayList<>();
    public List<Staff> staffMembers = new ArrayList<>();

    public void addStudent(){
        Student member = new Student("Lewis Taylor",
                "34311 TX", 32,
                "Maths");
        studentMembers.add(member);
        Collections.sort(studentMembers);
    }

    public void addStaff(){
        Staff member = new Staff("Lewis Taylor",
                "34311 TX", 32,
                32321, 3);
        staffMembers.add(member);
        Collections.sort(staffMembers);
    }
}
