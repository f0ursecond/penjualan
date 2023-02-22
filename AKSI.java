/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RPL
 */
public class AKSI {

    private String IDProduk, KodeProduk, NamaProduk, Satuan, Harga, Stok;
    private Connection aksiKoneksi;
    private PreparedStatement aksiPsmt;
    private Statement aksiStat;
    private ResultSet aksiResult;
    private String aksiQuery;

    public String getIDProduk() {
        return IDProduk;
    }

    public void setIDProduk(String IDProduk) {
        this.IDProduk = IDProduk;
    }

    public String getKodeProduk() {
        return KodeProduk;
    }

    public void setKodeProduk(String KodeProduk) {
        this.KodeProduk = KodeProduk;
    }

    public String getNamaProduk() {
        return NamaProduk;
    }

    public void setNamaProduk(String NamaProduk) {
        this.NamaProduk = NamaProduk;
    }

    public String getSatuan() {
        return Satuan;
    }

    public void setSatuan(String Satuan) {
        this.Satuan = Satuan;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    public String getStok() {
        return Stok;
    }

    public void setStok(String Stok) {
        this.Stok = Stok;
    }

    public AKSI() {
        try {
            Koneksi koneksi = new Koneksi();
            aksiKoneksi = koneksi.getKoneksi();
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

    public ResultSet tampilData() {
        aksiQuery = "select * from produk";
        try {
            aksiStat = aksiKoneksi.createStatement();
            aksiResult = aksiStat.executeQuery(aksiQuery);
        } catch (SQLException se) {
            System.out.println(se);
        }
        return aksiResult;
    }

    public void simpanData(String IDProduk, String KodeProduk, String NamaProduk, String Satuan, String Harga, String Stok) {
        aksiQuery = "insert into produk values (?,?,?,?,?,?)";
        try {
            aksiPsmt = aksiKoneksi.prepareStatement(aksiQuery);
            aksiPsmt.setString(1, IDProduk);
            aksiPsmt.setString(2, KodeProduk);
            aksiPsmt.setString(3, NamaProduk);
            aksiPsmt.setString(4, Satuan);
            aksiPsmt.setString(5, Harga);
            aksiPsmt.setString(6, Stok);
            
            aksiPsmt.execute();
            aksiPsmt.close();
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

    public void ubahData(String IDProduk, String KodeProduk, String NamaProduk, String Satuan, String Harga, String Stok) {
        aksiQuery = "update produk set NamaProduk=?, Satuan=?, Harga=?, Stok=? where KodeProduk=?";
        try {
            aksiPsmt = aksiKoneksi.prepareStatement(aksiQuery);
            aksiPsmt.setString(1, NamaProduk);
            aksiPsmt.setString(2, Satuan);
            aksiPsmt.setString(3, Harga);
            aksiPsmt.setString(4, Stok);
            aksiPsmt.setString(5, KodeProduk);

            aksiPsmt.executeUpdate();
            aksiPsmt.close();
        } catch (SQLException se) {
            System.out.println(se);
        }

    }

    public void hapusData(String KodeProduk) {
        aksiQuery = "delete from produk where KodeProduk = ?";
        try {
            aksiPsmt = aksiKoneksi.prepareStatement(aksiQuery);
            aksiPsmt.setString(1, KodeProduk);
            aksiPsmt.executeUpdate();
        } catch (SQLException se) {
            System.out.println(se);
        }
    }

}
