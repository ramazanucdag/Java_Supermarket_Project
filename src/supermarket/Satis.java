/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Satis extends javax.swing.JFrame {

    /**
     * Creates new form Satış
     */
    public Satis() {
        initComponents();
        SelectUrun();
        GetKat();
    }

   Connection Con = null;
   Statement St = null;
   ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        UrunAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        KatCb = new javax.swing.JComboBox();
        EkleBtn = new javax.swing.JButton();
        SilBtn = new javax.swing.JButton();
        GuncelleBtn = new javax.swing.JButton();
        TemizleBtn = new javax.swing.JButton();
        UrunMik = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UrunTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FaturaTxt = new javax.swing.JTextArea();
        Grdtoplamlbl = new javax.swing.JLabel();
        Filtre = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("ÜRÜN LİSTESİ");
        jLabel4.setToolTipText("");

        UrunAdi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunAdi.setForeground(new java.awt.Color(255, 102, 0));
        UrunAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrunAdiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("ADI");
        jLabel3.setToolTipText("");

        KatCb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        KatCb.setForeground(new java.awt.Color(255, 0, 0));
        KatCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "İçecek", "Sebze", "Et" }));
        KatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KatCbMouseClicked(evt);
            }
        });
        KatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KatCbActionPerformed(evt);
            }
        });

        EkleBtn.setBackground(new java.awt.Color(255, 0, 0));
        EkleBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EkleBtn.setForeground(new java.awt.Color(255, 255, 255));
        EkleBtn.setText("Fatura Ekle");
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

        SilBtn.setBackground(new java.awt.Color(255, 0, 0));
        SilBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SilBtn.setForeground(new java.awt.Color(255, 255, 255));
        SilBtn.setText("Yazdır");
        SilBtn.setBorder(null);
        SilBtn.setBorderPainted(false);
        SilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SilBtnMouseClicked(evt);
            }
        });
        SilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilBtnActionPerformed(evt);
            }
        });

        GuncelleBtn.setBackground(new java.awt.Color(255, 0, 0));
        GuncelleBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GuncelleBtn.setForeground(new java.awt.Color(255, 255, 255));
        GuncelleBtn.setText("Yenile");
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

        TemizleBtn.setBackground(new java.awt.Color(255, 0, 0));
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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("ADET/MİKTAR");
        jLabel10.setToolTipText("");

        UrunTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UrunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("FATURALANDIRMA NOKTASI");
        jLabel5.setToolTipText("");

        FaturaTxt.setColumns(20);
        FaturaTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FaturaTxt.setRows(5);
        jScrollPane2.setViewportView(FaturaTxt);

        Grdtoplamlbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Grdtoplamlbl.setForeground(new java.awt.Color(255, 0, 0));
        Grdtoplamlbl.setText("Rs");

        Filtre.setBackground(new java.awt.Color(255, 0, 0));
        Filtre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Filtre.setForeground(new java.awt.Color(255, 255, 255));
        Filtre.setText("Filtre");
        Filtre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltreMouseClicked(evt);
            }
        });
        Filtre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrunMik, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70)
                                .addComponent(UrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(KatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(Filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GuncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(SilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Grdtoplamlbl)
                        .addGap(191, 191, 191))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Grdtoplamlbl)
                        .addGap(18, 18, 18)
                        .addComponent(SilBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(UrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UrunMik, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TemizleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EkleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(422, 422, 422))))
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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Çıkış Yap");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38))))
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
   
    public void SelectUrun() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.URUNTBL");
            UrunTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    int Prid,newMik;
    public void guncelle()
    {
        try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
                String Query = "Update User1.URUNTBL set URUNMIK=" +newMik+ ""+"where URUNID=" + Prid;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
              //  JOptionPane.showMessageDialog(this, "Ürünü Güncelle");
                SelectUrun();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }        
    private void UrunAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrunAdiActionPerformed

    private void KatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KatCbActionPerformed
