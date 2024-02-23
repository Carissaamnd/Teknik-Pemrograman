/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;
import java.util.Scanner;
/**
 *
 * @author Carissa Amanda
 */
import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int n = scanner.nextInt();
        
        while (n-- > 0){
            try {
                long x = scanner.nextLong();
                System.out.println (x + "can be fitted:");
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            } catch (Exception e){
                System.out.println (scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
