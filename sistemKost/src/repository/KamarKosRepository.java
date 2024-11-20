/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import controller.DatabaseConnection;
import model.KamarKos;

/**
 *
 * @author Asus GK
 */
public class KamarKosRepository extends DatabaseConnection implements Repository<KamarKos>{
    private static KamarKosRepository instance;
    
    private KamarKosRepository(){
        try {
            DatabaseConnection.getConnection();
        } catch (SQLException e){
            throw new RuntimeException("Gagal Terkoneksi ke Database", e);
        }
    }
    
    public static synchronized KamarKosRepository getInstance() {
        if (instance == null) {
            instance = new KamarKosRepository();
        }
    return instance;
    }
    
    @Override
    public void save(KamarKos kamarKos) throws Exception {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(
                 "INSERT INTO kamar (nomor_kamar, harga_bulan, status, fasilitas, lokasi, ukuran, daya_listrik, pemilik, no_telp_pemilik) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", 
                 Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, kamarKos.getNomorKamar());
            pstmt.setDouble(2, kamarKos.getHargaBulan());
            pstmt.setString(3, kamarKos.getStatus());
            pstmt.setString(4, kamarKos.getFasilitas());
            pstmt.setString(5, kamarKos.getLokasi());
            pstmt.setString(6, kamarKos.getUkuran());
            pstmt.setString(7, kamarKos.getDayaListrik());
            pstmt.setString(8, kamarKos.getPemilik());
            pstmt.setString(9, kamarKos.getNoTelpPemilik());
            pstmt.executeUpdate();
        }
    }

@Override
public void update(KamarKos kamarKos) throws Exception {
    try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(
             "UPDATE kamar SET " +
             "harga_bulan = ?, " +
             "status = ?, " +
             "fasilitas = ?, " +
             "lokasi = ?, " +
             "ukuran = ?, " +
             "daya_listrik = ?, " +
             "pemilik = ?, " +
             "no_telp_pemilik = ? " +
             "WHERE nomor_kamar = ?")) {
        
        pstmt.setDouble(1, kamarKos.getHargaBulan());
        pstmt.setString(2, kamarKos.getStatus());
        pstmt.setString(3, kamarKos.getFasilitas());
        pstmt.setString(4, kamarKos.getLokasi());
        pstmt.setString(5, kamarKos.getUkuran());
        pstmt.setString(6, kamarKos.getDayaListrik());
        pstmt.setString(7, kamarKos.getPemilik());
        pstmt.setString(8, kamarKos.getNoTelpPemilik());
        pstmt.setString(9, kamarKos.getNomorKamar());
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected == 0) {
            throw new SQLException("Updating room failed, no rows affected.");
            }
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
    
    public void delete(String nomorKamar) throws Exception {
    try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(
             "DELETE FROM kamar WHERE nomor_kamar = ?")) {
        
        pstmt.setString(1, nomorKamar);
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected == 0) {
            throw new SQLException("Deleting room failed, no rows affected.");
        }
    }
}
}