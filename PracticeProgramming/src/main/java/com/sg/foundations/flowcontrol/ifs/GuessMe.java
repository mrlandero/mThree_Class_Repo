/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Tony Landero
 */
public class GuessMe {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int hiddenNumber = 7;
        
        System.out.println("Welcome to Tony's Casino. You're playing Guess the Number.");
        System.out.println("Press 'enter' to get started.");
        scan.nextLine();
        
        
        System.out.println("\nNow, please enter a number between 1 and 20: ");
        int response = Integer.parseInt(scan.nextLine());
        
      
        if (response == hiddenNumber) {
            System.out.println("Wow! What a guess, " + response + " was it!");
            
        } else if (response < hiddenNumber) {
            System.out.println("Ha! Nice try, " + response + " is too low! I chose " + hiddenNumber + ".");
            
        } else {
            System.out.println("Too bad " + response + " is way too high. I chose " + hiddenNumber);
            
        }
     
       }
       
    }

