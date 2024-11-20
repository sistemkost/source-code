/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus GK
 */

public class LoginManager{
    private final Connection conn;

    public LoginManager(Connection conn) {
        this.conn = conn;
    }

    public boolean authenticateUser(String username, String password) {
        String sql = """
            SELECT 'ADMIN' as user_type, username, password 
            FROM akun_admin 
            WHERE username = ? AND password = ?
            UNION
            SELECT 'PELANGGAN' as user_type, username, password 
            FROM akun_pelanggan 
            WHERE username = ? AND password = ?
        """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Set parameters for both queries
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, username);
            pstmt.setString(4, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // User found, set session
                    String userType = rs.getString("user_type");
                    UserSession.getInstance().login(username, userType);
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Authentication error: " + e.getMessage());
        }
        return false;
    }

    // Example login process in your login form
    public void processLogin(String username, String password) {
        if (authenticateUser(username, password)) {
            String userType = UserSession.getUserType();
            
            switch (userType) {
                case "ADMIN" -> {
                    // Open admin dashboard
                    new DaftarKamarAdmin().setVisible(true);
                }
                case "PELANGGAN" -> {
                    // Open customer dashboard
                    new DaftarKamarPelanggan().setVisible(true);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid user type");
                    return;
                }
            }
            
            // Close login window if needed
            // this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, 
                "Login gagal. Username atau password salah.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
