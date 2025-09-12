/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author CL3-PC35
 */
import java.util.Scanner;
public class mul {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st Number:");
    int num1 = input.nextInt();
     System.out.print("Enter 2nd Number:");
     int num2 = input.nextInt();  
        
      
       int mul = num1 * num2;
       
       System.out.print("the diff of 2 number is:" + mul);
    }
}
