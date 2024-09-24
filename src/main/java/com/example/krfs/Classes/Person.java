package com.example.krfs.Classes;
public class Person implements PersonFactory
{
    public String Username;
    public String Password;
    private boolean Admin= false;

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean admin) {
        Admin = admin;
    }

    public Person(String name, String pass)
    {
        this.Username = name;
        this.Password = pass;

    }
    public Person(String name, String pass, boolean Admin)
{
    this.Username = name;
    this.Password = pass;
    this.Admin=Admin;

}

    public String getName() {
        return Username;
    }


    public String getPass() {
        return Password;
    }

    public void setName(String name) {
        this.Username = name;
    }



    public void setPass(String pass) {
        Password = pass;
    }


    @Override
    public Person makePerson(String name, String pass) {
        return new Person(name,pass);
    }
}
