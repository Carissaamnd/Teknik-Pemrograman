/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teori1;

/**
 *
 * @author Carissa Amanda
 */
public class Course {
    private final String courseName;
    private final int courseAge;
    
    public Course (String courseName, int courseAge){
        this.courseName = courseName;
        this.courseAge = courseAge;
    }
    
    public String getCourseName(){
        return courseName;
    }
}