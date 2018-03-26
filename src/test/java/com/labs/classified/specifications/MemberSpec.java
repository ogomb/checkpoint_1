package com.labs.classified.specifications;

import com.labs.classified.implementation.Member;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MemberSpec {

    private final String name ="Lewis Taylor";
    private final int age = 30;
    private final String address = "3131 NY";
    private Member member;

    @Before
    public void beforeTest() {
        member = new Member(name, age, address);
    }

    @Test
    public void whenInstantiatedThenNameIsSet() {
        assertEquals(member.getName(), name);
    }

    @Test
    public void whenInstantiatedThenAgeIsSet() {
        assertEquals(member.getAge(), age);
    }

    @Test
    public void whenInstantiatedThenAddressIsSet(){
        assertEquals(member.getAddress(), address);
    }

}
