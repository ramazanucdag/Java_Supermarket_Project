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
public class Kategori extends javax.swing.JFrame {

    /**
     * Creates new form Kategori
     */
    public Kategori() {
        initComponents();
        SelectKategori();
    }
  Connection Con = null;
  Statement St = null;
  ResultSet Rs = null;
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        KatId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        KatAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EkleBtn = new javax.swing.JButton();
        SilBtn = new javax.swing.JButton();
        DuzenleBtn = new javax.swing.JButton();
        TemizleBtn = new javax.swing.JButton();
        KatAciklama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KategoriTbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("KATEGORİ LİSTESİ");
        jLabel4.setToolTipText("");

        KatId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        KatId.setForeground(new java.awt.Color(255, 102, 0));
        KatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("CATID");
        jLabel2.setToolTipText("");

        KatAdi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        KatAdi.setForeground(new java.awt.Color(255, 102, 0));
        KatAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatAdiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("ADI");
        jLabel3.setToolTipText("");

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

        DuzenleBtn.setBackground(new java.awt.Color(255, 102, 0));
        DuzenleBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DuzenleBtn.setForeground(new java.awt.Color(255, 255, 255));
        DuzenleBtn.setText("Düzenle");
        DuzenleBtn.setBorder(null);
        DuzenleBtn.setBorderPainted(false);
        DuzenleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DuzenleBtnMouseClicked(evt);
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

        KatAciklama.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        KatAciklama.setForeground(new java.awt.Color(255, 102, 0));
        KatAciklama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatAciklamaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("AÇIKLAMA");
        jLabel10.setToolTipText("");

        KategoriTbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        KategoriTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        KategoriTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        KategoriTbl.setRowHeight(25);
        KategoriTbl.setSelectionBackground(new java.awt.Color(255, 102, 0));
        KategoriTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KategoriTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KategoriTbl);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("KATEGORİ YÖNETİMİ");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(KatId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(KatAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KatAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(266, 266, 266))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(DuzenleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(KatId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(KatAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(KatAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DuzenleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Satıcı");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ürünler");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Giriş");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(280, 280, 280)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31))))
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
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void SelectKategori()
  {
      try {
      Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145");
      St = Con.createStatement();
      Rs = St.executeQuery("Select * from User1.KATEGORITBL");
      KategoriTbl.setModel(DbUtils.resultSetToTableModel(Rs));
      }catch(Exception e) {

      }
  } 
    private void KatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KatIdActionPerformed

    private void KatAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KatAdiActionPerformed

    private void KatAciklamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatAciklamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KatAciklamaActionPerformed

    private void EkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EkleBtnActionPerformed

    private void EkleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EkleBtnMouseClicked
      
        if(KatId.getText().isEmpty()|| KatAdi.getText().isEmpty()|| KatAciklama.getText().isEmpty()) {
           
            JOptionPane.showMessageDialog(this,"Eksik Bigi Girdiniz");
        }
        else {
        try {
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145");
    PreparedStatement add = Con.prepareStatement("insert into KATEGORITBL values(?,?,?)");          
            add.setInt(1, Integer.valueOf(KatId.getText()));
            add.setString(2, KatAdi.getText());
            add.setString(3, KatAciklama.getText());
        
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Yeni Kategori Başarıyla Eklendi");
            Con.close();
            SelectKategori();
            
                      } catch (Exception e) {
                          e.printStackTrace();
        
        }
    }
    }//GEN-LAST:event_EkleBtnMouseClicked

    private void TemizleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemizleBtnMouseClicked
        KatId.setText("");
        KatAdi.setText("");
        KatAciklama.setText("");
    }//GEN-LAST:event_TemizleBtnMouseClicked

    private void KategoriTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KategoriTblMouseClicked
       DefaultTableModel model = (DefaultTableModel)KategoriTbl.getModel();
       int Myindex = KategoriTbl.getSelectedRow();
       KatId.setText(model.getValueAt(Myindex,0).toString());
       KatAdi.setText(model.getValueAt(Myindex,1).toString());
       KatAciklama.setText(model.getValueAt(Myindex,2).toString()); 
         
    }//GEN-LAST:event_KategoriTblMouseClicked

    private void SilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilBtnMouseClicked
         if(KatId.getText().isEmpty()) 
        {   
            JOptionPane.showMessageDialog(this,"Silinecek Kategori Seç");
        }  
        else {
           try {
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145");
    String KId = KatId.getText();
    String Query = "Delete from User1.KATEGORITBL where KATID="+KId;
    Statement Add = Con.createStatement();
    Add.executeUpdate(Query);
    SelectKategori();
    JOptionPane.showMessageDialog(this,"Kategori Başarıyla Silindi");
    
           }catch(Exception e) {
               
             e.printStackTrace();
           } 
              
        } 
    }//GEN-LAST:event_SilBtnMouseClicked

    private void DuzenleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DuzenleBtnMouseClicked
         if(KatId.getText().isEmpty()|| KatAdi.getText().isEmpty()|| KatAciklama.getText().isEmpty())
       {
         JOptionPane.showMessageDialog(this,"Eksik Bilgi");  
       }
       else{ 
          
          try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145"); 
         String Query ="Update User1.KATEGORITBL set KATADI='"+KatAdi.getText()+"'"+",KATACIKLAMA='"+KatAciklama.getText()+"'"+"where ATID="+KatId.getText();
         Statement Add = Con.createStatement();
         Add.executeUpdate(Query);
         JOptionPane.showMessageDialog(this,"Kategoriyi Güncelle");
         SelectKategori();
          }catch(SQLException e)
          {
           e.printStackTrace();      
        }
      }
    }//GEN-LAST:event_DuzenleBtnMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Urunler().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       new Satici().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Giris().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DuzenleBtn;
    private javax.swing.JButton EkleBtn;
    private javax.swing.JTextField KatAciklama;
    private javax.swing.JTextField KatAdi;
    private javax.swing.JTextField KatId;
    private javax.swing.JTable KategoriTbl;
    private javax.swing.JButton SilBtn;
    private javax.swing.JButton TemizleBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    // End of variables declaration//GEN-END:variables
}
