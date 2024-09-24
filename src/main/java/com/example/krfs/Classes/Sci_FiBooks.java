package com.example.krfs.Classes;
public class Sci_FiBooks extends Book {
    private String topic;

    public Sci_FiBooks(String BookName, String author, double price, String type, String topic) {
        super(BookName,price,type, author);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String DisplayDetails() {
        return ("Book Title: "+ super.getBookName() + "\nBook Author: " + super.getAuthor()  + "\nBook Price: " + super.getPrice() + "\nBook category: " + super.getType() + "\nBook topic: " + this.getTopic());
    }
}
