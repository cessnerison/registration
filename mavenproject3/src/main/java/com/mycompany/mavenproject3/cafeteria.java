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
public class cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      System.out.println("cafeteria");
      System.out.println("Snack");
      System.out.println("[1] - Hotdog 25.00");
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your choice");
      int choice = input.nextInt();
      int cash = 0;
      
      if(choice ==1)
      {
          System.out.println("hotdog");
          System.out.println("25.00");
          int hotdog = 25;
          System.out.println("Enter Quantity");
          int quantity = input.nextInt();
          int semtot = quantity * hotdog;
          System.out.println("Your semi total is:" + semtot );
          
          while(cash < semtot) {
           System.out.println("Enter Payment");
           cash = input.nextInt();   
          }
        int change = cash - semtot;
        if(change > 0){
           System.out.println("Payment Succesful");
           System.out.println("Your Change is:" + change);
        
        }
        else{
        System.out.println("Payment Succesful");
         System.out.println("No Change");
        }
      }
    }
}
      
     
      

