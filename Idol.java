/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teori1;

/**
 *
 * @author Carissa Amanda
 */
public class Idol {
    public static void main (String[] args){
        Course javaCourse = new Course ("Birth Year", 2000);
        
        Name name1 = new Name ("Haechan", 2000);
        
        name1.setCourse (javaCourse);
        
        name1.displayIdol();
    }
}
