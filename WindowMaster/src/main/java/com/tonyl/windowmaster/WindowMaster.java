/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyl.windowmaster;

//Import the Scanner utility 
import java.util.Scanner;
/**
 *
 * @author Tony Landero
 * email: mr.landero@gmail.com
 * date: 05/09/2022
 * purpose: calculate the total cost for home replacement windows.
 * 
 */
public class WindowMaster {
    public static void main(String[] args) {
        
        //Instantiate a new Scanner instance
        Scanner scan = new Scanner(System.in);
        
        //Ask user for the window's height and wait for the answer
        System.out.println("Enter the height of the window: (in sq. feet)");
        String windowHeight = scan.nextLine();
        
        //Ask user for the window's width and wait for the answer
        System.out.println("Enter the width of the window: ");
        String windowWidth = scan.nextLine();
        
        //Parse the String variables we received into floats for calculations
        float height = Float.parseFloat(windowHeight);
        float width = Float.parseFloat(windowWidth);
        
        /* 
        Calculate area and perimeter of rectangle:
        A = height * width
        P = 2 * (height + width)
        */
        float area = height * width;
        float perimeter = 2 * (height + width);
        System.out.println("The area of this window is: " + area + " sq. feet.");
        System.out.println("The perimeter of this window is: " + perimeter + " feet.");
        
        /*
        Calculate the total cost of each window:
        - The glass for the window is $3.50/sq. foot (area)
        - The trim for the window is $2.25/sq. foot (perimeter)
        */
        float windowCost = (area * 3.50f) + (perimeter * 2.25f);
        
        System.out.println("The total cost of a window with an area of " + area + " sq. feet, and a perimeter of " + perimeter + 
                " feet, is $" + windowCost + ".");
        
        scan.close();
    }
}
