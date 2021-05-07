/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author team organizme
 */
public class Clase {
    private String className;
    private String linkUrl;
    private String teacherName;
    private int id;
    
    public Clase(String className, String linkUrl, String teacherName) {
        this.className = className;
        this.linkUrl = linkUrl;
        this.teacherName = teacherName;
    }

    public Clase(String className, String linkUrl, String teacherName, int id) {
        this.className = className;
        this.linkUrl = linkUrl;
        this.teacherName = teacherName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    
    
    
}
