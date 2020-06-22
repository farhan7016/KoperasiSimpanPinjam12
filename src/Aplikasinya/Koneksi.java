package Aplikasinya;
import java.sql.Connection;
import java.sql.DriverManager;


public class Koneksi {
    public static Connection getConnection() {
        
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/koperasi_simpan_pinjam_anugrah_motor", "root","");
        } catch (Exception ex) {
            System.out.println("Koneksi Berhasil");
        }
        return con;
    }
}