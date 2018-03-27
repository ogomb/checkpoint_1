package com.labs.classified.specifications;

import com.labs.classified.implementation.BookClub;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class BookClubSpec {

    private BookClub bookClub;

    @Before
    public final void before(){
        bookClub = new BookClub();
    }

    @Test
    public void whenAddClubMemberThenAddMember(){
        int initialMembers =bookClub.studentMembers.size();
        bookClub.addMember();
        assertEquals(bookClub.studentMembers.size(), initialMembers +1 );

    }

}
