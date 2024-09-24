package com.example.krfs.Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public  class Loader {
    public Loader(){}

    static public Person[] persons = {
            new Person("Fouad","1234",true),
            new Person("Rani","5678",true),
            new Person("Safina","2468",false)
    };
    public static ObservableList<Book> list = FXCollections.observableArrayList(

            new Book ("aa", 555, "","fouad"),
            new Book ("aaaa", 5555555, " kamoun Fashel","fouad"),
            new Book ("aaaaa", 5555555, " yasmin","fouad")

    );




    public static boolean IsAdmin(String username, String Password){

        for ( Person person : persons) {
            if (username.equals(person.getName())  && Password.equals(person.getPass())&& person.isAdmin() ) return true;

        }

         return false;
    }
    public static boolean IsUser(String username, String Password){
        for ( Person person : persons) {
            if (username.equals(person.getName())  && Password.equals(person.getPass()) ) return true;

        }
        return false;
    }


    // From Lab 4

    private ArrayList<Record> records = new ArrayList<Record>();
    String filename;

    public void readFromFile() {
        records.clear();
        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
//                records.add( createRecordFrom(line));

            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error occured while excuting.");
        }
    }

    public void saveToFile(){
        try{
            File f = new File(filename);
            PrintWriter p = new PrintWriter(f);
            for (int i = 0; i < records.size(); i++) {
//                String line = records.get(i).lineRepresentation();
                if (i != (records.size() - 1)) {
//                    p.print(line + "\n");
                } else {
//                    p.print(line);
                }
            }
            p.close();
        }catch(FileNotFoundException ex){
            System.out.println("Error occured while excuting.");
        }
    }
//
//    public ArrayList<Record> returnAllRecords() {
//        return records;
//    }
//
//    public Record getRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (records.get(i).getSearchKey().equalsIgnoreCase(key)) {
//                return records.get(i);
//            }
//        }
//
//        return null;
//    }
//    public boolean contains(String key) {
//
//        for (int i = 0; i < records.size(); i++) {
//            if (records.get(i).getSearchKey().equalsIgnoreCase(key)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public void deleteRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (records.get(i).getSearchKey().equalsIgnoreCase(key)) {
//                records.remove(i);
//            }
//        }
//    }
//
//    public void insertRecord(Record record) {
//        for(int i = 0 ; i < records.size() ; i++)
//        {
//            if(records.get(i).getSearchKey().equalsIgnoreCase(record.getSearchKey()))
//                return;
//        }
//        records.add(record);
//    }

    //public abstract Record createRecordFrom(String line);
}
