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

public class Saldo extends javax.swing.JFrame {
    int saldo,no;
    private Connection conn;
    private Statement stat;
    private PreparedStatement ps;
    java.util.Date tglsekarang = new java.util.Date();
    private final SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private final String date = smpdtfmt.format(tglsekarang);
    
    
    public Saldo() {
        initComponents();
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        tgl1.setText(date);
        setJam();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_kartu = new javax.swing.JTextField();
        nominal = new javax.swing.JTextField();
        pass_kartu = new javax.swing.JPasswordField();
        fCek = new javax.swing.JButton();
        fTambahSaldo = new javax.swing.JButton();
        tgl1 = new javax.swing.JLabel();
        waktu = new javax.swing.JLabel();
        TBatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        id_kartu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(id_kartu);
        id_kartu.setBounds(70, 280, 450, 60);

        nominal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(nominal);
        nominal.setBounds(70, 500, 450, 60);

        pass_kartu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(pass_kartu);
        pass_kartu.setBounds(70, 390, 450, 60);

        fCek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fCek.setText("CEK");
        fCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCekActionPerformed(evt);
            }
        });
        getContentPane().add(fCek);
        fCek.setBounds(80, 590, 120, 50);

        fTambahSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fTambahSaldo.setText("TAMBAH SALDO");
        fTambahSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fTambahSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTambahSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(fTambahSaldo);
        fTambahSaldo.setBounds(220, 590, 170, 50);

        tgl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tgl1.setForeground(new java.awt.Color(255, 255, 255));
        tgl1.setText("tanggal");
        getContentPane().add(tgl1);
        tgl1.setBounds(80, 210, 150, 20);

        waktu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        waktu.setForeground(new java.awt.Color(255, 255, 255));
        waktu.setText("tanggal");
        getContentPane().add(waktu);
        waktu.setBounds(430, 210, 130, 20);

        TBatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TBatal.setText("BATAL");
        TBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBatalActionPerformed(evt);
            }
        });
        getContentPane().add(TBatal);
        TBatal.setBounds(410, 590, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TubesPBO/image/Ga-PaySaldo2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 680);

        setSize(new java.awt.Dimension(576, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCekActionPerformed
        String transaksi = id_kartu.getText();
        int coba;
        cekSaldo();

    }//GEN-LAST:event_fCekActionPerformed

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
    
    private void fTambahSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTambahSaldoActionPerformed
        cekSaldo();   
        CekPass();
    }//GEN-LAST:event_fTambahSaldoActionPerformed

    private void TBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBatalActionPerformed
        this.dispose();
        new Menu().setVisible(true);
        
    }//GEN-LAST:event_TBatalActionPerformed

    public void Tambah(){
        String transaksi = id_kartu.getText();
        String tambahan=nominal.getText();
        int tambah=Integer.parseInt(tambahan);
         try{
            tambah=tambah+saldo;
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            
            String sql="update aktivasikartu set Saldo ='"+tambah+"'where ID_Kartu='"+id_kartu.getText()+"'";
            ps = conn.prepareStatement(sql);
            ps.execute(sql);
            JOptionPane.showMessageDialog(null, "SALDO BERHASIL DITAMBAHKAN MENJADI Rp."+tambah, "ISI SALDO Ga-PayTera", JOptionPane.INFORMATION_MESSAGE);
            CatatPendapatan();
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "GAGAL MELAKUKAN PENGISIAN SALDO!", "ISI SALDO Ga-PayTera", JOptionPane.WARNING_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saldo().setVisible(true);
            }
        });
    }
    
    public void cekSaldo(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera", "root", "");
            stat = conn.createStatement();
            String sql="select * from aktivasikartu where "+ "ID_Kartu='" +id_kartu.getText() +"'";
            ResultSet RUser = stat.executeQuery(sql); 
            
            if(RUser.next()){
                saldo = RUser.getInt(3);
                JOptionPane.showMessageDialog(null, "Saldo Kartu Ga-PayTera Anda "+saldo,"ISI SALDO Ga-PayTera",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN", "CEK SALDO Ga-PayTera" , JOptionPane.WARNING_MESSAGE);
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        public void CatatPendapatan(){
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera","root","");
            Statement stat = conn.createStatement();
            String sql="SELECT * FROM pendapatan WHERE No_Transaksi IN(SELECT MAX(No_Transaksi) FROM pendapatan)";
            ResultSet RaUser = stat.executeQuery(sql);
            if(RaUser.next()){
                no = RaUser.getInt(1);
            }
            }catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null,"Gagal Transaksi!!!");
            }
            String tgl = tgl1.getText();
            String keluaran = nominal.getText();
            int i=1;
            try{
            i=i+no;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera","root","");
            Statement stat = conn.createStatement();
            String in = "INSERT INTO pendapatan VALUES("+i+",'"+tgl+"','"+keluaran+"')";
            stat.executeUpdate(in);
            JOptionPane.showMessageDialog(null, "PEMBAYARAN BERHASIL DICATAT", "PAYMENT with Ga-PayTera", JOptionPane.INFORMATION_MESSAGE);                             
            }catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null, "Transaksi Gagal !!!","",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        public void CekPass(){
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gapaytera","root","");
                Statement stat = conn.createStatement();
                ResultSet RaUser = stat.executeQuery("SELECT * FROM aktivasikartu WHERE ID_Kartu ='"+id_kartu.getText()+ "'And Password_Kartu='"+pass_kartu.getText()+"'");
                if(RaUser.next()){
                    Tambah();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf ID_Kartu atau Password salah!", "Login Karyawan", JOptionPane.WARNING_MESSAGE);
                    pass_kartu.setText("");
                    id_kartu.setText("");
                    nominal.setText("");
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal!", "Informasi", JOptionPane.WARNING_MESSAGE);
            }
            
        
            
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TBatal;
    private javax.swing.JButton fCek;
    private javax.swing.JButton fTambahSaldo;
    private javax.swing.JTextField id_kartu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nominal;
    private javax.swing.JPasswordField pass_kartu;
    private javax.swing.JLabel tgl1;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables
}
