/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ramaz
 */
public class Urunler extends javax.swing.JFrame {

    /**
     * Creates new form Ürünler
     */
    public Urunler() {
        initComponents();
        SelectUrun();
        GetKat();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    public void SelectUrun() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.URUNTBL");
            UrunTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }
    }
    private void GetKat()
    {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
            St = Con.createStatement();
            String query = "Select * from User1.URUNTBL"; 
            Rs = St.executeQuery(query);
            while(Rs.next())
            {
                String Mykat = Rs.getString("KATADI");
                KatCb.addItem(Mykat);
            }     
        } catch (Exception e) {

        }
    }        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        UrunId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        UrunAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        KatCb = new javax.swing.JComboBox();
        EkleBtn = new javax.swing.JButton();
        SilBtn = new javax.swing.JButton();
        GuncelleBtn = new javax.swing.JButton();
        TemizleBtn = new javax.swing.JButton();
        UrunMik = new javax.swing.JTextField();
        UrunFiyat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UrunTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("ÜRÜN LİSTESİ");
        jLabel4.setToolTipText("");

        UrunId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunId.setForeground(new java.awt.Color(255, 102, 0));
        UrunId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("PRODID");
        jLabel2.setToolTipText("");

        UrunAdi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunAdi.setForeground(new java.awt.Color(255, 102, 0));
        UrunAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunAdiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("ADI");
        jLabel3.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("KATEGORİ");
        jLabel7.setToolTipText("");

        KatCb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        KatCb.setForeground(new java.awt.Color(255, 102, 0));
        KatCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "İçecek", "Sebze", "Et" }));
        KatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatCbActionPerformed(evt);
            }
        });

        EkleBtn.setBackground(new java.awt.Color(255, 102, 0));
        EkleBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EkleBtn.setForeground(new java.awt.Color(255, 255, 255));
        EkleBtn.setText("Ekle");
        EkleBtn.setBorder(null);
        EkleBtn.setBorderPainted(false);
        EkleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EkleBtnMouseClicked(evt);
            }
        });
        EkleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleBtnActionPerformed(evt);
            }
        });

        SilBtn.setBackground(new java.awt.Color(255, 102, 0));
        SilBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SilBtn.setForeground(new java.awt.Color(255, 255, 255));
        SilBtn.setText("Sil");
        SilBtn.setBorder(null);
        SilBtn.setBorderPainted(false);
        SilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SilBtnMouseClicked(evt);
            }
        });

        GuncelleBtn.setBackground(new java.awt.Color(255, 102, 0));
        GuncelleBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GuncelleBtn.setForeground(new java.awt.Color(255, 255, 255));
        GuncelleBtn.setText("Düzenle");
        GuncelleBtn.setBorder(null);
        GuncelleBtn.setBorderPainted(false);
        GuncelleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuncelleBtnMouseClicked(evt);
            }
        });
        GuncelleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuncelleBtnActionPerformed(evt);
            }
        });

        TemizleBtn.setBackground(new java.awt.Color(255, 102, 0));
        TemizleBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TemizleBtn.setForeground(new java.awt.Color(255, 255, 255));
        TemizleBtn.setText("Temizle");
        TemizleBtn.setBorder(null);
        TemizleBtn.setBorderPainted(false);
        TemizleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TemizleBtnMouseClicked(evt);
            }
        });

        UrunMik.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunMik.setForeground(new java.awt.Color(255, 102, 0));
        UrunMik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunMikActionPerformed(evt);
            }
        });

        UrunFiyat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunFiyat.setForeground(new java.awt.Color(255, 102, 0));
        UrunFiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunFiyatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("FİYAT");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("ADET/MİKTAR");
        jLabel10.setToolTipText("");

        UrunTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ADI", "ADET/MİKTAR", "FİYAT", "KATEGORİ"
            }
        ));
        UrunTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        UrunTable.setRowHeight(25);
        UrunTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        UrunTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UrunTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UrunTable);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("ÜRÜN YÖNETİMİ");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(KatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UrunId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(68, 68, 68))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(120, Short.MAX_VALUE)
                                .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(GuncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UrunMik, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UrunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UrunMik, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UrunFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UrunId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("x");
        jLabel8.setToolTipText("");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KATEGORİ");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Çıkış Yap");
        jLabel11.setToolTipText("");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SATICI");
        jLabel12.setToolTipText("");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UrunIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrunIdActionPerformed

    private void UrunAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrunAdiActionPerformed

    private void KatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KatCbActionPerformed

    private void UrunMikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunMikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrunMikActionPerformed

    private void UrunFiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunFiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrunFiyatActionPerformed

    private void GuncelleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuncelleBtnActionPerformed

    private void EkleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EkleBtnMouseClicked
        if (UrunId.getText().isEmpty() || UrunAdi.getText().isEmpty() || UrunMik.getText().isEmpty() || UrunFiyat.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Eksik Bigi Girdiniz");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
                PreparedStatement add = Con.prepareStatement("insert into URUNTBL values(?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(UrunId.getText()));
                add.setString(2, UrunAdi.getText());
                add.setInt(3, Integer.valueOf(UrunMik.getText()));
                add.setInt(4, Integer.valueOf(UrunFiyat.getText()));
                add.setString(5, KatCb.getSelectedItem().toString());

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Yeni Ürun Başarıyla Eklendi");
                Con.close();
                SelectUrun();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_EkleBtnMouseClicked

    private void TemizleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemizleBtnMouseClicked
        UrunId.setText("");
        UrunAdi.setText("");
        UrunMik.setText("");
        UrunFiyat.setText("");

    }//GEN-LAST:event_TemizleBtnMouseClicked

    private void SilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilBtnMouseClicked
        if (UrunId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silinecek Ürünü Seç");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
                String UrId = UrunId.getText();
                String Query = "Delete from User1.URUNTBL where URUNID=" + UrId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectUrun();
                JOptionPane.showMessageDialog(this, "Ürün Başarıyla Silindi");

            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_SilBtnMouseClicked

    private void UrunTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrunTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) UrunTable.getModel();
        int Myindex = UrunTable.getSelectedRow();
        UrunId.setText(model.getValueAt(Myindex, 0).toString());
        UrunAdi.setText(model.getValueAt(Myindex, 1).toString());
        UrunMik.setText(model.getValueAt(Myindex, 2).toString());
        UrunFiyat.setText(model.getValueAt(Myindex, 3).toString());

    }//GEN-LAST:event_UrunTableMouseClicked

    private void GuncelleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuncelleBtnMouseClicked
        if (UrunId.getText().isEmpty() || UrunAdi.getText().isEmpty() || UrunMik.getText().isEmpty() || UrunFiyat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Eksik Bilgi");
        } else {

            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
                String Query = "Update User1.URUNTBL set URUNADI='" + UrunAdi.getText() + "'" + ",URUNMIK='" + UrunMik.getText() + "'" + ",URUNFIYAT='" + UrunFiyat.getText() + "'" + ",URUNKAT='" + KatCb.getSelectedItem().toString() + "'" + "where URUNID=" + UrunId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Ürünü Güncelle");
                SelectUrun();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_GuncelleBtnMouseClicked

    private void EkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleBtnActionPerformed

    }//GEN-LAST:event_EkleBtnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       new Satici().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Kategori().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       new Giris().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urunler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EkleBtn;
    private javax.swing.JButton GuncelleBtn;
    private javax.swing.JComboBox KatCb;
    private javax.swing.JButton SilBtn;
    private javax.swing.JButton TemizleBtn;
    private javax.swing.JTextField UrunAdi;
    private javax.swing.JTextField UrunFiyat;
    private javax.swing.JTextField UrunId;
    private javax.swing.JTextField UrunMik;
    private javax.swing.JTable UrunTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
