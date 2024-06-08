package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentRepo{

    private Student studentinfo;

    public void createDBAndTable() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/studentsdb";
        String username = "root"; // your username
        String password = "beayarisisme"; // your password
        Class.forName(driver); // optional
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Established Connection");


        Statement statement = connection.createStatement();
        String createDatabaseSQL = "CREATE DATABASE " + databaseName; statement.executeUpdate(createDatabaseSQL);
        System.out.println("Database '" + databaseName + "' created successfully.");

        String query = "Select * from students";
        String createTableSQL = "CREATE TABLE student1 (" + "id int
        auto_increment primary key," + "name varchar(255)," + "email varchar(255),";
        statement.executeUpdate(createTableSQL);
        System.out.println("Table ‘students’ created successfully.”);"}
    }
}




    public void insertIntoTable(Student studentinfo) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/studentsdb";
        String username = "root"; // your username
        String password = "beayarisisme"; // your password
        Class.forName(driver); // optional
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Established Connection");


        Statement statement = conn.createStatement();


        String insertData = "insert into student1(id, name, email) values(?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(insertData);

        preparedStatement.setString(1, studentinfo.getid());
        preparedStatement.setString(2, studentinfo.getname());
        preparedStatement.setString(3, studentinfo.getemail());
        preparedStatement.execute();
}


