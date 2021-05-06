package utils;

import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josuearreola
 */
public class Utils {
    public static int getTaskTypeComboxIndex(String type){
        System.out.println(type);
        switch(type){
            case "Task": return 0;
            case "Reminder": return 1;
            case "Call": return 2;
            case "Event": return 3;
            default : return 1;
        }
    }
    public static int getTaskStatusComboxIndex(String status){
        System.out.println(status);
        switch(status){
            case "Active" : return 0;
            case "In Progress": return 1 ;
            case "Urgent" : return 2;
            default : return 0;
        }
    }
    public static boolean verifyDataTaskFilled(String task,JDateChooser date){
        if(task.isEmpty()){
            JOptionPane.showMessageDialog(null, "You are missing task name");
            return false;
        }
        else{
            try{
                long dateLong = date.getDate().getTime();
                if(dateLong >= 0){
                    return true;
                }
            }catch(Exception err){
                JOptionPane.showMessageDialog(null, "You are missing due date");
                return false;
            }
            
        }    
        return false;
    }
}
