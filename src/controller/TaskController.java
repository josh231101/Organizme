/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectionSQL;
import model.Task;

/**
 *
 * @author TEAM ORGANIZME
 */
public class TaskController extends ConnectionSQL{
    
    public TaskController(){}
    
    public void fillTasksTableFromDB(JTable table){

        DefaultTableModel modeloTabla = new DefaultTableModel();
        table.setModel(modeloTabla);
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            
            Connection conexion = getConnection();

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
            conexion.close();
            // Set widths
            table.getColumnModel().getColumn(0).setPreferredWidth(25);
            table.getColumnModel().getColumn(modeloTabla.getColumnCount()-1).setPreferredWidth(1);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"No pudo cargarse la tabla :/");
            System.err.println("Error loading table");
        }
        
        
    }
    
    
    public boolean updateTaskToDatabase(Task task){
        PreparedStatement ps = null;
        ResultSetImpl rs= null;
        try{
            Connection conexion = getConnection();
            
            ps = (PreparedStatement) conexion.prepareStatement("update tasks set due_date=?,title=?,task_type=?,status=?,finished=? WHERE id=?");
            ps.setDate(1, task.getDateSQL());
            ps.setString(2, task.getTitle());
            ps.setString(3, task.getType());
            ps.setString(4, task.getStatus());
            ps.setBoolean(5, task.isFinished());
            ps.setInt(6, task.getId());
            ps.executeUpdate();
            return true;
        }catch(Exception er){
            System.err.println(er);
            JOptionPane.showMessageDialog(null, "Uh? Algo ocurrió mal");
            return false;
        }
    }
    public boolean saveTaskToDatabase(Task task){
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            Connection conexion = getConnection();
            String statement = "insert into tasks(due_date,title,task_type,status,created_at,finished) values(?,?,?,?,?,?)";
            ps = (PreparedStatement) conexion.prepareStatement(statement);
            ps.setDate(1, task.getDateSQL());
            ps.setString(2, task.getTitle());
            ps.setString(3, task.getType());
            ps.setString(4, task.getStatus());
            ps.setDate(5, new Date(System.currentTimeMillis()));
            ps.setBoolean(6, false);
            ps.execute();
            return true;
            
        }catch(Error exc){
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(TaskController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
