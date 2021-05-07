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
import model.Clase;
import model.ConnectionSQL;

/**
 *
 * @author TEAM ORGANIZME
 */
public class ClassListController extends ConnectionSQL{
    private String nombreClase;
    
    public ClassListController(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ClassListController() {
    }
    
    public String getLinkToClassFromClassName(){
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            Connection conexion = getConnection();
            String statement = "select link from clases WHERE name=? LIMIT 1";
            ps = (PreparedStatement) conexion.prepareStatement(statement);
            ps.setString(1,getNombreClase());
            rs = (ResultSetImpl) ps.executeQuery();
            
            while(rs.next()){
                return rs.getString("link");
            }
            conexion.close();
        }catch(Error exc){
            return "";
        } catch (SQLException ex) {
            Logger.getLogger(TaskController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public boolean saveNewClassToDB(Clase newClass) {
        Connection conexion = getConnection();
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            String statement = "insert into clases(name,link,maestro) values(?,?,?)";
            ps = (PreparedStatement) conexion.prepareStatement(statement);
            ps.setString(1,newClass.getClassName());
            ps.setString(2, newClass.getLinkUrl());
            ps.setString(3, newClass.getTeacherName());
            ps.execute();
            return true;
            
        }catch(Error exc){
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(TaskController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                conexion.close();
            }catch(SQLException e){
                System.err.println("UPS! Something went wrong");
            }
            
        }
        return false;
    }
    public void fillClasesInfoToTable(JTable table){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        table.setModel(modeloTabla);
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            
            Connection conexion = getConnection();

            ps = (PreparedStatement) conexion.prepareStatement("select id,name,link,maestro from clases");
            rs = (ResultSetImpl) ps.executeQuery();
            
            modeloTabla.addColumn("Id");
            modeloTabla.addColumn("Nombre de la clase");
            modeloTabla.addColumn("Link");
            modeloTabla.addColumn("Maestro");           
            while(rs.next()){
                // DRY KISS
                Object fila[] = new Object[modeloTabla.getColumnCount()];
                for(int i = 0;i<modeloTabla.getColumnCount();i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            conexion.close();
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"No pudo cargarse la tabla :/");
            System.err.println("Error loading table");
        }
        
        
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String className) {
        this.nombreClase = className;
    }

    public boolean deleteClass(int claseId) {
        Connection conexion = getConnection();
        
        try {
            PreparedStatement ps = (PreparedStatement) conexion.prepareStatement("delete from clases where id=?");
            ps.setInt(1, claseId);
            ps.executeUpdate();
            conexion.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClassListController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean patchClassInfo(Clase clase) {
        Connection conexion = getConnection();
        PreparedStatement ps = null;
        
        try {
            System.out.println(clase.getTeacherName());
            ps = (PreparedStatement) conexion.prepareStatement("update clases set name=?,link=?,maestro=? WHERE id=?");
            ps.setString(1, clase.getClassName());
            ps.setString(2, clase.getLinkUrl());
            ps.setString(3, clase.getTeacherName());
            ps.setInt(4, clase.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClassListController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}
