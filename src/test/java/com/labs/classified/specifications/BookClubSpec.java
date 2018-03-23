package com.labs.classified.specifications;

import com.labs.classified.implementation.BookClub;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BookClubSpec {

    private BookClub bookClub;

    @Before
    public final void before(){
        bookClub = new BookClub();
    }

    @Test
    public void whenAddClubMemberThenAddMember(){
        int initialMembers =bookClub.members.size();
        bookClub.addMember();
        assertEquals(bookClub.members.size(), initialMembers +1 );

    }

}
