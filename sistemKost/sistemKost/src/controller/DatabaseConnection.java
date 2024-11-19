package controller;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import javax.swing.JOptionPane;

public abstract class DatabaseConnection {
    private static Connection connection;
    
    protected static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pa_pbo", 
                "root", 
                ""
            );
        }
        return connection;
    }
    
    protected static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}