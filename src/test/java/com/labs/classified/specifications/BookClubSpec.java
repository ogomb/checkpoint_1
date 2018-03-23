package com.labs.classified.specifications;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookClubSpec {

    @Rule
    private BookClub bookClub;

    @Before
    public final void before(){
        bookClub = new BookClub();
    }

    @Test
    public whenaddClubMemberThenaddMember(){
        int initialMembers =bookClub.members.size();
        bookClub.addMember();
        Assert.assertEquals(bookClub.members.size(), initialMembers+1 );

    }

}
