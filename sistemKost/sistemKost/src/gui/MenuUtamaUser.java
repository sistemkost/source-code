/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author riendra
 */
public class MenuUtamaUser extends javax.swing.JFrame {

    /**
     * Creates new form menuutamauser
     */
    public MenuUtamaUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali1 = new javax.swing.JButton();
        btnKembali3 = new javax.swing.JButton();
        btnKembali4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali1.setBackground(new java.awt.Color(255, 255, 102));
        btnKembali1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnKembali1.setText("Daftar Kamar");
        btnKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        btnKembali3.setBackground(new java.awt.Color(255, 255, 102));
        btnKembali3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnKembali3.setText("Jadwal Pembayaran");
        btnKembali3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, -1));

        btnKembali4.setBackground(new java.awt.Color(255, 255, 102));
        btnKembali4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnKembali4.setText("Riwayat Pembayaran");
        btnKembali4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_gui/menuutamapelanngan.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali1ActionPerformed
//        setterPanel.removeAll();
//        setterPanel.repaint();
//        setterPanel.revalidate();
//        setterPanel.add(panelTabelBuku);
//        setterPanel.repaint();
//        setterPanel.revalidate();
//        clearField();
//        comboKaryawan.setEnabled(false);
    }//GEN-LAST:event_btnKembali1ActionPerformed

    private void btnKembali3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembali3ActionPerformed

    private void btnKembali4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembali4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtamaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuUtamaUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali1;
    private javax.swing.JButton btnKembali3;
    private javax.swing.JButton btnKembali4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}