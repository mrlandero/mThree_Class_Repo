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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String yourName = scan.nextLine();
        
        System.out.println("Hi " + yourName + "! My name is Tony.");
        
        System.out.println("\nSo " + yourName + ", what is your favorite color? ");
        String color = scan.nextLine();
        
        System.out.println("So you like " + color + ", eh? My favorite color is actually white.");
        
        System.out.println("\nI really like tacos! What is your favorite food, " + yourName + "?");
        String favoriteFood = scan.nextLine();
        
        System.out.println("Really, you REALLY like " + favoriteFood + "? That's wild!");
        
        System.out.println("\nSpeaking of favorites, do you have a favorite number? ");
        int favoriteNumber = Integer.parseInt(scan.nextLine());
        
        System.out.println(favoriteNumber + " is a cool number. My favorite number is 7.");
        System.out.println("Did you know that " + favoriteNumber + " X 7 is " + (favoriteNumber * 7) + "? That's a cool number too!");
        
        System.out.println("Well, thanks for talking to me, " + yourName + "!");
        
    }
}
