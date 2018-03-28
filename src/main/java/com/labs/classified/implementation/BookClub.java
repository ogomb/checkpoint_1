package com.labs.classified.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class BookClub {
    public List<Student> studentMembers =new ArrayList<>();
    public List<Staff> staffMembers = new ArrayList<>();
    public List<String> bookCollection = new ArrayList<>();

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

    public void addBookToCollection(Book book){
        String ISBNumber = book.getISBNNumber();
        bookCollection.add(ISBNumber);
    }

    public void borrowBook(Book book){
        String ISBNumber = book.getISBNNumber();
        if (bookCollection.size() == 0){
            throw new RuntimeException("No books currently in store");
        } else {
            removeBookFromCollection(book);
        }
    }

    public void removeBookFromCollection(Book book){
        String bookToBorrow = book.getISBNNumber();
        int locationOfBook = bookCollection.indexOf(bookToBorrow);
        bookCollection.remove(locationOfBook);
    }
}
