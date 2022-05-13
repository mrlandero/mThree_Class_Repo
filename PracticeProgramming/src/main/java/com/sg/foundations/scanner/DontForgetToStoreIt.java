/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Tony Landero
 */
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Give me pi to at least 5 decimals: ");
        pi = Double.parseDouble(scan.nextLine());
        
        
        //We've used Double.parseDouble(), but meaningOfLifeAndEverything is an INT
        // So we'll have to use Integer.parseInt();
        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLifeAndEverything = Integer.parseInt(scan.nextLine());
        
        
        System.out.println("What is your favorite kind of chesse? ");
        cheese = scan.nextLine();
        
        
        System.out.println("What is your favorite color? ");
        color = scan.nextLine();
        
        
        System.out.println("Ooh " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
    }
}
