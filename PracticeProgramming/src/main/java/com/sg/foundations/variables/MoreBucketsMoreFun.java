/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Tony Landero
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        
        //Declare ALL THE THINGS
        //(Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;
        
        //Now give a couple of them some values
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--; //Using the decrement operator variable--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        //The operators ++ and -- are unary operators, which means they take
        //only one value (instead of two values, like a binary operator does). 
        //They are used to increment an existing value to the next higher or 
        //next lower value, as a shortcut for "+1" or "-1" respectively.
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("...maybe my computer can't do math, after all!");
    }
}
