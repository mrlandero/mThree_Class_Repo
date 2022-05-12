/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyl.loops;

import java.util.Random;

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
        int i = 1;
        
        do {
            System.out.println(i);
            i++;
        } while(i < 6); //A do-while loop guarantees that the loop run AT LEAST once
    }
}
