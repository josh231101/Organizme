/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectionSQL;

/**
 *
 * @author josuearreola
 */
public class FillTasksTableController {
    public void fillTasksTableFromDB(JTable table){

        DefaultTableModel modeloTabla = new DefaultTableModel();
        table.setModel(modeloTabla);
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            
            ConnectionSQL con = new ConnectionSQL();
            Connection conexion = con.getConnection();

            ps = (PreparedStatement) conexion.prepareStatement("select finished,status,title,task_type,due_date,id from tasks WHERE finished=0");
            rs = (ResultSetImpl) ps.executeQuery();
            
            modeloTabla.addColumn("Completado");
            modeloTabla.addColumn("Status");
            modeloTabla.addColumn("Ttitle");
            modeloTabla.addColumn("Type");
            modeloTabla.addColumn("Due date");
            modeloTabla.addColumn("ID");                   
            while(rs.next()){
                // DRY KISS
                Object fila[] = new Object[modeloTabla.getColumnCount()];
                for(int i = 0;i<modeloTabla.getColumnCount();i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            // Set widths
            table.getColumnModel().getColumn(0).setPreferredWidth(25);
            table.getColumnModel().getColumn(modeloTabla.getColumnCount()-1).setPreferredWidth(1);
        }catch(Exception err){
            JOptionPane.showMessageDialog(table, err);
            System.err.println("Error loading table");
        }
        
        
    }
    
}
