package com.labs.classified.specifications;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookSpec {
    private Book book;
    private final String ISBNNumber = "2423432414RER";
    private final String title = "Java Programming Language";
    private final String author = "Paul & Harvey Deitel";

    @Before
    public final void before(){
        book = new Book();
    }

    @Test
    public void whenInstantiatedThenISBNNumberIsSet() {
        assertEquals(book.getISBNNumber(), ISBNNumber);
    }

    @Test
    public void whenInstantiatedThenTitleIsSet() {
        assertEquals(book.getTitle(), title);
    }

    @Test
    public void whenInstantiatedThenAuthorIsSet(){
        assertEquals(book.getAuthor(), author);
    }
}
