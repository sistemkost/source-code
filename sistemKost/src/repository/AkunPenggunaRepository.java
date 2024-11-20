/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import controller.DatabaseConnection;
import model.AkunPelanggan;

/**
 *
 * @author Asus GK
 */
public class AkunPenggunaRepository extends DatabaseConnection implements Repository<AkunPelanggan> {
    private static AkunPenggunaRepository instance;
    
    private AkunPenggunaRepository(){
        try {
            DatabaseConnection.getConnection();
        } catch (SQLException e){
            throw new RuntimeException("Gagal Terkoneksi ke Database", e);
        }
    }
    
    public boolean existsByNomorKamar(String nomorKamar) {
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM kamar WHERE nomor_kamar = ?")) {
        
        stmt.setString(1, nomorKamar);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
    } catch (SQLException e) {
        }
    return false;
    }
    
    public static synchronized AkunPenggunaRepository getInstance() {
        if (instance == null) {
            instance = new AkunPenggunaRepository();
        }
    return instance;
    }
    
    @Override
    public void save(AkunPelanggan akunPelanggan) throws Exception {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                 "INSERT INTO akun_pelanggan (username, password, no_telp) VALUES (?, ?, ?)", 
                 Statement.RETURN_GENERATED_KEYS)) {
            
            pstmt.setString(1, akunPelanggan.getUsername());
            pstmt.setString(2, akunPelanggan.getPassword());
            pstmt.setString(3, akunPelanggan.getNoTelp());
            pstmt.executeUpdate();
        }
    }

    @Override
    public void update(AkunPelanggan entitas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}