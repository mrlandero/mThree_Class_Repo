/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyl.adder;

//Import the Scanner class - From the instance in the source code, press alt+enter for hints
import java.util.Scanner;

/**
 *
 * @author Tony Landero
 * email: mr.landero@gmail.com
 * date: 05/09/2022
 * purpose: to write a simple program to add two user input values
 */
public class Adder {
    public static void main(String[] args) {
        //Declare the variables & initialize to 0
        int sum = 0;
        int operand1 = 0;
        int operand2 = 0;
        
        //Instantiate a new Scanner class
        Scanner sc = new Scanner(System.in);
        
        //Declare the String operand variables we'll receive from the user. User inputs come in as Strings
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        //Ask user for the first value to add, and then use Scanner to wait for the answer
        System.out.println("Please enter the first number to be added: ");
        stringOperand1 = sc.nextLine();
        
        //Ask user for the second value to add, and then use Scanner to wait for the answer
        System.out.println("Please enter the second number to be added: ");
        stringOperand2 = sc.nextLine();
        
        //Convert stringOperands from user input into integers for our sum operation
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        //Assign the sum of operand1 & operand2 to the variable sum
        sum = operand1 + operand2;
        
        //Print the sum in the console
        System.out.println("The sum is: " + sum);
    }
}
