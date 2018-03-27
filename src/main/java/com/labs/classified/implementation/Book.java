package com.labs.classified.implementation;

public class Book {
    private String ISBNNumber;
    private String title;
    private String author;

    public Book(String title, String author, String ISBNNumber){
        this.title = title;
        this.author = author;
        this.ISBNNumber= ISBNNumber;
    }
    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
