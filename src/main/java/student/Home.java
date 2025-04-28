/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author User
 */
public class Home extends javax.swing.JFrame {
    
     private static final String username = "root";
     private static final String password = "1234";
     private static final String dataConn = "jdbc:mysql://localhost:3306/ssis";
     private static Connection con = null;
     private  String currentSortColumnStudent, currentSearchKeywordStudent, currentSearchColumnStudent = "";
     private String currentSortColumnProgram, currentSearchColumnProgram, currentSearchKeywordProgram = "";
     private String currentSortColumnCollege, currentSearchColumnCollege, currentSearchKeywordCollege = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));
        jPanel2.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("STUDENT INFORMATION SHEET");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID Number");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year Level");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Program Code");

        jButton3.setText("Add Student");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField5)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by:", "ID Number", "First Name", "Last Name", "Year Level", "Gender", "Program Code" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by:", "ID Number", "First Name", "Last Name", "Year Level", "Gender", "Program Code" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Title 3");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Title 6");
        }

        jButton4.setText("Delete Student");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Edit Student");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField6.setText("1");
        jTextField6.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel13))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student", jPanel3);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Program Code");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Program Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("College Code");

        jButton7.setText("Add Program");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jTextField8)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by:", "Program Code", "Program Name", "College Code" }));
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by:", "Program Code", "Program Name", "College Code" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        }

        jButton9.setText("Delete Program");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Edit Program");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField9.setText("1");
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jButton15.setText("<");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText(">");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jLabel14))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Program", jPanel10);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("College Code");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("College Name");

        jButton11.setText("Add College");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jTextField11))
                .addGap(44, 44, 44))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(203, 203, 203)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by:", "College Code", "College Name" }));
        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by:", "College Code", "College Name" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton13.setText("Delete College");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Edit College");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextField13.setText("1");
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jButton17.setText("<");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText(">");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel15.setText("jLabel15");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jLabel15))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("College", jPanel16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SQLRead table1 = new SQLRead();
        if (selectedRow >= 0) {
            List<String> programs = new ArrayList<>();
            JComboBox<String> program = null;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rowind = jTable1.convertRowIndexToModel(selectedRow);
            String old_id = model.getValueAt(rowind, 0).toString();
            JTextField id = new JTextField(old_id);
            JTextField first_name = new JTextField(model.getValueAt(rowind, 1).toString());
            JTextField last_name = new JTextField(model.getValueAt(rowind, 2).toString());
            JTextField year_level = new JTextField(model.getValueAt(rowind, 3).toString());
            JComboBox<String> gender = new JComboBox<>(new String[]{"M", "F"}); 
            gender.setSelectedItem(model.getValueAt(rowind, 4).toString());
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);
                String programcodes = "SELECT ProgramCode from PROGRAM";
                PreparedStatement pst = con.prepareStatement(programcodes);
                ResultSet rs = pst.executeQuery();
                
                while(rs.next()) {
                    programs.add(rs.getString("ProgramCode"));
                }
                rs.close();
                pst.close();
                con.close();
                
                program = new JComboBox<>(programs.toArray(new String[0]));
                program.setSelectedItem(model.getValueAt(rowind,5).toString());
                String programcode = (model.getValueAt(rowind,5) != null) ? model.getValueAt(rowind,5).toString().trim(): "";
                if(programcode.isEmpty() && !programs.isEmpty()) {
                    programcode = programs.stream().sorted().findFirst().orElse("");
                }
                program.setSelectedItem(programcode);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

            Object[] fields = {
                "Student ID:", id,
                "First Name:", first_name,
                "Last Name:", last_name,
                "Year Level:", year_level,
                "Gender:", gender,
                "Program Code:", program
            };
            
            int result = JOptionPane.showConfirmDialog(null, fields, "Edit Student", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                StringBuilder missed = new StringBuilder();
                String pattern = "\\d{4}-\\d{4}";

                if (id.getText().trim().isEmpty()) {
                    missed.append("Student ID is missing\n");
                } else if (!id.getText().trim().matches(pattern)) {
                    missed.append("Student ID must follow the format YYYY-XXXX (ex. 2023-1949)\n");
                }

                if (first_name.getText().trim().isEmpty()) {
                    missed.append("First name is missing\n");
                } else if (!first_name.getText().trim().matches("[a-zA-Z ]+")) {
                            missed.append("First name must contain only alphabets\n");
                }
                if (last_name.getText().trim().isEmpty()) {
                    missed.append("Last name is missing\n");
                } else if (!last_name.getText().trim().matches("[a-zA-Z ]+")) {
                    missed.append("Last name must contain only alphabets\n");
                }

                if (year_level.getText().trim().isEmpty()) {
                    missed.append("Year Level is missing\n");
                } else {
                try {
                    int yearLevel = Integer.parseInt(year_level.getText().trim());
                    if (yearLevel < 1 || yearLevel > 6) {
                        missed.append("Year Level must be between 1 and 6\n");
                    }
            } catch (NumberFormatException e) {
                missed.append("Year Level must be a number between 1 and 6\n");
            }
        }
            boolean duplicateExists = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                if (i != selectedRow) { 
                    String newId = id.getText();
                    String existingId = model.getValueAt(i, 0).toString().trim();
                    if (newId.equals(existingId)) {
                        duplicateExists = true;
                        missed.append("Duplicate Student ID found! Student ID must be unique.\n");
                        break;
                    }
                }
            }
        if(duplicateExists) {
            JOptionPane.showMessageDialog(this, "Error: Duplicate Student ID detected!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
        }

        if (missed.length() > 0) {
            JOptionPane.showMessageDialog(this, missed.toString(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return; 
                }
                String sqlupdate = "UPDATE student SET " 
                        + " StudentID = '"+id.getText().trim()+"', FirstName = '"+first_name.getText().trim()+"', LastName = '"+last_name.getText().trim()+"'"
                        + ", YearLevel = '"+year_level.getText().trim()+"', Gender = '"+gender.getSelectedItem().toString()+"'"
                        + ", ProgramCode = '"+program.getSelectedItem().toString()+"' WHERE StudentID = '"+id.getText().trim()+"'";
                
                try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);
                PreparedStatement pst = con.prepareStatement(sqlupdate);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Student updated successfully");
                pst.close();
                con.close();
                    }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }
                table1.update_table(
                    jTable1,
                    jTextField6,
                    jLabel13,
                    "student",
                    Integer.parseInt(jTextField6.getText()),
                    currentSortColumnStudent,
                    currentSearchColumnStudent,
                    currentSearchKeywordStudent,
                    new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
                );
                }
        } else {
            JOptionPane.showMessageDialog(this, "Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SQLRead table1 = new SQLRead();
        if (selectedRow >= 0) { 
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int rowind = jTable1.convertRowIndexToModel(selectedRow);
            String studentdelete = model.getValueAt(rowind, 0).toString();

            String sqldelete = "DELETE FROM Student WHERE StudentID='"+studentdelete+"'";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection(dataConn, username, password);
                PreparedStatement pst = con.prepareStatement(sqldelete);
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirm==JOptionPane.YES_OPTION) {
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Student deleted");
                    model.removeRow(rowind);
                }
                pst.close();
                con.close();
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            
            table1.update_table(
                jTable1,
                jTextField6,
                jLabel13,
                "student",
                Integer.parseInt(jTextField6.getText()),
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
            selectedRow = -1; 
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        selectedRow = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedSort = jComboBox2.getSelectedItem().toString();
            String sortColumn;

            switch (selectedSort) {
                case "Student ID":
                    sortColumn = "StudentID";
                    break;
                case "First Name":
                    sortColumn = "FirstName";
                    break;
                case "Last Name":
                    sortColumn = "LastName";
                    break;
                case "Year Level":
                    sortColumn = "YearLevel";
                    break;
                case "Program Code":
                    sortColumn = "ProgramCode";
                    break;
                case "Sort by":
                default:
                    sortColumn = "";
                    break;
            }

            currentSortColumnStudent = sortColumn;
            jTextField6.setText("1");
            changetablestudent();
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        currentSearchKeywordStudent = jTextField4.getText().trim();
        String filter = jComboBox5.getSelectedItem().toString().trim();
        SQLRead reader = new SQLRead();

        if (filter.equalsIgnoreCase("ID Number")) {
            currentSearchColumnStudent = "StudentID";
        } else if (filter.equalsIgnoreCase("First Name")) {
            currentSearchColumnStudent = "FirstName";
        } else if (filter.equalsIgnoreCase("Last Name")) {
            currentSearchColumnStudent = "LastName";
        } else if (filter.equalsIgnoreCase("Year Level")) {
            currentSearchColumnStudent = "YearLevel";
        } else if (filter.equalsIgnoreCase("Gender")) {
            currentSearchColumnStudent = "Gender";
        } else if (filter.equalsIgnoreCase("Program Code")) {
            currentSearchColumnStudent = "ProgramCode";
        } else {
            currentSearchColumnStudent = "";
        }

        reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                1,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );

    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clearstudent();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SQLRead table1 = new SQLRead();
        if (checkStudent()) {
            try {
                String id = jTextField1.getText().trim();
                String first = jTextField2.getText().trim();
                String last = jTextField3.getText().trim();
                String year = jTextField5.getText().trim();
                String gender = jComboBox1.getSelectedItem().toString();
                String program = jComboBox4.getSelectedItem().toString();

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);

                String checkSQL = "SELECT * FROM STUDENT WHERE StudentID = '" + id + "'";
                PreparedStatement checkStatement = con.prepareStatement(checkSQL);
                ResultSet rs = checkStatement.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Duplicate Student ID", "Error", JOptionPane.ERROR_MESSAGE);
                    rs.close();
                    checkStatement.close();
                    con.close();
                    return;
                }

                rs.close();
                checkStatement.close();

                String insertSQL = "INSERT INTO STUDENT (StudentID, FirstName, LastName, YearLevel, Gender, ProgramCode) " +
                                   "VALUES ('" + id + "', '" + first + "', '" + last + "', " + year + ", '" + gender + "', '" + program + "')";

                PreparedStatement insertStatement = con.prepareStatement(insertSQL);
                insertStatement.executeUpdate();

                insertStatement.close();
                con.close();

                JOptionPane.showMessageDialog(this, "Student added");

                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField5.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox4.setSelectedIndex(0);

                table1.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                1,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SQLRead table1 = new SQLRead();
        if (checkProgram()) {
            try {
                String programCode = jTextField7.getText().trim();
                String programName = jTextField8.getText().trim();
                String collegeCode = jComboBox3.getSelectedItem().toString();

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);

                String checkSQL = "SELECT * FROM PROGRAM WHERE ProgramCode = '" + programCode + "'";
                PreparedStatement checkStatement = con.prepareStatement(checkSQL);
                ResultSet rs = checkStatement.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Duplicate Program Code", "Error", JOptionPane.ERROR_MESSAGE);
                    rs.close();
                    checkStatement.close();
                    con.close();
                    return;
                }

                rs.close();
                checkStatement.close();

                String insertSQL = "INSERT INTO PROGRAM (ProgramCode, ProgramName, CollegeCode) " +
                                   "VALUES ('" + programCode + "', '" + programName + "', '" + collegeCode + "')";
                PreparedStatement insertStatement = con.prepareStatement(insertSQL);
                insertStatement.executeUpdate();

                insertStatement.close();
                con.close();

                JOptionPane.showMessageDialog(this, "Program added");

                jTextField7.setText("");
                jTextField8.setText("");
                jComboBox3.setSelectedIndex(0);

                table1.update_table(
                    jTable2,
                    jTextField9,
                    jLabel14,
                    "program",
                    1,
                    currentSortColumnProgram,
                    currentSearchColumnProgram,
                    currentSearchKeywordProgram,
                    new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
                );
                
                upd_combobox_student();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        clearprog();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        currentSearchKeywordProgram = jTextField12.getText().trim();
        String filter = jComboBox8.getSelectedItem().toString().trim();
        SQLRead reader = new SQLRead();

        if (filter.equalsIgnoreCase("Program Code")) {
            currentSearchColumnProgram = "ProgramCode";
        } else if (filter.equalsIgnoreCase("Program Name")) {
            currentSearchColumnProgram = "ProgramName";
        } else if (filter.equalsIgnoreCase("College Code")) {
            currentSearchColumnProgram = "CollegeCode";
        } else {
            currentSearchColumnProgram = "";
        }

        reader.update_table(
            jTable2, jTextField9, jLabel14,
            "program",
            1,
            currentSortColumnProgram,
            currentSearchColumnProgram,
            currentSearchKeywordProgram,
            new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
        );
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedSort = jComboBox6.getSelectedItem().toString();
            String sortColumn;

            switch (selectedSort) {
                case "Program Code":
                    sortColumn = "ProgramCode";
                    break;
                case "Program Name":
                    sortColumn = "ProgramName";
                    break;
                case "College Code":
                    sortColumn = "CollegeCode";
                    break;
                case "Sort by":
                default:
                    sortColumn = "";
                    break;
            }

            currentSortColumnProgram = sortColumn;
            jTextField9.setText("1");
            changetableprogram();
        }
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        selectedRow = jTable2.getSelectedRow();
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        SQLRead table1 = new SQLRead();
        SQLRead table2 = new SQLRead();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            int rowind = jTable2.convertRowIndexToModel(selectedRow);
            String programdelete = model.getValueAt(rowind, 0).toString();
            int studentcounter = 0;

            String sqldelete = "DELETE FROM Program WHERE ProgramCode='" + programdelete + "'";
            String sqlcheck = "SELECT ProgramCode, COUNT(*) as c FROM student WHERE ProgramCode = ? GROUP BY ProgramCode";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);

                PreparedStatement pst2 = con.prepareStatement(sqlcheck);
                pst2.setString(1, programdelete);
                ResultSet rs = pst2.executeQuery();

                while (rs.next()) {
                    studentcounter = rs.getInt("c");
                }

                rs.close();
                pst2.close();

                if (studentcounter > 0) {
                    int check = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to delete? There will be " + studentcounter + " student(s) affected,\n"
                        + "and their Program Codes will be set to NULL/Blank.",
                        "WARNING",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                    );

                    if (check != JOptionPane.YES_OPTION) {
                        con.close();
                        return;
                    }

                    String updateStudents = "UPDATE student SET ProgramCode = NULL WHERE ProgramCode = ?";
                    PreparedStatement pstUpdate = con.prepareStatement(updateStudents);
                    pstUpdate.setString(1, programdelete);
                    pstUpdate.executeUpdate();
                    pstUpdate.close();
                }

                PreparedStatement pst = con.prepareStatement(sqldelete);
                pst.execute();
                pst.close();
                con.close();

                JOptionPane.showMessageDialog(this, "Program deleted");
                model.removeRow(rowind);
                table2.update_table(
                    jTable2, jTextField9, jLabel14,
                    "program", Integer.parseInt(jTextField9.getText()),
                    currentSortColumnProgram, currentSearchColumnProgram, currentSearchKeywordProgram,
                    new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
                );

                table1.update_table(
                    jTable1, jTextField6, jLabel13,
                    "student", Integer.parseInt(jTextField6.getText()),
                    currentSortColumnStudent, currentSearchColumnStudent, currentSearchKeywordStudent,
                    new String[]{"StudentID", "LastName", "FirstName", "ProgramCode", "YearLevel"}
                );

                selectedRow = -1;
                upd_combobox_prog();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        SQLRead table2 = new SQLRead();
        SQLRead table1 = new SQLRead();

        if (selectedRow >= 0) {
            List<String> colleges = new ArrayList<>();
            JComboBox<String> college = null;
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            int rowind = jTable2.convertRowIndexToModel(selectedRow);
            String old_code = model.getValueAt(rowind, 0).toString();
            JTextField program_code = new JTextField(old_code);
            JTextField program_name = new JTextField(model.getValueAt(rowind, 1).toString());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);
                String collegecodes = "SELECT CollegeCode FROM COLLEGE";
                PreparedStatement pst = con.prepareStatement(collegecodes);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    colleges.add(rs.getString("CollegeCode"));
                }

                rs.close();
                pst.close();
                con.close();

                college = new JComboBox<>(colleges.toArray(new String[0]));
                String collegecode = (model.getValueAt(rowind, 2) != null)
                    ? model.getValueAt(rowind, 2).toString().trim() : "";

                if (collegecode.isEmpty() && !colleges.isEmpty()) {
                    collegecode = colleges.stream().sorted().findFirst().orElse("");
                }

                college.setSelectedItem(collegecode);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            Object[] fields = {
                "Program Code:", program_code,
                "Program Name:", program_name,
                "College Code:", college
            };

            int result = JOptionPane.showConfirmDialog(null, fields, "Edit Program", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                StringBuilder missed = new StringBuilder();

                if (program_code.getText().trim().isEmpty()) {
                    missed.append("Program Code is missing\n");
                } else if (!program_code.getText().trim().matches("[A-Za-z0-9 ]+")) {
                    missed.append("Program Code must contain only letters, numbers, and spaces\n");
                }

                if (program_name.getText().trim().isEmpty()) {
                    missed.append("Program Name is missing\n");
                } else if (!program_name.getText().trim().matches("[A-Za-z ]+")) {
                    missed.append("Program Name must contain only letters and spaces\n");
                }
                
                boolean duplicateExists = false;
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (i != rowind) {
                        String newCode = program_code.getText().trim();
                        String existingCode = model.getValueAt(i, 0).toString().trim();
                        if (newCode.equalsIgnoreCase(existingCode)) {
                            duplicateExists = true;
                            missed.append("Duplicate Program Code found! Program Code must be unique.\n");
                            break;
                        }
                    }
                }

                if (missed.length() > 0) {
                    JOptionPane.showMessageDialog(this, missed.toString(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String new_code = program_code.getText().trim();
                String new_name = program_name.getText().trim();
                String new_college = college.getSelectedItem().toString();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(dataConn, username, password);

                    String sqlupdate = "UPDATE program SET ProgramCode = ?, ProgramName = ?, CollegeCode = ? WHERE ProgramCode = ?";
                    PreparedStatement pst2 = con.prepareStatement(sqlupdate);
                    pst2.setString(1, new_code);
                    pst2.setString(2, new_name);
                    pst2.setString(3, new_college);
                    pst2.setString(4, old_code);
                    pst2.executeUpdate();
                    pst2.close();

                    con.close();
                    JOptionPane.showMessageDialog(null, "Program updated successfully");

                    table2.update_table(
                        jTable2, 
                        jTextField9, 
                        jLabel14,
                        "program", 
                        Integer.parseInt(jTextField9.getText()),
                        currentSortColumnProgram, 
                        currentSearchColumnProgram, 
                        currentSearchKeywordProgram,
                        new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
                    );

                    table1.update_table(
                        jTable1, 
                        jTextField6, 
                        jLabel13,
                        "student", Integer.parseInt(jTextField6.getText()),
                        currentSortColumnStudent, 
                        currentSearchColumnStudent, 
                        currentSearchKeywordStudent,
                        new String[]{"StudentID", "LastName", "FirstName", "ProgramCode", "YearLevel"}
                    );

                    selectedRow = -1;
                    upd_combobox_student();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    e.printStackTrace();
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        SQLRead table3 = new SQLRead();
        if (checkCollege()) {
            try {
                String collegeCode = jTextField10.getText().trim();
                String collegeName = jTextField11.getText().trim();

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);

                String checkSQL = "SELECT * FROM COLLEGE WHERE CollegeCode = '" + collegeCode + "'";
                PreparedStatement checkStatement = con.prepareStatement(checkSQL);
                ResultSet rs = checkStatement.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Duplicate College Code", "Error", JOptionPane.ERROR_MESSAGE);
                    rs.close();
                    checkStatement.close();
                    con.close();
                    return;
                }

                rs.close();
                checkStatement.close();

                String insertSQL = "INSERT INTO COLLEGE (CollegeCode, CollegeName) " +
                                   "VALUES ('" + collegeCode + "', '" + collegeName + "')";
                PreparedStatement insertStatement = con.prepareStatement(insertSQL);
                insertStatement.executeUpdate();

                insertStatement.close();
                con.close();

                JOptionPane.showMessageDialog(this, "College added");

                jTextField10.setText("");
                jTextField11.setText("");

                table3.update_table(
                    jTable3,
                    jTextField13,
                    jLabel15,
                    "college",
                    1,
                    currentSortColumnCollege,
                    currentSearchColumnCollege,
                    currentSearchKeywordCollege,
                    new String[]{"CollegeCode", "CollegeName"}
                );
                upd_combobox_prog();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        clearcollege();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        currentSearchKeywordCollege = jTextField14.getText().trim();
        String filter = jComboBox9.getSelectedItem().toString().trim();
        SQLRead reader = new SQLRead();

        if (filter.equalsIgnoreCase("College Code")) {
            currentSearchColumnCollege = "CollegeCode";
        } else if (filter.equalsIgnoreCase("College Name")) {
            currentSearchColumnCollege = "CollegeName";
        } else {
            currentSearchColumnCollege = "";
        }

        reader.update_table(
            jTable3, jTextField13, jLabel15,
            "college",
            1,
            currentSortColumnCollege,
            currentSearchColumnCollege,
            currentSearchKeywordCollege,
            new String[]{"CollegeCode", "CollegeName"}
        );
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedSort = jComboBox7.getSelectedItem().toString();
            String sortColumn;

            switch (selectedSort) {
                case "College Code":
                    sortColumn = "CollegeCode";
                    break;
                case "College Name":
                    sortColumn = "CollegeName";
                    break;
                case "Sort by":
                default:
                    sortColumn = "";
                    break;
            }

            currentSortColumnCollege = sortColumn;
            jTextField13.setText("1");
            changetablecollege();
        }
    }//GEN-LAST:event_jComboBox7ItemStateChanged

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        selectedRow = jTable3.getSelectedRow();
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        SQLRead table1 = new SQLRead();
        SQLRead table2 = new SQLRead();

        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            int rowind = jTable3.convertRowIndexToModel(selectedRow);
            String collegeCodeToDelete = model.getValueAt(rowind, 0).toString();
            int studentCounter = 0;

            String sqldelete = "DELETE FROM COLLEGE WHERE CollegeCode = '" + collegeCodeToDelete + "'";
            String sqlcheck = "SELECT CollegeCode, COUNT(*) as c FROM student WHERE CollegeCode = ? GROUP BY CollegeCode";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dataConn, username, password);
                PreparedStatement pst2 = con.prepareStatement(sqlcheck);
                pst2.setString(1, collegeCodeToDelete);
                ResultSet rs = pst2.executeQuery();

                while (rs.next()) {
                    studentCounter = rs.getInt("c");
                }

                rs.close();
                pst2.close();

                if (studentCounter > 0) {
                    int check = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to delete this College? There are " + studentCounter + " student(s) affected,\n"
                        + "and their College Codes will be set to NULL/Blank.",
                        "WARNING",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                    );

                    if (check != JOptionPane.YES_OPTION) {
                        con.close();
                        return;
                    }

                    String updateStudents = "UPDATE student SET CollegeCode = NULL WHERE CollegeCode = ?";
                    PreparedStatement pstUpdate = con.prepareStatement(updateStudents);
                    pstUpdate.setString(1, collegeCodeToDelete);
                    pstUpdate.executeUpdate();
                    pstUpdate.close();
                }

                PreparedStatement pst = con.prepareStatement(sqldelete);
                pst.execute();
                pst.close();
                con.close();

                JOptionPane.showMessageDialog(this, "College deleted");

                model.removeRow(rowind);
                table2.update_table(
                    jTable3, jTextField13, jLabel15,
                    "college", Integer.parseInt(jTextField13.getText()),
                    currentSortColumnCollege, currentSearchColumnCollege, currentSearchKeywordCollege,
                    new String[]{"CollegeCode", "CollegeName"}
                );
                
                table1.update_table(
                    jTable2, jTextField9, jLabel14,
                    "program", Integer.parseInt(jTextField9.getText()),
                    currentSortColumnProgram, currentSearchColumnProgram, currentSearchKeywordProgram,
                    new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
                );

                selectedRow = -1;
                upd_combobox_prog();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        SQLRead table2 = new SQLRead();
        SQLRead table1 = new SQLRead();
        
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            int rowind = jTable3.convertRowIndexToModel(selectedRow);
            String old_code = model.getValueAt(rowind, 0).toString();
            JTextField college_code = new JTextField(old_code);
            JTextField college_name = new JTextField(model.getValueAt(rowind, 1).toString());

            Object[] fields = {
                "College Code:", college_code,
                "College Name:", college_name
            };

            int result = JOptionPane.showConfirmDialog(null, fields, "Edit College", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                StringBuilder missed = new StringBuilder();

                // Validate inputs
                if (college_code.getText().trim().isEmpty()) {
                    missed.append("College Code is missing\n");
                } else if (!college_code.getText().trim().matches("[A-Za-z0-9 ]+")) {
                    missed.append("College Code must contain only letters, numbers, and spaces\n");
                }

                if (college_name.getText().trim().isEmpty()) {
                    missed.append("College Name is missing\n");
                } else if (!college_name.getText().trim().matches("[A-Za-z ]+")) {
                    missed.append("College Name must contain only letters and spaces\n");
                }

                boolean duplicateExists = false;
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (i != rowind) {
                        String newCode = college_code.getText().trim();
                        String existingCode = model.getValueAt(i, 0).toString().trim();
                        if (newCode.equalsIgnoreCase(existingCode)) {
                            duplicateExists = true;
                            missed.append("Duplicate College Code found! College Code must be unique.\n");
                            break;
                        }
                    }
                }

                if (missed.length() > 0) {
                    JOptionPane.showMessageDialog(this, missed.toString(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String new_code = college_code.getText().trim();
                String new_name = college_name.getText().trim();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(dataConn, username, password);

                    String sqlupdate = "UPDATE COLLEGE SET CollegeCode = ?, CollegeName = ? WHERE CollegeCode = ?";
                    PreparedStatement pst2 = con.prepareStatement(sqlupdate);
                    pst2.setString(1, new_code);
                    pst2.setString(2, new_name);
                    pst2.setString(3, old_code);
                    pst2.executeUpdate();
                    pst2.close();

                    con.close();
                    JOptionPane.showMessageDialog(null, "College updated successfully");

                    table2.update_table(
                        jTable3, 
                        jTextField13, 
                        jLabel15,
                        "college", 
                        Integer.parseInt(jTextField13.getText()),
                        currentSortColumnCollege, 
                        currentSearchColumnCollege, 
                        currentSearchKeywordCollege,
                        new String[]{"CollegeCode", "CollegeName"}
                    );

                    table1.update_table(
                        jTable2, 
                        jTextField9, 
                        jLabel14,
                        "program", Integer.parseInt(jTextField9.getText()),
                        currentSortColumnProgram, 
                        currentSearchColumnProgram, 
                        currentSearchKeywordProgram,
                        new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
                    );

                    selectedRow = -1;
                    upd_combobox_prog();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    e.printStackTrace();
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        jTextField4KeyReleased(null);
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        jTextField12KeyReleased(null);
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int value = Integer.parseInt(jTextField6.getText().trim());
            int maxPage = Integer.parseInt(jLabel13.getText().replace("/", "").trim());

            if (value > 1) {
                value--;
            }

            jTextField6.setText(String.valueOf(value));
            SQLRead reader = new SQLRead();
            reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                value,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        } catch (NumberFormatException e) {
            jTextField6.setText("1");
            SQLRead reader = new SQLRead();
            reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                1,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int value = Integer.parseInt(jTextField6.getText().trim());
            int maxPage = Integer.parseInt(jLabel13.getText().replace("/", "").trim());

            if (value < maxPage) {
                value++;
            }

            jTextField6.setText(String.valueOf(value));
            SQLRead reader = new SQLRead();
            reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                value,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        } catch (NumberFormatException e) {
            jTextField6.setText("1");
            SQLRead reader = new SQLRead();
            reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                1,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        try {
            int value = Integer.parseInt(jTextField6.getText().trim());
            int maxPage = Integer.parseInt(jLabel13.getText().replace("/", "").trim());

            if (value < 1) value = 1;
            if (value > maxPage) value = maxPage;

            jTextField6.setText(String.valueOf(value));
            SQLRead reader = new SQLRead();
            reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                value,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        } catch (NumberFormatException e) {
            jTextField6.setText("1");
            SQLRead reader = new SQLRead();
            reader.update_table(jTable1,jTextField6,
                jLabel13,
                "student",
                1,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            int currentPage = Integer.parseInt(jTextField9.getText());
            if (currentPage > 1) {
                currentPage--;
                jTextField9.setText(String.valueOf(currentPage));
                changetableprogram();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            int currentPage = Integer.parseInt(jTextField9.getText());
            int maxPage = Integer.parseInt(jLabel14.getText().replace("/", ""));
            if (currentPage < maxPage) {
                currentPage++;
                jTextField9.setText(String.valueOf(currentPage));
                changetableprogram();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            int currentPage = Integer.parseInt(jTextField13.getText());
            if (currentPage > 1) {
                currentPage--;
                jTextField13.setText(String.valueOf(currentPage));
                changetablecollege();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       try {
            int currentPage = Integer.parseInt(jTextField13.getText());
            int maxPage = Integer.parseInt(jLabel15.getText().replace("/", ""));
            if (currentPage < maxPage) {
                currentPage++;
                jTextField13.setText(String.valueOf(currentPage));
                changetablecollege();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        try {
            int value = Integer.parseInt(jTextField9.getText().trim());
            int maxPage = Integer.parseInt(jLabel14.getText().replace("/", "").trim());

            if (value < 1) value = 1;
            if (value > maxPage) value = maxPage;

            jTextField9.setText(String.valueOf(value));
            SQLRead reader = new SQLRead();
            reader.update_table(
                jTable2,
                jTextField9,
                jLabel14,
                "program",
                value,
                currentSortColumnProgram,
                currentSearchColumnProgram,
                currentSearchKeywordProgram,
                new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
            );
        } catch (NumberFormatException e) {
            jTextField9.setText("1");
            SQLRead reader = new SQLRead();
            reader.update_table(
                jTable2,
                jTextField9,
                jLabel14,
                "program",
                1,
                currentSortColumnProgram,
                currentSearchColumnProgram,
                currentSearchKeywordProgram,
                new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
            );
        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13KeyReleased

    private int selectedRow = -1;    
    /**
     * @param args the command line arguments
     */
    public Home() {
   
        initComponents(); 
        SQLRead table1 = new SQLRead(), table2 = new SQLRead(), table3 = new SQLRead();
        String currentSortColumnStudent = ""; String currentSearchKeywordStudent = ""; String currentSearchColumnStudent = "";
        String currentSortColumnProgram = ""; String currentSearchKeywordProgram = ""; String currentSearchColumnProgram = "";
        String currentSortColumnCollege = ""; String currentSearchKeywordCollege = ""; String currentSearchColumnCollege = "";
        SQLRead reader = new SQLRead();
        
        reader.update_table(
            jTable1,
            jTextField6,
            jLabel13,
            "student",
            1,
            currentSortColumnStudent,
            currentSearchColumnStudent,
            currentSearchKeywordStudent,
            new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
        );
        reader.update_table(
            jTable2,
            jTextField9,
            jLabel14,
            "program",
            1,
            currentSortColumnProgram,
            currentSearchColumnProgram,
            currentSearchKeywordProgram,
            new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
        );
        reader.update_table(
            jTable3,
            jTextField13,
            jLabel15,
            "college",
            1,
            currentSortColumnCollege,
            currentSearchColumnCollege,
            currentSearchKeywordCollege,
            new String[]{"CollegeCode", "CollegeName"}
        );

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTable1.setDefaultEditor(Object.class, null);
        jTable2.setDefaultEditor(Object.class, null);
        jTable3.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> sorter2 = new TableRowSorter<>(model2);
        jTable2.setRowSorter(sorter2);
        DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();
        TableRowSorter<DefaultTableModel> sorter3 = new TableRowSorter<>(model3);
        jTable3.setRowSorter(sorter3);
    }
    
    private void clearstudent() {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField5.setText(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        
    }
    
    private void clearprog() {
        jTextField7.setText(null);
        jTextField8.setText(null);
        jComboBox3.setSelectedIndex(0);
        
    }
    
    private void clearcollege() {
        jTextField10.setText(null);
        jTextField11.setText(null);

        
    }
    
  public boolean checkStudent() {
    StringBuilder missed = new StringBuilder();
    String pattern = "\\d{4}-\\d{4}";
    
    if (jTextField1.getText().isEmpty()) {
        missed.append("Student ID is missing\n");
    } else if (!jTextField1.getText().matches(pattern)) {
        missed.append("Student ID must follow the format YYYY-XXXX (ex. 2023-1949)\n");
    }

    if (jTextField2.getText().isEmpty()) {
         missed.append("First name is missing\n");
    } else if (!jTextField2.getText().matches("[a-zA-Z ]+")) {
        missed.append("First name must contain only alphabets\n");
    }

    if (jTextField3.getText().isEmpty()) {
        missed.append("Last name is missing\n");
    } else if (!jTextField3.getText().matches("[a-zA-Z ]+")) {
        missed.append("Last name must contain only alphabets\n");
    }
    
    if (jTextField5.getText().isEmpty()) {
        missed.append("Year Level is missing\n");
    } else {
        try {
            int yearLevel = Integer.parseInt(jTextField5.getText());
            if (yearLevel < 1 || yearLevel > 6) {
                missed.append("Year Level must be between 1 and 6\n");
            }
        } catch (NumberFormatException e) {
            missed.append("Year Level must be a number between 1 and 6\n");
        }
    }

    

    if (missed.length() > 0) {
        JOptionPane.showMessageDialog(this, missed.toString(), "WARNING", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    return true;
}
  
public boolean checkProgram() {
    StringBuilder missed = new StringBuilder();  
    if (jTextField7.getText().isEmpty()) {
        missed.append("Program Code is missing\n");
    } else if (!jTextField7.getText().matches("[A-Z ]+")) {
        missed.append("Program Code must contain only capitalized letters\n");
    }
    if (jTextField8.getText().isEmpty()) {
         missed.append("Program Name is missing\n");
    } else if (!jTextField8.getText().matches("[a-zA-Z ]+")) {
        missed.append("Program Name must contain only alphabets\n");
    }
    

    if (missed.length() > 0) {
        JOptionPane.showMessageDialog(this, missed.toString(), "WARNING", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    return true;
}

public boolean checkCollege() {
    StringBuilder missed = new StringBuilder();
    
    if (jTextField10.getText().isEmpty()) {
        missed.append("College Code is missing\n");
    } else if (!jTextField10.getText().matches("[A-Z ]+")) {
        missed.append("College Code must contain only capitalized letters\n");
    }
    if (jTextField11.getText().isEmpty()) {
         missed.append("College Name is missing\n");
    } else if (!jTextField11.getText().matches("[a-zA-Z ]+")) {
        missed.append("College Name must contain only alphabets\n");
    }

    

    if (missed.length() > 0) {
        JOptionPane.showMessageDialog(this, missed.toString(), "WARNING", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    return true;
}
  
    private void changetablestudent() {
        try {
            int page = Integer.parseInt(jTextField6.getText());
            SQLRead reader = new SQLRead();
            reader.update_table(
                jTable1,
                jTextField6,
                jLabel13,
                "student",
                page,
                currentSortColumnStudent,
                currentSearchColumnStudent,
                currentSearchKeywordStudent,
                new String[]{"StudentID", "FirstName", "LastName", "YearLevel", "Gender", "ProgramCode"}
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
        }
    }
    
    private void changetableprogram() {
        try {
            int page = Integer.parseInt(jTextField9.getText());
            SQLRead reader = new SQLRead();

            reader.update_table(
                jTable2,
                jTextField9,
                jLabel14,
                "program",
                page,
                currentSortColumnProgram,
                currentSearchColumnProgram,
                currentSearchKeywordProgram,
                new String[]{"ProgramCode", "ProgramName", "CollegeCode"}
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
        }
    } 
    
    private void changetablecollege() {
        try {
            int page = Integer.parseInt(jTextField13.getText());
            SQLRead reader = new SQLRead();

            reader.update_table(
                jTable3,
                jTextField13,
                jLabel15,
                "college",
                page,
                currentSortColumnCollege,
                currentSearchColumnCollege,
                currentSearchKeywordCollege,
                new String[]{"CollegeCode", "CollegeName"}
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid page number!");
        }
    } 
    
    private void upd_combobox_prog() {
        jComboBox3.removeAllItems();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dataConn, username, password);
            String sql = "SELECT CollegeCode FROM college";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String code = rs.getString("CollegeCode");
                jComboBox3.addItem(code);
            }

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading college codes: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void upd_combobox_student() {
        jComboBox4.removeAllItems();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dataConn, username, password);
            String sql = "SELECT ProgramCode FROM program";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String code = rs.getString("ProgramCode");
                jComboBox4.addItem(code);
            }

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading program codes: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
