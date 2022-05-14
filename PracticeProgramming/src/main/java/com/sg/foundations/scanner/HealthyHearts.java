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
public class HealthyHearts {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Landero Exercise Calculator");
        System.out.println("Enter your age to generate your tailored recommendations.");
        System.out.println("Press 'enter' to get started: ");
        scan.nextLine();
        
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scan.nextLine());
        int maximumHeartRate = 220 - age;
        
        System.out.println("Your maximum heart rate, while working out, should be " + maximumHeartRate + " beats per minute.");
        
        int lowRange = (int)(maximumHeartRate * .50);
        int highRange = (int)(maximumHeartRate * .85);
        System.out.println("Your target HR Zone is " + lowRange + "-" + highRange + " beats per minute, while working out.");
        
    }
}
