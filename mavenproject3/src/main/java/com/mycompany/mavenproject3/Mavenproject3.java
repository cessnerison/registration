/*
import java.util.Scanner;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import java.util.Scanner;
/**
 *
 * @author CL3-PC35
 */
public class Mavenproject3 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("Enter Player 1:");
        int p1 = input.nextInt();
        System.out.print("Enter Player 2:");
        int p2 = input.nextInt();
        
        //if condition
        if(p1==1 && p2==1)
        {
        System.out.print("DRAW");
        }    
        else if (p1==1 && p2==2)    
        {
         System.out.print("Player 2 win");
        }
         else if (p1==1 && p2==3)    
        {
         System.out.print("Player 1 win");
        }
         else if (p1==2 && p2==1)    
        {
         System.out.print("Draw");
        }
         else if (p1==2 && p2==2)    
        {
         System.out.print("Player 2 win");
        }
        else if (p1==2 && p2==3)    
        {
         System.out.print("Player 2 win");
        }
         else if (p1==3 && p2==1)    
        {
         System.out.print("Player 2 win");
        }
         else if (p1==3&& p2==2)    
        {
         System.out.print("Player 1 win");
        }
        else if (p1==3&& p2==2)    
        {
         System.out.print("Draw");
        }
        else 
        {
         System.out.print("Invalid");
        }
    }
}
