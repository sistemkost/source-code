/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import model.*;
//import java.util.ArrayList;
//import model.AkunPelanggan;

public class ControllerAkunPelanggan {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pa_pbo";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static void registerAccount(String username, String password, String noTelp) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "INSERT INTO akun_pelanggan (username, password, no_telp) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                pstmt.setString(3, noTelp);
                pstmt.executeUpdate();
            }
        }
    }
}