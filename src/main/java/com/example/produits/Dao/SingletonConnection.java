package com.example.produits.Dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class SingletonConnection {
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBproduits","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
