/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Front extends javax.swing.JFrame {
    //Connection koneksi;
    /**
     * Creates new form FormLogin
     */
    public Front() {
        initComponents();
        

//    JLabel exit = new JLabel("Exit");
//    Font font = exit.getFont();
//    Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
//    exit.setFont(font.deriveFont(attributes));


        //this.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jTextField1 = new javax.swing.JTextField();
        TMasuk = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        TMasuk1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        TMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMasukMouseClicked(evt);
            }
        });
        getContentPane().add(TMasuk);
        TMasuk.setBounds(310, 240, 280, 210);

        exit.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("E x i t");
        exit.setToolTipText("");
        exit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(820, 431, 70, 30);

        TMasuk1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\mini_black2.png")); // NOI18N
        TMasuk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TMasuk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMasuk1MouseClicked(evt);
            }
        });
        getContentPane().add(TMasuk1);
        TMasuk1.setBounds(310, 240, 280, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TubesPBO/image/GAPAYTERA(4).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 470);

        setSize(new java.awt.Dimension(899, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMasukMouseClicked
        this.dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_TMasukMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void TMasuk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMasuk1MouseClicked
        this.dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_TMasuk1MouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TMasuk;
    private javax.swing.JLabel TMasuk1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
}
