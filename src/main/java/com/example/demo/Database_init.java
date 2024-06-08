package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database_init {
    public static void main(String[] args) {
        try {
             String driver = "com.mysql.cj.jdbc.Driver";
             String url = "jdbc:mysql://localhost:3306/studentsdb";
             String username = "root"; // your username
             String password = "beayarisisme"; // your password
             Class.forName(driver); // optional
             Connection conn = DriverManager.getConnection(url, username, password);
             System.out.println("Established Connection");
         } catch (Exception e) {
             e.printStackTrace(); // TODO: handle exception
         }
    }
}
