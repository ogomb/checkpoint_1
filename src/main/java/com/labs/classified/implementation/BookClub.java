package com.labs.classified.implementation;

import java.util.*;

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

    public String borrowBook(Book book, Member... members){
        ArrayList<Staff> staffQueue =  new ArrayList<>();
        ArrayList<Student> studentQueue = new ArrayList<>();

        String ISBNumber = book.getISBNNumber();
        int peopleRequestingBook = members.length;
        if (bookCollection.size() == 0) {
            return "No books currently in store";
        }
        if(peopleRequestingBook > 0) {
                ArrayList<Member> queueOfBorrowers = new ArrayList<>(Arrays.asList(members));
                for(Member member: queueOfBorrowers){
                    if (member instanceof Student){
                        studentQueue.add((Student) member);
                    }else
                    staffQueue.add((Staff) member);
                }
                Collections.sort(staffQueue);
                Collections.sort(studentQueue);

               for (String bookToBorrow: bookCollection){
                   if (bookToBorrow.equals(ISBNumber)) {
                       if (staffQueue.size() > 0){
                           removeBookFromCollection(book);
                           return "Book issued to " + staffQueue.get(0).getName();
                       }else {
                           removeBookFromCollection(book);
                           return "Book issued to " + studentQueue.get(0).getName();
                       }
                   }else {
                       return "Such book does not exist";
                   }
               }
        }
        if(peopleRequestingBook < 1){
                return "You are not allowed to borrow a book";
        }
        return "Can't borrow this book." + staffQueue;
    }

    public void removeBookFromCollection(Book book){
        String bookToBorrow = book.getISBNNumber();
        int locationOfBook = bookCollection.indexOf(bookToBorrow);
        bookCollection.remove(locationOfBook);
    }
}
