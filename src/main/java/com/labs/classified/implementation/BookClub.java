package com.labs.classified.implementation;

import java.util.ArrayList;
import java.util.List;

public class BookClub {
    public List<Member> members =new ArrayList<>();

    public void addMember(){
        Member member = new Student("Lewis Taylor",
                "34311 TX", 32,
                "Maths");
        members.add(member);
    }
}
