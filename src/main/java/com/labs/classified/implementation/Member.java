package com.labs.classified.implementation;

public interface Member {

    public String name = null;
    public int age = 0;
    public String address = null;
    public String bookBorrowed = null;

    public String getBookBorrowed();

    public void setBookBorrowed(String bookBorrowed);

    public String getName();

    public void setName(String name);

    public int getAge();

    public void setAge(int age);

    public String getAddress();

    public void setAddress(String address);
}
