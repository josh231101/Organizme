/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Date;

/**
 *
 * @author TEAM ORGANIZME
 */
public class Task {
    private boolean finished;
    private String status;
    private String title;
    private String type;
    private long dueDate;
    private int id;
    private Date dateSQL;

    
    
    public Task(boolean finished, String status, String title, String type, long dueDate,int id) {
        this.finished = finished;
        this.status = status;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
        this.id = id;
    }
    
    public Task(boolean finished, String status, String title, String type, Date dueDate,int id) {
        this.finished = finished;
        this.status = status;
        this.title = title;
        this.type = type;
        this.dateSQL = dueDate;
        this.id = id;
    }

    public Task(String status, String title, String type, long dueDate) {
        this.status = status;
        this.title = title;
        this.type = type;
        this.dueDate = dueDate;
    }

    public Task(String status, String title, String type, Date dateSQL) {
        this.status = status;
        this.title = title;
        this.type = type;
        this.dateSQL = dateSQL;
    }
    
    public Date getDateFromLong(){
        return new Date(this.getDueDate());
    }

    public Date getDateSQL() {
        return dateSQL;
    }

    public void setDateSQL(Date dateSQL) {
        this.dateSQL = dateSQL;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

        
    
    
    
}
