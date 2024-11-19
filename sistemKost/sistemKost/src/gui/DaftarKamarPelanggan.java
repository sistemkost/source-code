/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.*;
//import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riendra
 */
public final class DaftarKamarPelanggan extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    public DaftarKamarPelanggan() {
    initComponents();
    setupTable();
    tampilkanDaftarKamar();
    }
    
    private void setupTable() {
    String[] columnNames = {
        "Nomor Kamar", 
        "Lantai", 
        "Harga/Bulan", 
        "Harga/Tahun", 
        "Status", 
        "Fasilitas", 
        "Gambar"
    };
    
    tableModel = new DefaultTableModel(columnNames, 0) {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Make table read-only
        }
    };
        tabelDaftarKamar.setModel(tableModel);
    }

    
    
    public void tampilkanDaftarKamar(){
       try {
            // Koneksi ke database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pa_pbo", "root", "");
            
            // Query
            String sql = "SELECT * FROM kamar";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            tableModel.setRowCount(0);
            
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("nomor_kamar"),
                    rs.getString("lantai"),
                    rs.getDouble("harga_bulan"),
                    rs.getDouble("harga_tahun"),
                    rs.getString("status"),
                    rs.getString("fasilitas"),
                    rs.getString("gambar")
                };
                tableModel.addRow(rowData);
            }            

            // Tutup koneksi
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
//            LOGGER.log(Level.SEVERE, "Error accessing database", e);
//            JOptionPane.showMessageDialog(this,
//                "Error accessing database: " + e.getMessage(),
//                "Database Error",
//                JOptionPane.ERROR_MESSAGE);            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // </editor-fold>
    
    /**
     * Creates new form daftarkamar
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftarKamar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelDaftarKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "nomor kamar", "lantai", "harga per bulan", "harga per tahun", "status kamar", "fasilitas", "gambar kamar"
            }
        ));
        jScrollPane1.setViewportView(tabelDaftarKamar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_gui/daftarkamar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarKamarPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DaftarKamarPelanggan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDaftarKamar;
    // End of variables declaration//GEN-END:variables
}