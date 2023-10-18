package View.manager;
import Models.Employee;
import Controller.EmployeeController;
import Controller.LoginController;
import DBConnection.DatabaseConnection;
import Models.User;
import View.SignUI;
import View.manager.WatchUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class EmployeeUI extends javax.swing.JFrame {

    Employee objE;
    EmployeeController objC;
    LoginController objL;
    User objU;

    DatabaseConnection ob;
    
    String id;
    
    public EmployeeUI() {
        initComponents();
        objC = new EmployeeController();
        objL = new LoginController();
        
        ob = new DatabaseConnection();
        
        try {
            ResultSet rs = ob.ShowExecuteQuery("SELECT * FROM employee");
            
            while(rs.next()){
                String idEmp = rs.getString("empID");
                String name = rs.getString("empName");
                String Myaddress = rs.getString("address");
                String ages = String.valueOf(rs.getInt("age"));
                String pass = rs.getString("password");
                String phones = String.valueOf(rs.getInt("phone"));
                String Gen = rs.getString("gender");
                String national = rs.getString("NIC");
                
                String tbData[] = {idEmp ,name ,Myaddress ,ages ,pass ,phones ,Gen, national};
                DefaultTableModel tableModel = (DefaultTableModel)emplyeeTable.getModel();
                
                tableModel.addRow(tbData);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(EmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        selection = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emplyeeTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        addEmp = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        uodateButton = new javax.swing.JButton();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AutoID = new javax.swing.JLabel();
        autogen = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        partsBTN = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        watchBTN = new javax.swing.JLabel();
        employeeBTN = new javax.swing.JLabel();
        suppliersBTN = new javax.swing.JLabel();
        salesBTN1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(7, 36, 61));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel2.setText("MANAGE EMPLOYEE");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("EMPLOYEE NAME    :");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("AGE                             :");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("ADDRESS                   :");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("GENDER                    :");

        age.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        nic.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("PHONE NO               :");

        selection.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 27)); // NOI18N
        jLabel8.setText("EMPLOYEE LIST");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emplyeeTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emplyeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "EMP_NAME", "ADDRESS", "AGE", "PASSWORD", "PHONE_NO", "GENDER", "NIC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        emplyeeTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        emplyeeTable.setRowHeight(25);
        emplyeeTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        emplyeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emplyeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emplyeeTable);

        clearButton.setBackground(new java.awt.Color(7, 36, 61));
        clearButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addEmp.setBackground(new java.awt.Color(7, 36, 61));
        addEmp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        addEmp.setForeground(new java.awt.Color(255, 255, 255));
        addEmp.setText("ADD");
        addEmp.setBorder(null);
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(7, 36, 61));
        deleteButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        uodateButton.setBackground(new java.awt.Color(7, 36, 61));
        uodateButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        uodateButton.setForeground(new java.awt.Color(255, 255, 255));
        uodateButton.setText("UPDATE");
        uodateButton.setBorder(null);
        uodateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uodateButtonActionPerformed(evt);
            }
        });

        phone.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("PASSWORD              :");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("EMPLOYEE ID            :");

        AutoID.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AutoID.setText(" ");

        autogen.setBackground(new java.awt.Color(7, 36, 61));
        autogen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        autogen.setForeground(new java.awt.Color(255, 255, 255));
        autogen.setText("GENERATE ID");
        autogen.setBorder(null);
        autogen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autogenActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("NIC NO                        :");

        empName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uodateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autogen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(233, 233, 233))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(AutoID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uodateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autogen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        partsBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        partsBTN.setForeground(new java.awt.Color(255, 255, 255));
        partsBTN.setText("SPARE PARTS");
        partsBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partsBTNMouseClicked(evt);
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

        watchBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        watchBTN.setForeground(new java.awt.Color(255, 255, 255));
        watchBTN.setText("WATCHES");
        watchBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                watchBTNMouseClicked(evt);
            }
        });

        employeeBTN.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        employeeBTN.setForeground(new java.awt.Color(255, 255, 255));
        employeeBTN.setText("EMPLOYEE");
        employeeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                employeeBTNMouseEntered(evt);
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

        salesBTN1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        salesBTN1.setForeground(new java.awt.Color(255, 255, 255));
        salesBTN1.setText("SALES");
        salesBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesBTN1MouseClicked(evt);
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

        close.setFont(new java.awt.Font("Cambria Math", 1, 27)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(employeeBTN)
                                            .addComponent(watchBTN)
                                            .addComponent(suppliersBTN)))
                                    .addComponent(partsBTN)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(salesBTN1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(minimize)
                        .addGap(18, 18, 18)
                        .addComponent(close))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(employeeBTN)
                        .addGap(18, 18, 18)
                        .addComponent(watchBTN)
                        .addGap(18, 18, 18)
                        .addComponent(partsBTN)
                        .addGap(18, 18, 18)
                        .addComponent(suppliersBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salesBTN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addGap(60, 60, 60))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed
        
        
        try{
            String EmpID = id;
            
            String empname = empName.getText();
            String add = address.getText();
            int Age = Integer.parseInt(age.getText());
            String password = Password.getText();
            int Phone = Integer.parseInt(phone.getText());
            String gen = (String) selection.getSelectedItem();
            String NIC = nic.getText();
        
            if(EmpID.equals(AutoID.getText())){
                objE = objC.addEmployee(EmpID, empname, add, Age, password, Phone, gen, NIC);
           
                boolean result = objC.addEmployeeToDB(objE);
        
            
                if(result){
                    JOptionPane.showMessageDialog(rootPane,"Employee added to Database Succesfully", "Alart", 1);
                    AutoID.setText("");
                    empName.setText("");
                    address.setText("");
                    age.setText("");
                    Password.setText("");
                    phone.setText(""); 
                    nic.setText("");
                    
                    new EmployeeUI().setVisible(true);
                    this.dispose(); 

                    objU = objL.addUser(empname, password);
                    
                    objL.addtoLIST(objU);
                    
                    
                    
                }
            
                else{
                    JOptionPane.showMessageDialog(rootPane,"Error of adding a new Employee", "Alart", 2);
                }
                
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane,"Please Enter Suggest ID", "Alart", 2);
            }
        }
        
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "In there are one more to complete", "Error", 3);
        }
        
    }//GEN-LAST:event_addEmpActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void partsBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsBTNMouseClicked
        EmployeeUI obj = new EmployeeUI();
        obj.setVisible(false);
                
        new SpairpartsUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_partsBTNMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        this.dispose();
        new SignUI().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void watchBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_watchBTNMouseClicked
        new WatchUI().setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_watchBTNMouseClicked

    private void suppliersBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersBTNMouseClicked
        new SuppliersUI().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_suppliersBTNMouseClicked

    private void employeeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeBTNMouseClicked
        new EmployeeUI().setVisible(true);
        this.dispose(); 

    }//GEN-LAST:event_employeeBTNMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void uodateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uodateButtonActionPerformed
        try{
            String empid = AutoID.getText();
            String empname = empName.getText();
            String add = address.getText();
            int Age = Integer.parseInt(age.getText());
            String password = Password.getText();
            int Phone = Integer.parseInt(phone.getText());
            String gen = (String)selection.getSelectedItem();
            String NIC = nic.getText();
            
            objE = objC.updateEmployee(empid, empname, add, Age, password, Phone, gen, NIC);
        
            boolean result = objC.updateEmployeeToDB(objE);
        
            //count++;
            if(result){
                JOptionPane.showMessageDialog(rootPane," Employee Updated Succesfully", "Alart", 1);
                AutoID.setText("");
                empName.setText("");
                address.setText("");
                age.setText("");
                Password.setText("");
                phone.setText("");
                nic.setText("");
                
                new EmployeeUI().setVisible(true);
                this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane," Error of Updating a new Employee", "Alart", 2);
            }
        }
        
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "In there are one more to complete", "Error", 3);
        }
    }//GEN-LAST:event_uodateButtonActionPerformed

    private void salesBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesBTN1MouseClicked
        new SalesUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesBTN1MouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(HIDE_ON_CLOSE);
    }//GEN-LAST:event_minimizeMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            String empid = AutoID.getText();
            String empname = empName.getText();
            String add = address.getText();
            int Age = Integer.parseInt(age.getText());
            String password = Password.getText();
            int Phone = Integer.parseInt(phone.getText());
            String gen = (String) selection.getSelectedItem();
            String NIC = nic.getText();
        
            objE = objC.deleteEmployee(empid, empname, add, Age, password, Phone, gen, NIC);
        
            boolean result = objC.deleteEmployeeToDB(objE);
        
            //count++;
            if(result){
                JOptionPane.showMessageDialog(rootPane," Employee Deleted Succesfully", "Alart", 1);
                
                AutoID.setText("");
                empName.setText("");
                address.setText("");
                age.setText("");
                Password.setText("");
                phone.setText("");
                nic.setText("");
                
                new EmployeeUI().setVisible(true);
                this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane," Error of Deletig a new Employee", "Alart", 2);
            }
        }
        
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "In there are one more to complete", "Error", 3);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        AutoID.setText("");
        empName.setText("");
        address.setText("");
        age.setText("");
        Password.setText("");
        phone.setText("");
        nic.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void employeeBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeBTNMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeBTNMouseEntered

    private void autogenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autogenActionPerformed
        id = "TT"+nic.getText();
        
        AutoID.setText(id);
    }//GEN-LAST:event_autogenActionPerformed

    private void empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameActionPerformed

    private void emplyeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emplyeeTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)emplyeeTable.getModel();
        int Myindex = emplyeeTable.getSelectedRow();
        
        AutoID.setText(model.getValueAt(Myindex, 0).toString());
        empName.setText(model.getValueAt(Myindex, 1).toString());
        address.setText(model.getValueAt(Myindex, 2).toString());
        age.setText(model.getValueAt(Myindex, 3).toString());
        Password.setText(model.getValueAt(Myindex, 4).toString());
        phone.setText(model.getValueAt(Myindex, 5).toString());
        selection.setSelectedItem(model.getValueAt(Myindex, 6).toString());
        nic.setText(model.getValueAt(Myindex, 7).toString());
    }//GEN-LAST:event_emplyeeTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutoID;
    private javax.swing.JTextField Password;
    private javax.swing.JButton addEmp;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton autogen;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel close;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField empName;
    private javax.swing.JLabel employeeBTN;
    private javax.swing.JTable emplyeeTable;
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
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField nic;
    private javax.swing.JLabel partsBTN;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel salesBTN1;
    private javax.swing.JComboBox<String> selection;
    private javax.swing.JLabel suppliersBTN;
    private javax.swing.JButton uodateButton;
    private javax.swing.JLabel watchBTN;
    // End of variables declaration//GEN-END:variables

    
}
