package utils;

import com.toedter.calendar.JDateChooser;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        switch(type){
            case "Task": return 0;
            case "Reminder": return 1;
            case "Call": return 2;
            case "Event": return 3;
            default : return 1;
        }
    }
    public static int getTaskStatusComboxIndex(String status){
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
                // GET THE START DATE TO LONG TO COMPARE
                Date dateHoy = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
                String strDate = dateFormat.format(dateHoy);  
                SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
                Date d = f.parse(strDate);
                long todayDate = d.getTime();
                long dateLong = date.getDate().getTime();
                if(dateLong >= 0 && dateLong >= todayDate){
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null,"Select a valid date!");
                    return false;
                }
            }catch(Exception err){
                JOptionPane.showMessageDialog(null, "You are missing due date");
                return false;
            }
            
        }    
    }
    public static void openClassFromLink(String URL) throws IOException{
        switch(getUserSO().toLowerCase()){
            case "linux":
                Runtime.getRuntime().exec(new String[]{"bash", "-c", "google-chrome "+URL});
                break;
                
            case "windows":
                String script = "start chrome" + URL;
                Runtime.getRuntime().exec(new String[]{"cmd", "/c", script});
                break;
            case "unix":
            case "maxos":
            case "macos":
            default:
                Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Google Chrome.app", URL});
                break;
            
        }
    }
    public static String getUserSO(){
        // dry - spr
        return System.getProperty("os.name");
    }
    
}
