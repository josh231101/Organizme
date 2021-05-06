/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import controller.TaskController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ConnectionSQL;
import model.Task;
import organizme.MainPanel;
import utils.Utils;
/**
 *
 * @author josuearreola
 */
public class TaskInfo extends javax.swing.JFrame {

    /**
     * Creates new form TaskInfo
     */
    public TaskInfo(Task task) {
        initComponents();
        fillInputsFromTaskClass(task);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        taskTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        taskDate = new com.toedter.calendar.JDateChooser();
        editTask = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        taskType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        taskStatus = new javax.swing.JComboBox<>();
        taskFinishedComboBox = new javax.swing.JCheckBox();
        taskId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Edit Task");

        jLabel1.setText("Nombre de la tarea");
        addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e) {
                MainPanel mp = new MainPanel();
                mp.setVisible(true);
                System.out.println("here");
                dispose();
            }
        });

        taskTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTitleActionPerformed(evt);
            }
        });

        jLabel2.setText("Terminada?");

        jLabel4.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel4.setText("Fecha vencimiento");

        editTask.setText("EDIT TASK");
        editTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTaskActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de tarea");

        taskType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Task", "Reminder", "Call", "Event", " " }));

        jLabel7.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel7.setText("Estatus");

        taskStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "In Progress", "Urgent" }));

        taskFinishedComboBox.setText("Terminada");
        taskFinishedComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskFinishedComboBoxActionPerformed(evt);
            }
        });

        taskId.setText("TASK ID: ");

        jLabel5.setText("Task ID:");

        jButton1.setText("Back to Panel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(taskStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)
                            .addComponent(taskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(taskFinishedComboBox)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taskType, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(taskDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editTask))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editTask))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taskFinishedComboBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(taskStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskId)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTitleActionPerformed

    private void editTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTaskActionPerformed
        String task = taskTitle.getText();
        String type = taskType.getSelectedItem().toString();
        String status = taskStatus.getSelectedItem().toString();
        boolean isFinished = taskFinishedComboBox.isSelected();
        int taskId = Integer.parseInt(this.taskId.getText());
        
        if(Utils.verifyDataTaskFilled(task,taskDate)){
            java.sql.Date date = new java.sql.Date(taskDate.getDate().getTime());
            // DRY SPR
            TaskController newTask = new TaskController(task, type, status, date,isFinished, taskId);
            boolean savedResult = newTask.updateTaskToDatabase();
            if(savedResult){
                JOptionPane.showMessageDialog(null, "Task Updated");
                MainPanel mainPanel = new MainPanel();
                mainPanel.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "No pudo guardarse");
            }
        }
    }//GEN-LAST:event_editTaskActionPerformed

    private void taskFinishedComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskFinishedComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskFinishedComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainPanel mp = new MainPanel();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton editTask;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public com.toedter.calendar.JDateChooser taskDate;
    private javax.swing.JCheckBox taskFinishedComboBox;
    private javax.swing.JLabel taskId;
    public javax.swing.JComboBox<String> taskStatus;
    public javax.swing.JTextField taskTitle;
    public javax.swing.JComboBox<String> taskType;
    // End of variables declaration//GEN-END:variables

    private void fillInputsFromTaskClass(Task task) {
        taskTitle.setText(task.getTitle());
        taskType.setSelectedItem(Utils.getTaskTypeComboxIndex(task.getType()));
        taskStatus.setSelectedIndex(Utils.getTaskStatusComboxIndex(task.getStatus()));
        taskDate.setDate(new Date(task.getDueDate()));
        taskId.setText(String.valueOf(task.getId()));
    }
    
}