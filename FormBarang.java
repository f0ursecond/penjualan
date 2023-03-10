/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author RPL
 */
public class FormBarang extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    private ResultSet hasil;
    AKSI aa = new AKSI();

    /**
     * Creates new form FormBarang
     */
    public FormBarang() {
        initComponents();
        tampilDb();
    }

    public void tampilDb() {

        Object[] baris = {"Kode Barang", "Nama Barang", "Satuan", "Harga", "Stok"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_barang.setModel(tabmode);

        try {
            hasil = aa.tampilData();
            while (hasil.next()) {

                aa.setKodeProduk(hasil.getString("KodeProduk"));
                aa.setNamaProduk(hasil.getString("NamaProduk"));
                aa.setSatuan(hasil.getString("Satuan"));
                aa.setHarga(hasil.getString("Harga"));
                aa.setStok(hasil.getString("Stok"));

                String[] data = {
                    aa.getKodeProduk(),
                    aa.getNamaProduk(),
                    aa.getSatuan(),
                    aa.getHarga(),
                    aa.getStok(),};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void reset() {
        txt_kode.setText("");
        txt_nama.setText("");

        txt_harga.setText("");
        txt_stok.setText("");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        txt_kode = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_satuan = new javax.swing.JComboBox();
        txt_stok = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_plus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA BARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(390, 390, 390))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BUSINNES CENTER SMK 9 SEMARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(280, 280, 280))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Satuan", "Harga", "Stok"
            }
        ));
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_barang);

        txt_satuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pcs", "Dus", "Kg" }));
        txt_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_satuanActionPerformed(evt);
            }
        });

        jLabel1.setText("KODE");

        jLabel2.setText("NAMA");

        jLabel3.setText("SATUAN");

        jLabel4.setText("HARGA");

        jLabel5.setText("STOK");

        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });

        btn_simpan.setText("Save");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_ubah.setText("Update");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setText("Delete");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("@Alif Zulfanur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_harga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_satuan, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_plus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_stok))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(73, 73, 73))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btn_plus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_ubah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_cancel)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        if (txt_kode.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Kode Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_nama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Nama Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_harga.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Harga Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_stok.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Stok Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                aa.setKodeProduk(txt_kode.getText());
                aa.setNamaProduk(txt_nama.getText());
                aa.setSatuan(txt_satuan.getSelectedItem().toString());
                aa.setHarga(txt_harga.getText());
                aa.setStok(txt_stok.getText());

                aa.simpanData(aa.getIDProduk(), aa.getKodeProduk(), aa.getNamaProduk(), aa.getSatuan(), aa.getHarga(), aa.getStok());
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                tampilDb();
                reset();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "data gagal ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
       reset();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        if (txt_kode.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Kode Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                aa.setKodeProduk(txt_kode.getText());
                aa.hapusData(aa.getKodeProduk());
                tampilDb();
                reset();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        if (txt_kode.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Kode Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_nama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Nama Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_harga.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Harga Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_stok.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf Stok Harus Diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                aa.setKodeProduk(txt_kode.getText());
                aa.setNamaProduk(txt_nama.getText());
                aa.setSatuan(txt_satuan.getSelectedItem().toString());
                aa.setHarga(txt_harga.getText());
                aa.setStok(txt_stok.getText());

                aa.ubahData(aa.getIDProduk(), aa.getKodeProduk(), aa.getNamaProduk(), aa.getSatuan(), aa.getHarga(), aa.getStok());
                JOptionPane.showMessageDialog(null, "Data berhasil dirubah");
                tampilDb();
                reset();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "data gagal ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_btn_ubahActionPerformed

    private void txt_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_satuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_satuanActionPerformed

    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        // TODO add your handling code here:
        int row = tabel_barang.rowAtPoint(evt.getPoint());
        
        String kode = tabel_barang.getValueAt(row, 0).toString();
        String nama = tabel_barang.getValueAt(row, 1).toString();
        String satuan = tabel_barang.getValueAt(row, 2).toString();
        String harga = tabel_barang.getValueAt(row, 3).toString();
        String stok = tabel_barang.getValueAt(row, 4).toString();
        
        txt_kode.setText(String.valueOf(kode));
        txt_nama.setText(String.valueOf(nama));
        txt_satuan.setSelectedItem(String.valueOf(satuan));
        txt_harga.setText(String.valueOf(harga));
        txt_stok.setText(String.valueOf(stok));

        
    }//GEN-LAST:event_tabel_barangMouseClicked

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JComboBox txt_satuan;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
