package com.example.krfs.Classes;
//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;

public class User extends Person implements PersonFactory, Display {


    private ArrayList<Book> booksBought;
    private ArrayList<Book> booksBorrowed;


    public User(String name, String pass) {
        super(name, pass);
    }

    public void BorrowBook(String BookName,  double price, String type ,  String author )
    {
        Book book = new Book(BookName,  price, type ,  author );
        booksBorrowed.add(book);
    }
    public void BoughtBook(String BookName,  double price, String type ,  String author )
    {
        Book book = new Book(BookName,  price, type ,  author );
        booksBought.add(book);
    }
    public void BorrowBook(Book book)
    {
        int i =0;
        for(Book remv: booksBorrowed) {
            if ((remv.getBookName()) == (book.getBookName())) {
                booksBorrowed.remove(i);
            }
            i++;
        }
    }
    public void BoughtBook(Book book)
    {
        int i =0;
        for(Book remv: booksBought)
        {
            if((remv.getBookName())==(book.getBookName()))
            {
                booksBought.remove(i);
            }
            i++;
        }
    }


    public String DisplayDetails(){
        String m="";
        for(Book book: booksBorrowed)
        {
            m = m + book.getBookName();
        }
        return m;
    }

    @Override
    public Person makePerson(String name, String pass) {
        return new User(name, pass);
    }
}
