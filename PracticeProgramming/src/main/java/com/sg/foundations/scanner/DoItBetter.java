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
public class DoItBetter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many miles can you run without stopping? ");
        int miles = Integer.parseInt(scan.nextLine());
        System.out.println("That's cool, but I can run " + ((miles * 2) + 1) + " miles without stopping. So...");
        
        System.out.println("\nHow many hot dogs can you eat in one sitting? ");
        int hotDogs = Integer.parseInt(scan.nextLine());
        System.out.println("You can only eat " + hotDogs + " hot dogs in one sitting, huh? Well, I can eat " + ((hotDogs * 2) + 1) +" hot dogs in one sitting. So, yeah...");
        
        System.out.println("\nHow many languages do you know? ");
        int languages = Integer.parseInt(scan.nextLine());
        System.out.println("You really know " + languages + " langauges? Tha't cute! I know " + ((languages * 2) + 1) + " languages. But I don't mean to brag, you know? ");
        
        System.out.println("\nOk, bye! I have to go. I hope you enjoyed my modesty.");
    }
}
