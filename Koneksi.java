/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RPL
 */
public class Koneksi {
    private Connection connect;
        private String driverName = "com.mysql.jdbc.Driver";
        private String url = "jdbc:mysql://localhost:3306/penjualan";
        private String username = "root";
        private String password = "";
        
        
    public Connection getKoneksi() throws SQLException {
        if (connect == null) {
            try {
                Class.forName(driverName);
                System.out.println("driver ditemukan");
                
                try {
                    connect = DriverManager.getConnection(url,username,password);
                    System.out.println("db connected");
                } catch (SQLException se){
                    System.out.println("connection failed" + se);
                }
                
            } catch (ClassNotFoundException cnfe){
                System.out.println("driver tidak ditemukan" + cnfe);
            }
        }
        return connect;
    }
}
