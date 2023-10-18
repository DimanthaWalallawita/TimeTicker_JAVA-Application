package View.manager;
import Models.Spairparts;
import Controller.SpairparstsController;
import Controller.expencesController;
import DBConnection.DatabaseConnection;
import Models.expences;

import View.SignUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SpairpartsUI extends javax.swing.JFrame {

    Spairparts objM;
    SpairparstsController objC;
    DatabaseConnection ob;
    expencesController objEC;
    expences objE;
    float ProdTot = 0.0f;
    
    public SpairpartsUI() {
        initComponents();
        
        objC = new SpairparstsController();
        
        ob = new DatabaseConnection();
        
        try {
            ResultSet rs = ob.ShowExecuteQuery("SELECT * FROM spareparts");
            
            while(rs.next()){
                String id = rs.getString("code");
                String Bname = rs.getString("BrandName");
                String Price = String.valueOf(rs.getFloat("Price"));
                String colour = rs.getString("Colour");
                String type = rs.getString("Type");
                String qut = String.valueOf(rs.getInt("Quantity"));
                
                String tbData[] = {id ,Bname ,Price ,colour ,type,qut};
                DefaultTableModel tableModel = (DefaultTableModel)partsTable.getModel();
                
                tableModel.addRow(tbData);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(EmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        brandName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        partsTable = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        colour = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qut = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("CODE");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel2.setText("MANAGE SPARE PARTS");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        code.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("BRAND NAME");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("COLOUR");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("TYPE");

        type.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        brandName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        brandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel8.setText("SPARE PARTS LIST");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        partsTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        partsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "BRAND NAME", "PRICE", "COLOUR", "TYPE", "QUANTITY"
            }
        ));
        partsTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        partsTable.setRowHeight(25);
        partsTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        partsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(partsTable);

        clear.setBackground(new java.awt.Color(7, 36, 61));
        clear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(7, 36, 61));
        addButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(7, 36, 61));
        Delete.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("DELETE");
        Delete.setBorder(null);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(7, 36, 61));
        updateBTN.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("UPDATE");
        updateBTN.setBorder(null);
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        colour.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        colour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colourActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("PRICE");

        price.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("QUANTUTY");

        qut.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        qut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)
                                .addGap(219, 219, 219))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(151, 151, 151)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(colour, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addContainerGap(622, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qut, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colour, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(qut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(employeeBTN)
                                            .addComponent(watchBTN)))
                                    .addComponent(partsBTN1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(suppliersBTN))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(salesBTN))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(logoutButton)))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimize)
                        .addGap(18, 18, 18)
                        .addComponent(close)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(employeeBTN)
                        .addGap(18, 18, 18)
                        .addComponent(watchBTN)
                        .addGap(18, 18, 18)
                        .addComponent(partsBTN1)
                        .addGap(18, 18, 18)
                        .addComponent(suppliersBTN)
                        .addGap(18, 18, 18)
                        .addComponent(salesBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void brandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandNameActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try{
            String Code = code.getText();
            String Brand = brandName.getText();
            float Price = Float.parseFloat(price.getText());
            String Colour = colour.getText();
            String Type = type.getText();
            int quantity = Integer.parseInt(qut.getText());
            
            ProdTot = quantity * Price;
            
            objM = objC.addSpairparts(Code, Brand, Price, Colour, Type, quantity);
            
            boolean result = objC.addSpairparstToDB(objM);
            
            objE = objEC.addexpences(code.getText(), brandName.getText(), Integer.valueOf(qut.getText()), ProdTot);
        
            boolean check = objEC.addexpencesDB(objE);
            
            if(result){
                JOptionPane.showMessageDialog(rootPane," Spare part added to Database Succesfully", "Alart", 1);
                code.setText("");
                brandName.setText("");
                price.setText("");
                colour.setText("");
                type.setText("");  
                qut.setText("");
                this.dispose();
                new SpairpartsUI().setVisible(true);
                
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane," Error of adding a new Spare part", "Alart", 2);
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "In there are one more to complete", "Error", 3);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void colourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colourActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void employeeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeBTNMouseClicked

        this.dispose();
        new EmployeeUI().setVisible(true);

    }//GEN-LAST:event_employeeBTNMouseClicked

    private void watchBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchBTNMouseClicked

        this.dispose();
        new WatchUI().setVisible(true);

    }//GEN-LAST:event_watchBTNMouseClicked

    private void partsBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsBTN1MouseClicked

        this.dispose();
        new SpairpartsUI().setVisible(true);
        
    }//GEN-LAST:event_partsBTN1MouseClicked

    private void suppliersBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersBTNMouseClicked

        this.dispose();
        new SuppliersUI().setVisible(true);
        
    }//GEN-LAST:event_suppliersBTNMouseClicked

    private void salesBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesBTNMouseClicked

        this.dispose();
        new SalesUI().setVisible(true);

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

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        try{
            String Code = code.getText();
            String Brand = brandName.getText();
            float Price = Float.parseFloat(price.getText());
            String Colour = colour.getText();
            String Type = type.getText();
            int quantity = Integer.parseInt(qut.getText());
            
            objM = objC.updateSpairparts(Code, Brand, Price, Colour, Type,quantity);
            
            boolean result = objC.updateSpairparstToDB(objM);

            if(result){
                JOptionPane.showMessageDialog(rootPane," Spare part updated to Database Succesfully", "Alart", 1);
                code.setText("");
                brandName.setText("");
                price.setText("");
                colour.setText("");
                type.setText("");  
                qut.setText("");
                
                new SpairpartsUI().setVisible(true);
                this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane," Error of updating a new Spare part", "Alart", 2);
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "In there are one more to complete", "Error", 3);
        }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        code.setText("");
        brandName.setText("");
        price.setText("");
        colour.setText("");
        type.setText("");
        qut.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
            String Code = code.getText();
            String Brand = brandName.getText();
            float Price = Float.parseFloat(price.getText());
            String Colour = colour.getText();
            String Type = type.getText();
            int quantity = Integer.parseInt(qut.getText());
            
            objM = objC.deleteSpairparts(Code, Brand, Price, Colour, Type,quantity);
            
            boolean result = objC.deleteSpairparstToDB(objM);

            if(result){
                JOptionPane.showMessageDialog(rootPane," Spare part Deleted to Database Succesfully", "Alert", 1);
                code.setText("");
                brandName.setText("");
                price.setText("");
                colour.setText("");
                type.setText("");
                qut.setText("");
                new SpairpartsUI().setVisible(true);
                this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane," Error of Deleting a new Spare part", "Alert", 2);
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "In there are one more to complete", "Error", 3);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void partsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)partsTable.getModel();
        int Myindex = partsTable.getSelectedRow();
        
        code.setText(model.getValueAt(Myindex, 0).toString());
        brandName.setText(model.getValueAt(Myindex, 1).toString());
        price.setText(model.getValueAt(Myindex, 2).toString());
        colour.setText(model.getValueAt(Myindex, 3).toString());
        type.setText(model.getValueAt(Myindex, 4).toString());
        qut.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_partsTableMouseClicked

    private void qutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qutActionPerformed

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
            java.util.logging.Logger.getLogger(SpairpartsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpairpartsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpairpartsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpairpartsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpairpartsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField brandName;
    private javax.swing.JButton clear;
    private javax.swing.JLabel close;
    private javax.swing.JTextField code;
    private javax.swing.JTextField colour;
    private javax.swing.JLabel employeeBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel partsBTN1;
    private javax.swing.JTable partsTable;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qut;
    private javax.swing.JLabel salesBTN;
    private javax.swing.JLabel suppliersBTN;
    private javax.swing.JTextField type;
    private javax.swing.JButton updateBTN;
    private javax.swing.JLabel watchBTN;
    // End of variables declaration//GEN-END:variables
}