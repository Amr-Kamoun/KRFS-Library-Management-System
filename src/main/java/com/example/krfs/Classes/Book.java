package com.example.krfs.Classes;

public class Book {
    private String Name;
    private double price;
    private String type;
    private String author;

    private boolean isBorrrowed;

    public boolean isBorrowed() {
        return isBorrrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrrowed = borrowed;
    }

    public Book(String BookName, double price, String type , String author ) {
        this.Name=BookName;
        this.price=price;
        this.type=type;
        this.author=author;
        isBorrrowed= false;
    }
    public Book(String BookName,  double price, String type ,  String author, boolean isBorrowed ) {
        this.Name=BookName;
        this.price=price;
        this.type=type;
        this.author=author;
        this.isBorrrowed=isBorrowed;
    }

    public String getType() {
        return type;
    }

    public String getBookName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }


    public void setBookName(String bookName) {
        Name = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //public void BorrowBook(){isBorrowed=true;}



}
