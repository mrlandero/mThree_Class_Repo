/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyl.loops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tony Landero
 */
public class LoopExamples {
    public static void main(String[] args) {
        
        //For loops are used when we know in advanced the number of times we want to run this block of code
//        for (int i = 3; i < 6; i++) {
//            System.out.println(i);
//        }
        //If we just want to count the 'odd' numbers:
//        
        // If we want to count using a while-loop instead of a for-loop:
//        
        //A while-loop until the random number generated meets the criteria
//        
        //Counting from 1-5 using a do-while loop:
//        int i = 1;
//        
//        do {
//            System.out.println(i);
//            i++;
//        } while(i < 6); //A do-while loop guarantees that the loop run AT LEAST once
        
        Scanner scan = new Scanner(System.in);
        int userNumber;
        String userNumberString;
        
        do {
            System.out.println("Please enter a number between 1 and 20: ");
            userNumberString = scan.nextLine();
            userNumber = Integer.parseInt(userNumberString);
        } while(userNumber < 1 || userNumber > 20);
        
        System.out.println("Thank you!!! Your number was: " + userNumber);
    }
}
