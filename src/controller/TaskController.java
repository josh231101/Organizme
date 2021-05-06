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
import model.ConnectionSQL;

/**
 *
 * @author josuearreola
 */
public class TaskController {
    private String taskName;
    private String taskType;
    private String taskStatus;
    private Date taskDate;
    private boolean finished;
    private int id;

    public TaskController(String taskName, String taskType, String taskStatus, Date taskDate) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
        this.taskDate = taskDate;
    }

    public TaskController(String taskName, String taskType, String taskStatus, Date taskDate, boolean finished,int id) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
        this.taskDate = taskDate;
        this.finished = finished;
        this.id = id;
    }
    public boolean updateTaskToDatabase(){
        PreparedStatement ps = null;
        ResultSetImpl rs= null;
        try{
            ConnectionSQL con = new ConnectionSQL();
            Connection conexion = con.getConnection();
            
            ps = (PreparedStatement) conexion.prepareStatement("update tasks set due_date=?,title=?,task_type=?,status=?,finished=? WHERE id=?");
            ps.setDate(1, getTaskDate());
            ps.setString(2, getTaskName());
            ps.setString(3, getTaskType());
            ps.setString(4, getTaskStatus());
            ps.setBoolean(5, isFinished());
            ps.setInt(6, getId());
            ps.executeUpdate();
            return true;
        }catch(Exception er){
            System.err.println(er);
            JOptionPane.showMessageDialog(null, "Uh? Algo ocurrió mal");
            return false;
        }
    }
    public boolean saveTaskToDatabase(){
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            ConnectionSQL con = new ConnectionSQL();
            Connection conexion = con.getConnection();
            String statement = "insert into tasks(due_date,title,task_type,status,created_at,finished) values(?,?,?,?,?,?)";
            ps = (PreparedStatement) conexion.prepareStatement(statement);
            ps.setDate(1, getTaskDate());
            ps.setString(2, getTaskName());
            ps.setString(3, getTaskType());
            ps.setString(4, getTaskStatus());
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }
    
    
    
}
