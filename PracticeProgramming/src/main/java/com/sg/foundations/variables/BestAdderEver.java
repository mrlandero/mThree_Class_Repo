/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author Tony Landero
 */
public class BestAdderEver {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int number1;
        int number2;
        int number3;
        String stringNumber1;
        String stringNumber2;
        String stringNumber3;
        int total;
        
        System.out.println("Please enter the first number to add: ");
        stringNumber1 = scan.nextLine();
        number1 = Integer.parseInt(stringNumber1);
        
        System.out.println("Please enter the second number to add: ");
        stringNumber2 = scan.nextLine();
        number2 = Integer.parseInt(stringNumber2);
        
        System.out.println("Please enter the third number to add: ");
        stringNumber3 = scan.nextLine();
        number3 = Integer.parseInt(stringNumber3);
        
        total = number1 + number2 + number3;
        
        System.out.println("You chose to add " + number1 + " + " + number2 + " + " + number3);
        System.out.println("The total is: " + total + "!");
    }
}
