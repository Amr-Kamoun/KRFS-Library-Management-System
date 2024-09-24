package com.example.krfs.Classes;
public class CrimeFictionBooks extends Book{
    private boolean isSeries;
    private boolean isFilmed;

    public boolean isSeries() {
        return isSeries;
    }

    public void setSeries(boolean series) {
        isSeries = series;
    }

    public boolean isFilmed() {
        return isFilmed;
    }

    public void setFilmed(boolean filmed) {
        isFilmed = filmed;
    }

    public CrimeFictionBooks(String BookName, String author, double price, String type, boolean isFilmed, boolean isSeries) {
        super(BookName,price,type,author );
        this.isFilmed = isFilmed;
        this.isSeries = isSeries;
    }

    public String DisplayDetails() {
        return ("Book Title: "+ super.getBookName() + "\nBook Author: " + super.getAuthor()  + "\nBook Price: " + super.getPrice() + "\nBook category: " + super.getType() + "\nBook is Filmed: " + this.isFilmed() + "\nBook is Series: " + this.isSeries());
    }
}
