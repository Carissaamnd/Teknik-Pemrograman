/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teori1;

/**
 *
 * @author Carissa Amanda
 */
public class Name {
    private final String name;
    private final int birth;
    private Course course;
    
    public Name (String name, int birth){
        this.name = name;
        this.birth = birth;
    }
    
    public void setCourse (Course course){
        this.course = course;
    }
    
    public void displayIdol(){
        System.out.println ("Name: " + name);
        System.out.println ("Birth: " + birth);
        if (course != null){
            System.out.println ("Course: " + course.getCourseName());
        } else {
            System.out.println ("Invalid data inputted.");
        }
    }
}
