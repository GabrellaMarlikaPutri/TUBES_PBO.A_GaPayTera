package TubesPBO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection conn;
    public static Connection getKoneksi(){
        String host = "jdbc:mysql://localhost/gapaytera",
               user = "root",
               pass = "";
    try{
       conn = (Connection) DriverManager.getConnection(host, user, pass);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(null, err.getMessage());
    }return conn;
    } 

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
