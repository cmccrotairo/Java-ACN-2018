package com.databases;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\tr_lnd_user\\Desktop\\Java\\Java-ACN-2018\\java-acn-cmccr-2018\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tr_lnd_user\\Desktop\\Java\\Java-ACN-2018\\java-acn-cmccr-2018\\testjava.db");
//            conn.setAutoCommit(false); //
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS "+ TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_CONTACTS+" ("+COLUMN_NAME+" text, "+COLUMN_PHONE+" integer, "+COLUMN_EMAIL+" text)");
            insertContact(statement,"Cha",1234678,"cha@gmail.com");
            insertContact(statement,"Tim",87654321,"tim@gmail.com");
            insertContact(statement,"Brian",2222344,"brian@gmail.com");
            insertContact(statement,"Max",443322,"max@gmail.com");

            statement.execute("UPDATE "+TABLE_CONTACTS+" SET " +COLUMN_PHONE+ "=111122444 where " +COLUMN_NAME+ "='Tim'");
            statement.execute("DELETE FROM "+TABLE_CONTACTS+" WHERE " +COLUMN_NAME+ "='Brian'");



//            statement.execute("Select * from contacts");
//            ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("select * from "+TABLE_CONTACTS);
            while(results.next()){ //checks if results still has values
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) + " " + results.getString(COLUMN_EMAIL));
            }
            results.close();

            statement.close(); //good practice
            conn.close();      //good practice
        }catch(SQLException e){
            System.out.println("Something" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException  {
        statement.execute("INSERT INTO "+TABLE_CONTACTS+"("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+") values ('"+name+"', "+phone+", '"+email+"')");
    }

}
