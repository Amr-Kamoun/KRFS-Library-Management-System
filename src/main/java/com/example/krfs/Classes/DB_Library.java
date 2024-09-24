
package com.example.krfs.Classes;

import java.sql.*;
import java.util.ArrayList;

public class DB_Library {
    private  static String HOST= "127.0.0.1";
    private  static int PORT= 3306;
    //private  static String DB_NAME= "db_library";
    private  static String USERNAME= "root";
    private  static String PASSWORD= "";
    private static Connection connection;
    public static Connection getConnect() throws SQLException {
        connection= DriverManager.getConnection(String.format("jdbc:mysql://localhost:3306/db_library"),USERNAME,PASSWORD);
        return connection;
    }

    public static void main (String args[]) throws SQLException {
        int x=1;
        //private ArrayList<String> loadNames() throws SQLException {
            ArrayList<String>  names = new ArrayList<>();
            //names.add("alo");

            Connection  connection= DriverManager.getConnection(String.format("jdbc:mysql://localhost:3306/db_library"),"root","");
            String query= "SELECT * FROM Users";
            try{
                Statement statement = connection.createStatement();
                ResultSet queryOutput = statement.executeQuery(query);

                while(queryOutput.next()){
                    //System.out.println(x);
                    System.out.println(queryOutput.getString(x));
                    //names.add(queryOutput.getString(x));
                    //x++;
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
           // return names;
        }
    }
    //ArrayList<String> names= loadNames();

//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_library","root","");
//
//            Statement stnt = con.createStatement();
//            ResultSet rs = stnt.executeQuery("select * from users");
//            System.out.println("ahhh");
//            PreparedStatement insert= con.prepareStatement("insert into users(username,password,admin)values(?,?,?)");
//            insert.setString(1,"name");
//            insert.setString(2,"name");
//            insert.setString(3,"3");
//            insert.executeUpdate();
//            while(rs.next())
//                 System.out.println(rs.getInt(1)+" "+ rs.getString(2));
//            con.close();
//        }catch (Exception e)
//        {
//            System.out.println(e);
//        }


//        static public Person[] persons = {
//                new Person("Fouad","1234",true),
//                new Person("Rani","5678",true),
//                new Person("Safina","2468",false)
//        };




