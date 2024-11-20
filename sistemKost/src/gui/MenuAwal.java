/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author riendra
 */

public class MenuAwal extends javax.swing.JFrame {
    public MenuAwal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegister = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegister.setBackground(new java.awt.Color(0, 51, 51));
        btnRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 110, 40));

        buttonKeluar.setBackground(new java.awt.Color(0, 51, 51));
        buttonKeluar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonKeluar.setForeground(new java.awt.Color(255, 255, 255));
        buttonKeluar.setText("KELUAR");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 110, 40));

        buttonLogin.setBackground(new java.awt.Color(0, 51, 51));
        buttonLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("LOGIN");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_gui/menuawal.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
//      buat nutup frame sekarang
        this.dispose();
        
//      buat tujuan gui setelah tombol di klik
        MenuRegister FrameRegister = new MenuRegister();
        FrameRegister.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            MenuLogin menuLogin = new MenuLogin();
            menuLogin.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAwal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        // TODO add your handling code here:    
        int konfirmasi = JOptionPane.showConfirmDialog(
            this, 
            "Apakah Anda yakin ingin keluar dari aplikasi?", 
            "Konfirmasi Keluar", 
            JOptionPane.YES_NO_OPTION
        );
    
        if (konfirmasi == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_buttonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAwal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}