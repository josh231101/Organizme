/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import model.ConnectionSQL;

/**
 *
 * @author TEAM ORGANIZME
 */
public class FillClassListController {
    
    public void fillClassListFromDB(JList list){
        try{
            DefaultListModel model = new DefaultListModel();
            PreparedStatement ps = null;
            ResultSetImpl rs = null;
            
            ConnectionSQL con = new ConnectionSQL();
            Connection conexion = con.getConnection();
            
            ps = (PreparedStatement) conexion.prepareStatement("select name from clases");
            rs = (ResultSetImpl) ps.executeQuery();
            
            while(rs.next()){
                model.addElement(rs.getString("name"));
            }
            list.setModel(model);
            conexion.close();
            
        }catch(Exception err){
            System.out.println(err.getMessage());
            JOptionPane.showMessageDialog(null,"UPS! NO pudo encontrarse materias!");
        }
    }
    
}
