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
import model.ConnectionSQL;

/**
 *
 * @author josuearreola
 */
public class ClassListController {
    private String nombreClase;

    public ClassListController(String nombreClase) {
        this.nombreClase = nombreClase;
    }
    
    public String getLinkToClassFromClassName(){
        try{
            PreparedStatement ps = null;
            ResultSetImpl rs= null;
            ConnectionSQL con = new ConnectionSQL();
            Connection conexion = con.getConnection();
            String statement = "select link from clases WHERE name=? LIMIT 1";
            ps = (PreparedStatement) conexion.prepareStatement(statement);
            ps.setString(1,getNombreClase());
            rs = (ResultSetImpl) ps.executeQuery();
            
            while(rs.next()){
                return rs.getString("link");
            }
            
        }catch(Error exc){
            return "";
        } catch (SQLException ex) {
            Logger.getLogger(TaskController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String className) {
        this.nombreClase = className;
    }
    
    
}
