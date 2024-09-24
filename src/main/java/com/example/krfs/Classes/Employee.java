package com.example.krfs.Classes;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person implements PersonFactory{
    public Employee(String name, String pass) {
        super(name, pass);
    }

    public void updatePrice(int price, Book book) {
        book.setPrice(price);
    }

    public void addEmployee(String name, String pass) {
        Employee employee = new Employee(name, pass);
    }

    public void addUser(String name, String pass) {
        User user = new User(name, pass);
    }

    public void addBook(String BookName, double price, String type, String author) {
        Book book = new Book(BookName, price, type, author);
    }
    @Override
    public Person makePerson(String name, String pass) {
        return new Employee(name, pass);
    }
}