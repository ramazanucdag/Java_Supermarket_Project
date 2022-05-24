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
public class Satici extends javax.swing.JFrame {

    /**
     * Creates new form Satıcı
     */
    public Satici() {
        initComponents();
        SelectSatici();
    }
  Connection Con = null;
  Statement St = null;
  ResultSet Rs = null;
  public void SelectSatici()
  {
      try {
      Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145");
      St = Con.createStatement();
      Rs = St.executeQuery("Select * from User1.SATICITBL");
      SaticiTable.setModel(DbUtils.resultSetToTableModel(Rs));
      }catch(Exception e) {
      
      }
  }        
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SatId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SatAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CinsiyetCb = new javax.swing.JComboBox();
        EkleBtn = new javax.swing.JButton();
        SilBtn = new javax.swing.JButton();
        GuncelleBtn = new javax.swing.JButton();
        TemizleBtn = new javax.swing.JButton();
        SatParola = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SaticiTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("SATICI LİSTESİ");
        jLabel4.setToolTipText("");

        SatId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SatId.setForeground(new java.awt.Color(255, 102, 0));
        SatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("SATID");
        jLabel2.setToolTipText("");

        SatAdi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SatAdi.setForeground(new java.awt.Color(255, 102, 0));
        SatAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatAdiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("ADI");
        jLabel3.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("CİNSİYET");
        jLabel7.setToolTipText("");

        CinsiyetCb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CinsiyetCb.setForeground(new java.awt.Color(255, 102, 0));
        CinsiyetCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Erkek", "Kadın" }));
        CinsiyetCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CinsiyetCbActionPerformed(evt);
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

        SatParola.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SatParola.setForeground(new java.awt.Color(255, 102, 0));
        SatParola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatParolaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("PAROLA");
        jLabel10.setToolTipText("");

        SaticiTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SaticiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ADI", "PAROLA", "CİNSİYET"
            }
        ));
        SaticiTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SaticiTable.setRowHeight(25);
        SaticiTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        SaticiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaticiTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SaticiTable);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("SATICI YÖNETİMİ");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(45, 45, 45)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SatId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SatAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CinsiyetCb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(GuncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(173, 173, 173)
                                                    .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(91, 91, 91))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(32, 32, 32)
                                        .addComponent(SatParola, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(331, 331, 331))
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
                            .addComponent(SatParola, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CinsiyetCb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SatId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SatAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KATEGORI");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("URUNLER");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void SatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SatIdActionPerformed

    private void SatAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SatAdiActionPerformed

    private void CinsiyetCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CinsiyetCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CinsiyetCbActionPerformed

    private void SatParolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatParolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SatParolaActionPerformed

    private void EkleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EkleBtnMouseClicked
   
        if(SatId.getText().isEmpty()|| SatAdi.getText().isEmpty()|| SatParola.getText().isEmpty()) {
           
            JOptionPane.showMessageDialog(this,"Eksik Bigi Girdiniz");
        }
        else {
        try {
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145");
    PreparedStatement add = Con.prepareStatement("insert into SATICITBL values(?,?,?,?)");          
            add.setInt(1, Integer.valueOf(SatId.getText()));
            add.setString(2, SatAdi.getText());
            add.setString(3, SatParola.getText());
            add.setString(4, CinsiyetCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Yeni Satıcı Başarıyla Eklendi");
            Con.close();
            SelectSatici();
            
                      } catch (Exception e) {
                          e.printStackTrace();
        
        }
    }
    }//GEN-LAST:event_EkleBtnMouseClicked

    private void SaticiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaticiTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)SaticiTable.getModel();
       int Myindex = SaticiTable.getSelectedRow();
       SatId.setText(model.getValueAt(Myindex,0).toString());
       SatAdi.setText(model.getValueAt(Myindex,1).toString());
       SatParola.setText(model.getValueAt(Myindex,2).toString());     
    }//GEN-LAST:event_SaticiTableMouseClicked

    private void TemizleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemizleBtnMouseClicked
        SatId.setText("");
        SatAdi.setText("");
        SatParola.setText("");
        
    }//GEN-LAST:event_TemizleBtnMouseClicked

    private void SilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilBtnMouseClicked
        if(SatId.getText().isEmpty()) 
        {   
            JOptionPane.showMessageDialog(this,"Silinecek Satıcıyı Seç");
        }  
        else {
           try {
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145");
    String SId = SatId.getText();
    String Query = "Delete from User1.SATICITBL where SATID="+SId;
    Statement Add = Con.createStatement();
    Add.executeUpdate(Query);
    SelectSatici();
    JOptionPane.showMessageDialog(this,"Satıcı Başarıyla Silindi");
    
           }catch(Exception e) {
               
             e.printStackTrace();
           } 
              
        } 
    }//GEN-LAST:event_SilBtnMouseClicked

    private void GuncelleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuncelleBtnMouseClicked
       if(SatId.getText().isEmpty()|| SatAdi.getText().isEmpty()|| SatParola.getText().isEmpty())
       {
         JOptionPane.showMessageDialog(this,"Eksik Bilgi");  
       }
       else{ 
          
          try{
         Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1","User1","2145"); 
         String Query ="Update User1.SATICITBL set SATADI='"+SatAdi.getText()+"'"+",SATPASS='"+SatParola.getText()+"'"+",SATCINSIYET='"+CinsiyetCb.getSelectedItem().toString()+"'"+"where SATID="+SatId.getText();
         Statement Add = Con.createStatement();
         Add.executeUpdate(Query);
         JOptionPane.showMessageDialog(this,"Satıcıyı Güncelle");
         SelectSatici();
          }catch(SQLException e)
          {
           e.printStackTrace();      
        }
      }
    }//GEN-LAST:event_GuncelleBtnMouseClicked

    private void EkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EkleBtnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Urunler().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Kategori().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Satici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Satici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Satici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Satici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Satici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CinsiyetCb;
    private javax.swing.JButton EkleBtn;
    private javax.swing.JButton GuncelleBtn;
    private javax.swing.JTextField SatAdi;
    private javax.swing.JTextField SatId;
    private javax.swing.JTextField SatParola;
    private javax.swing.JTable SaticiTable;
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
