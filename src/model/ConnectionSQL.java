/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import static organizme.MainPanel.URL;
import static organizme.MainPanel.password;
import static organizme.MainPanel.usuario;

/**
 *
 * @author josuearreola
 */
public class ConnectionSQL {
    public static final String URL = "jdbc:mysql://localhost:3306/organizme?characterEncoding=utf8&autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "password";

    
    public Connection getConnection(){
        // return a new connection
        Connection conexion = null;

        try {
           Class.forName("com.mysql.jdbc.Driver");
           conexion = (Connection) DriverManager.getConnection(URL,usuario,password);
        } catch(Exception e) {
            System.err.println("Error" + e);
        }
        return conexion;
    }
}