int i = 0;
    private void EkleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EkleBtnMouseClicked
     if(UrunMik.getText().isEmpty()|| UrunAdi.getText().isEmpty()) 
    {
        JOptionPane.showMessageDialog(this,"Eksik Bilgi" );
    }
     else if (KullanabilirMik <= Integer.valueOf(UrunMik.getText()))
     {
          JOptionPane.showMessageDialog(this,"Stokta Yeterli Değil" );
     }
     else{
         i++;
         UrunTop = Yukfiyat * Double.valueOf(UrunMik.getText());
         GrdToplam = GrdToplam+UrunTop;
         if(i == 1) {
          FaturaTxt.setText(FaturaTxt.getText()+"      ------------DALTONLAR NOKTASI------------\n"+" NUM   ÜRÜN    FİYAT    MİKTAR   TOPLAM\n"+i+"       "+UrunAdi.getText()+"        "+Yukfiyat+"        "+UrunMik.getText()+"        "+UrunTop+"\n");
         }
         else{
            FaturaTxt.setText(FaturaTxt.getText()+i+"       "+UrunAdi.getText()+"        "+Yukfiyat+"        "+UrunMik.getText()+"           "+UrunTop+"\n");
         }
         Grdtoplamlbl.setText("Top"+GrdToplam); 
         guncelle();
         
  }
     
    }//GEN-LAST:event_EkleBtnMouseClicked

    private void EkleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleBtnActionPerformed

    }//GEN-LAST:event_EkleBtnActionPerformed

    private void SilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilBtnMouseClicked
       try{
           FaturaTxt.print();
       } catch (Exception e){
       
       }    
    }//GEN-LAST:event_SilBtnMouseClicked

    private void GuncelleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuncelleBtnMouseClicked
        SelectUrun(); 
    }//GEN-LAST:event_GuncelleBtnMouseClicked

    private void GuncelleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuncelleBtnActionPerformed

    private void TemizleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemizleBtnMouseClicked

        UrunAdi.setText("");
        UrunMik.setText("");
      //  UrunFiyat.setText("");
    }//GEN-LAST:event_TemizleBtnMouseClicked

    private void UrunMikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrunMikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrunMikActionPerformed
   
    private void UrunTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrunTableMouseClicked
       DefaultTableModel model = (DefaultTableModel) UrunTable.getModel();
        int Myindex = UrunTable.getSelectedRow();
        Prid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        KullanabilirMik = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        newMik = KullanabilirMik - Integer.valueOf(UrunMik.getText());
        Yukfiyat = Double.valueOf(model.getValueAt(Myindex, 3).toString());
        UrunAdi.setText(model.getValueAt(Myindex, 1).toString());
        UrunTop = Yukfiyat * Integer.valueOf(UrunMik.getText());
      //  UrunMik.setText(model.getValueAt(Myindex, 2).toString());
      //  UrunFiyat.setText(model.getValueAt(Myindex, 3).toString()); 
    }//GEN-LAST:event_UrunTableMouseClicked
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
    Double Yukfiyat,UrunTop=0.0,GrdToplam=0.0;
    int KullanabilirMik;
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Giris().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void SilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SilBtnActionPerformed

    private void KatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KatCbMouseClicked
         try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.KATEGORITBL where KATADI='"+KatCb.getSelectedItem()+"'");
            UrunTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_KatCbMouseClicked

    private void FiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltreActionPerformed

    private void FiltreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltreMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarket1", "User1", "2145");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User1.KATEGORITBL where KATADI='"+KatCb.getSelectedItem()+"'");
            UrunTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_FiltreMouseClicked

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
            java.util.logging.Logger.getLogger(Satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Satis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EkleBtn;
    private javax.swing.JTextArea FaturaTxt;
    private javax.swing.JButton Filtre;
    private javax.swing.JLabel Grdtoplamlbl;
    private javax.swing.JButton GuncelleBtn;
    private javax.swing.JComboBox KatCb;
    private javax.swing.JButton SilBtn;
    private javax.swing.JButton TemizleBtn;
    private javax.swing.JTextField UrunAdi;
    private javax.swing.JTextField UrunMik;
    private javax.swing.JTable UrunTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
