package com.labs.classified.specifications;

import com.labs.classified.implementation.Book;
import com.labs.classified.implementation.BookClub;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ListIterator;


public class BookClubSpec {

    private BookClub bookClub;
    private Book book;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before(){
        bookClub = new BookClub();
        book = new Book("Java Introduction",
                "Harvey, Paul Deitel",
                "31414144d");
    }

    @Test
    public void whenAddClubStudentThenAddMember(){
        int initialMembers =bookClub.studentMembers.size();
        bookClub.addStudent();
        assertEquals(bookClub.studentMembers.size(), initialMembers +1 );
    }

    @Test
    public void whenAddClubStaffThenAddMember(){
        int initialMembers =bookClub.staffMembers.size();
        bookClub.addStaff();
        assertEquals(bookClub.staffMembers.size(), initialMembers +1 );
    }

    @Test
    public void whenAddBookThenAddBookToCollection(){
        int numberOfBooksInCollection = bookClub.bookCollection.size();
        bookClub.addBookToCollection(book);
        assertEquals(bookClub.bookCollection.size(), numberOfBooksInCollection + 1 );
    }

    @Test
    public void whenBookIsBorrowedAndNoBooksInCollectionThrowError(){
        int numberOfBooksInCollection = bookClub.bookCollection.size();
        if (numberOfBooksInCollection < 0)
            exception.expect(RuntimeException.class);
    }

    @Test
    public void whenBookIsBorrowedAndBooksIsAvailableReduceCollection(){
        int numberOfBooksInCollection = bookClub.bookCollection.size();
        bookClub.addBookToCollection(book);
        bookClub.removeBookFromCollection(book);
        assertEquals(bookClub.bookCollection.size(), 0);
    }

}
