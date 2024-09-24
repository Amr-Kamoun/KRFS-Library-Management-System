package com.example.krfs.Classes;
public class HorrorBooks extends Book{
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public HorrorBooks(String BookName, String author, double price, String type, int level) {
        super(BookName,price,type,author);
        this.level = level;
    }

    public String DisplayDetails() {
        return ("Book Title: "+ super.getBookName() + "\nBook Author: " + super.getAuthor() + "\nBook Price: " + super.getPrice() + "\nBook category: " + super.getType() + "\nBook Horror Level: " + this.getLevel());
    }
}
