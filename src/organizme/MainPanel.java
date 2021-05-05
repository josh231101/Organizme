/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizme;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import controller.FillClassListController;
import controller.FillTasksTableController;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import view.NewTask;
/**
 * 
 *
 * @author josuearreola
 */
public class MainPanel extends javax.swing.JFrame {
    public static final String URL = "jdbc:mysql://localhost:3306/organizme?characterEncoding=utf8&autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "password";

    /**
     * Creates new form MainPanel
     */
    /**
     * CONTROLLER DECLARATION
     */
    FillClassListController filler = new FillClassListController();
    FillTasksTableController fillerTasks = new FillTasksTableController();
    public MainPanel() {
        initComponents();
        fillerTasks.fillTasksTableFromDB(taskTable);
        filler.fillClassListFromDB(clasesList);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clasesList = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        taskPanel = new javax.swing.JPanel();
        dateField = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bdConnector = new javax.swing.JButton();
        addTask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 2147483647));
        setPreferredSize(new java.awt.Dimension(1080, 640));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(239, 239, 239));
        jPanel2.setMinimumSize(new java.awt.Dimension(280, 0));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(112, 110, 251));
        jPanel4.setMinimumSize(new java.awt.Dimension(250, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(1593, 521));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        sidePanel.setBackground(new java.awt.Color(112, 110, 251));
        sidePanel.setForeground(new java.awt.Color(112, 110, 251));
        sidePanel.setMaximumSize(new java.awt.Dimension(250, 32767));
        sidePanel.setMinimumSize(new java.awt.Dimension(250, 0));
        sidePanel.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(112, 110, 251));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Settings");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("...");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        titulo.setBackground(new java.awt.Color(112, 110, 251));
        titulo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Organizme");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloLayout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_1.jpg"))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Josué Arreola");

        clasesList.setBackground(new java.awt.Color(112, 110, 251));
        clasesList.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        clasesList.setForeground(new java.awt.Color(255, 255, 255));
        clasesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        clasesList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clasesList.setDragEnabled(true);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        clasesList.setBorder(emptyBorder);
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) clasesList.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        clasesList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clasesListFocusGained(evt);
            }
        });
        clasesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clasesListMouseClicked(evt);
            }
        });
        clasesList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clasesListKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(clasesList);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addComponent(jSeparator1)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        jPanel4.add(sidePanel);

        taskPanel.setBackground(new java.awt.Color(244, 246, 248));
        taskPanel.setMaximumSize(new java.awt.Dimension(327670, 327670));
        taskPanel.setMinimumSize(new java.awt.Dimension(400, 0));

        dateField.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        dateField.setForeground(new java.awt.Color(102, 102, 102));
        // Todays date
        String pattern = "dd MM yyyy";

        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date according to the chosen pattern
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        String todayAsString = df.format(today);
        dateField.setText("DATE");
        dateField.setText("Date: "  +todayAsString);

        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tasks");

        bdConnector.setBackground(new java.awt.Color(112, 110, 251));
        bdConnector.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        bdConnector.setForeground(new java.awt.Color(255, 255, 255));
        bdConnector.setText("Save Changes");
        bdConnector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdConnectorActionPerformed(evt);
            }
        });

        addTask.setFocusPainted(false);
        addTask.setBackground(new java.awt.Color(112, 110, 251));
        addTask.setForeground(new java.awt.Color(255, 255, 255));
        addTask.setText("Create Task");
        addTask.setToolTipText("Click to create a task");
        addTask.setBorder(null);
        addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(20, 50));

        taskTable.setAutoCreateRowSorter(true);
        taskTable.setBorder(null);
        taskTable.setBackground(new java.awt.Color(255, 255, 255));
        taskTable.setForeground(new java.awt.Color(0, 0, 0));
        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(true), "In Progress", "HEllo", "Task", "10/10/2020"}
            },
            new String [] {
                "Checkbox", "Status", "Title", "Type", "Due date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        taskTable.setToolTipText("");
        taskTable.setFocusable(false);
        taskTable.setGridColor(new java.awt.Color(255, 255, 255));
        taskTable.setIntercellSpacing(new java.awt.Dimension(0, 10));
        taskTable.setMinimumSize(new java.awt.Dimension(0, 100));
        taskTable.setRowHeight(32);
        taskTable.setShowVerticalLines(false);
        taskTable.getTableHeader().setForeground(new Color(255,255,255));
        taskTable.setGridColor(new Color(255,255,255));
        taskTable.getTableHeader().setBackground(new Color(112,110,251));
        jScrollPane1.setViewportView(taskTable);
        if (taskTable.getColumnModel().getColumnCount() > 0) {
            taskTable.getColumnModel().getColumn(0).setResizable(false);
            taskTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            taskTable.getColumnModel().getColumn(1).setResizable(false);
            taskTable.getColumnModel().getColumn(1).setPreferredWidth(10);
            taskTable.getColumnModel().getColumn(2).setResizable(false);
            taskTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            taskTable.getColumnModel().getColumn(3).setResizable(false);
            taskTable.getColumnModel().getColumn(3).setPreferredWidth(10);
            taskTable.getColumnModel().getColumn(4).setResizable(false);
            taskTable.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        javax.swing.GroupLayout taskPanelLayout = new javax.swing.GroupLayout(taskPanel);
        taskPanel.setLayout(taskPanelLayout);
        taskPanelLayout.setHorizontalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bdConnector))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addComponent(dateField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addTask, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        taskPanelLayout.setVerticalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bdConnector))
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(dateField))
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addTask, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(taskPanel);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdConnectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdConnectorActionPerformed
        // TODO add your handling code here:
        // BD CONNECTOR
        Connection conexion = getConnection();
        PreparedStatement ps;
        ResultSetImpl rs;
        
        try{
            ps = (PreparedStatement) conexion.prepareStatement("select * from employee");
            rs = (ResultSetImpl) ps.executeQuery();
            
            while(rs.next()){
                JOptionPane.showMessageDialog(null, "NOMbre:" + rs.getString("first_name"));
            }
            conexion.close();
            
        }catch(Exception e){
            System.out.println("ERROR: "+ e);
        }
        
    }//GEN-LAST:event_bdConnectorActionPerformed

    private void addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskActionPerformed
        System.out.println("CLicked!");
        NewTask taskPanel = new NewTask();
        taskPanel.setVisible(true);
        System.out.println(taskPanel.taskName.getText());
    }//GEN-LAST:event_addTaskActionPerformed

    private void clasesListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clasesListFocusGained
        // TODO add your handling code here:
        System.out.println("ok");
        System.out.println(evt.getID());
    }//GEN-LAST:event_clasesListFocusGained

    private void clasesListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clasesListKeyPressed
        // TODO add your handling code here:
        System.out.println("KEY PRESSED");
    }//GEN-LAST:event_clasesListKeyPressed

    private void clasesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clasesListMouseClicked
        // TODO add your handling code here:
        System.out.println("hola amigos");
        clasesList.getSelectedIndex();
        System.out.println(clasesList.getSelectedIndex());
    }//GEN-LAST:event_clasesListMouseClicked

    public Connection getConnection(){
        // return a new connection
        Connection conexion = null;
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conexion = (Connection) DriverManager.getConnection(URL,usuario,password);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch(Exception e) {
            System.err.println("Error" + e);
        }
        return conexion;
    }
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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new MainPanel().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTask;
    private javax.swing.JButton bdConnector;
    private javax.swing.JList<String> clasesList;
    private javax.swing.JLabel dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel taskPanel;
    private javax.swing.JTable taskTable;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables
}
