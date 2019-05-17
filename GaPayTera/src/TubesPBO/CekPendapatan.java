/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class CekPendapatan extends javax.swing.JFrame {
    private Connection conn;
    private Statement stm;
    int hasil;
    private DefaultTableModel tabmode;
    java.util.Date tglsekarang = new java.util.Date();
    private final SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    private final String date = smpdtfmt.format(tglsekarang);

    /**
     * Creates new form CekPendapatan
     */
    public CekPendapatan() {
        initComponents();
        tgl1.setText(date);
        setJam();
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    }

    public final void setJam(){
        ActionListener taskPerformer = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";

            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();

            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            if(nilai_detik <= 9) nol_detik= "0";

            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);

            waktu.setText(jam+":"+menit+":"+detik+"");
        }
    };
    
    new Timer(1000, taskPerformer).start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JPasswordField();
        tanggal = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        khasil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TBatal = new javax.swing.JButton();
        waktu = new javax.swing.JLabel();
        tgl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(428, 504));
        getContentPane().setLayout(null);

        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pass);
        pass.setBounds(290, 150, 170, 30);

        tanggal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tanggal);
        tanggal.setBounds(290, 210, 170, 30);

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TubesPBO/image/cari2.png"))); // NOI18N
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(470, 160, 70, 60);

        tabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No_Transaksi", "Pemasukan"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 270, 130);

        khasil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(khasil);
        khasil.setBounds(310, 270, 150, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("TOTAL PENDAPATAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 240, 150, 30);

        TBatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TBatal.setText("BATAL");
        TBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBatalActionPerformed(evt);
            }
        });
        getContentPane().add(TBatal);
        TBatal.setBounds(310, 320, 150, 40);

        waktu.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        waktu.setForeground(new java.awt.Color(255, 255, 255));
        waktu.setText("jam");
        getContentPane().add(waktu);
        waktu.setBounds(470, 80, 80, 20);

        tgl1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        tgl1.setForeground(new java.awt.Color(255, 255, 255));
        tgl1.setText("tanggal");
        getContentPane().add(tgl1);
        tgl1.setBounds(20, 80, 150, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TubesPBO/image/Pendapatan.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 550, 400);

        setSize(new java.awt.Dimension(549, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        CekPass();
    }//GEN-LAST:event_cariActionPerformed

    private void TBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBatalActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_TBatalActionPerformed

    public void CekHasil(){
        Object[] baris={"No_Transaksi","Pemasukan"};
        tabmode=new DefaultTableModel(null, baris);
        tabel.setModel(tabmode);
        String sql="select No_Transaksi,Pemasukan from pendapatan where "+ "Tgl_Transaksi='" +tanggal.getText() +"'";
    
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            stm = conn.createStatement();
            ResultSet RUser = stm.executeQuery(sql); 

            while(RUser.next()){
                String No_Transaksi = RUser.getString("No_Transaksi");
                String Pemasukan = RUser.getString("Pemasukan");
                String[] data={No_Transaksi,Pemasukan};
                tabmode.addRow(data);
                }
            
        CetakHasil();
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void CetakHasil(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            stm = (com.mysql.jdbc.Statement) conn.createStatement();
            
            String sql ="SELECT sum(Pemasukan) FROM pendapatan WHERE "+ "Tgl_Transaksi='" +tanggal.getText()+"'";
            ResultSet RUser = stm.executeQuery(sql);
            if(RUser.next()){
               hasil=RUser.getInt(1);
               String hasillagi = Integer.toString(hasil); 
               khasil.setText("Rp "+hasillagi);
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null,"GAGAL!!!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(CekPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekPendapatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekPendapatan().setVisible(true);
            }
        });
    }
    
    public void CekPass(){
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera","root","");
                Statement stat = conn.createStatement();
                ResultSet RaUser = stat.executeQuery("SELECT * FROM LoginKaryawan WHERE Password_Karyawan='"+pass.getText()+"'");
                if(RaUser.next()){
                    CekHasil();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Password salah!", "Login Karyawan", JOptionPane.INFORMATION_MESSAGE);
                    pass.setText("");
                    tanggal.setText("");
                    khasil.setText("");
                }
            }catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal!", "Informasi", JOptionPane.WARNING_MESSAGE);
            }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TBatal;
    private javax.swing.JButton cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField khasil;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tanggal;
    private javax.swing.JLabel tgl1;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables
}
