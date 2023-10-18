
package View.manager;

import DBConnection.DatabaseConnection;
import View.SignUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class SalesUI extends javax.swing.JFrame {

    DatabaseConnection ob;
    static float GrandTotal = 0.0f;
    static float finalT = 0.0f;
    
    public SalesUI() {
        initComponents();
        
        ob = new DatabaseConnection();
        
        try {
            ResultSet rs = ob.ShowExecuteQuery("SELECT * FROM income");
            
            while(rs.next()){
                String WatchID = rs.getString("ID");
                String Bname = rs.getString("Brand");
                String qut = String.valueOf(rs.getInt("Quantity"));
                String Price = String.valueOf(rs.getFloat("Total"));
                
                String tbData[] = {WatchID ,Bname ,qut, Price};
                DefaultTableModel tableModel = (DefaultTableModel)salesTable.getModel();
                
                GrandTotal = Float.valueOf(Price) + GrandTotal;
                
                tableModel.addRow(tbData);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(EmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        incomelbl.setText("Monthly Income    :   RS "+GrandTotal);
        
        try {
            ResultSet rs = ob.ShowExecuteQuery("SELECT * FROM expenses");
            
            while(rs.next()){
                String WatchID = rs.getString("ID");
                String Bname = rs.getString("BrandName");
                String qut = String.valueOf(rs.getInt("Quantity"));
                String Price = String.valueOf(rs.getFloat("Total"));
                
                String tbData[] = {WatchID ,Bname ,qut, Price};
                DefaultTableModel tableModel = (DefaultTableModel)bougthTable.getModel();
                
                finalT = Float.valueOf(Price) + finalT;
                
                tableModel.addRow(tbData);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(EmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        expenses.setText("Monthly Expenses :   RS "+finalT);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        expenses = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        incomelbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bougthTable = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        employeeBTN = new javax.swing.JLabel();
        watchBTN = new javax.swing.JLabel();
        partsBTN1 = new javax.swing.JLabel();
        suppliersBTN = new javax.swing.JLabel();
        salesBTN = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(7, 36, 61));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        expenses.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        expenses.setText("Monthly Expenses :");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel2.setText("MANAGE SALES");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel8.setText("SALES LIST");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        salesTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "BRAND NAME", "QUANTITY", "TOTAL"
            }
        ));
        salesTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        salesTable.setRowHeight(25);
        salesTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        salesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salesTable);

        incomelbl.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        incomelbl.setText("Monthly Income    :");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel9.setText("PURCHASED LIST");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        bougthTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bougthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "BRAND NAME", "QUANTITY", "TOTAL"
            }
        ));
        bougthTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        bougthTable.setRowHeight(25);
        bougthTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        bougthTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bougthTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bougthTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expenses)
                    .addComponent(incomelbl)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)))
                .addGap(459, 459, 459))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel9))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(incomelbl)
                .addGap(31, 31, 31)
                .addComponent(expenses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        close.setFont(new java.awt.Font("Cambria Math", 1, 27)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        employeeBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        employeeBTN.setForeground(new java.awt.Color(255, 255, 255));
        employeeBTN.setText("EMPLOYEE");
        employeeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeBTNMouseClicked(evt);
            }
        });

        watchBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        watchBTN.setForeground(new java.awt.Color(255, 255, 255));
        watchBTN.setText("WATCHES");
        watchBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchBTNMouseClicked(evt);
            }
        });

        partsBTN1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        partsBTN1.setForeground(new java.awt.Color(255, 255, 255));
        partsBTN1.setText("SPARE PARTS");
        partsBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partsBTN1MouseClicked(evt);
            }
        });

        suppliersBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        suppliersBTN.setForeground(new java.awt.Color(255, 255, 255));
        suppliersBTN.setText("SUPPLIERS");
        suppliersBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliersBTNMouseClicked(evt);
            }
        });

        salesBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        salesBTN.setForeground(new java.awt.Color(255, 255, 255));
        salesBTN.setText("SALES");
        salesBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesBTNMouseClicked(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\Users\\Dimantha\\Desktop\\MicrosoftTeams-image (4).png")); // NOI18N
        jLabel11.setText("TimeTicker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimize)
                        .addGap(18, 18, 18)
                        .addComponent(close))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(partsBTN1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(employeeBTN)
                                                    .addComponent(watchBTN))
                                                .addGap(11, 11, 11)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(suppliersBTN)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(salesBTN)
                                        .addGap(37, 37, 37))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(logoutButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(employeeBTN)
                        .addGap(18, 18, 18)
                        .addComponent(watchBTN)
                        .addGap(18, 18, 18)
                        .addComponent(partsBTN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(suppliersBTN)
                        .addGap(18, 18, 18)
                        .addComponent(salesBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addGap(71, 71, 71))))
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
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void employeeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeBTNMouseClicked
        EmployeeUI obj = new EmployeeUI();
        obj.setVisible(false);

        new EmployeeUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeBTNMouseClicked

    private void watchBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchBTNMouseClicked
        EmployeeUI obj = new EmployeeUI();
        obj.setVisible(false);

        new WatchUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_watchBTNMouseClicked

    private void partsBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsBTN1MouseClicked
        EmployeeUI obj = new EmployeeUI();
        obj.setVisible(false);

        new SpairpartsUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_partsBTN1MouseClicked

    private void suppliersBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersBTNMouseClicked
        EmployeeUI obj = new EmployeeUI();
        obj.setVisible(false);

        new SuppliersUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_suppliersBTNMouseClicked

    private void salesBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesBTNMouseClicked
        EmployeeUI obj = new EmployeeUI();
        obj.setVisible(false);

        new SalesUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesBTNMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        this.dispose();
        new SignUI().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(HIDE_ON_CLOSE);
    }//GEN-LAST:event_minimizeMouseClicked

    private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTableMouseClicked
        
    }//GEN-LAST:event_salesTableMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void bougthTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bougthTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bougthTableMouseClicked

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
            java.util.logging.Logger.getLogger(SalesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bougthTable;
    private javax.swing.JLabel close;
    private javax.swing.JLabel employeeBTN;
    private javax.swing.JLabel expenses;
    private javax.swing.JLabel incomelbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel partsBTN1;
    private javax.swing.JLabel salesBTN;
    private javax.swing.JTable salesTable;
    private javax.swing.JLabel suppliersBTN;
    private javax.swing.JLabel watchBTN;
    // End of variables declaration//GEN-END:variables
}
