package com.labs.classified.specifications;

import com.labs.classified.implementation.*;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.*;


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
        String message = bookClub.borrowBook(book);
        if (numberOfBooksInCollection < 0)
            assertThat(message, containsString("No books"));
    }

    @Test
    public void whenBookIsBorrowedAndBooksIsAvailableReduceCollection(){
        int numberOfBooksInCollection = bookClub.bookCollection.size();
        bookClub.addBookToCollection(book);
        bookClub.removeBookFromCollection(book);
        assertEquals(bookClub.bookCollection.size(), 0);
    }

    @Test
    public void whenBookIsBorrowedByStudentsThenFirstStudentGetsIt(){
        Student student1 = new Student("Donald Trump",
                "342434",34,"Civics");
        Student student2 = new Student("Derrick Meyer",
                "34134",54,"Physics");
        bookClub.addBookToCollection(book);
        String message = bookClub.borrowBook(book,student1,student2);
        assertThat(message, containsString("Donald"));
        }

    @Test
    public void whenBookIsBorrowedByStaffAndStudentThenStaffGetsIt(){
        Student student = new Student("Donald Trump",
                "342434",34,"Civics");
        Staff staff = new Staff("Rick Meyers",
                "32432",67,
                234234.6,4.2);
        bookClub.addBookToCollection(book);
        String message = bookClub.borrowBook(book, student, staff);
        assertThat(message, containsString("Rick Meyers"));
    }

    @Test
    public void whenBookIsReturnedThenCollectionShouldIncrease(){
        String ISBNNumber = "343434";
        Student student = new Student("Donald Trump",
                "342434",34,"Civics");
        bookClub.returnBorrowedBook(ISBNNumber, student );
        assertThat(bookClub.bookCollection, hasItem(ISBNNumber));
    }
}


