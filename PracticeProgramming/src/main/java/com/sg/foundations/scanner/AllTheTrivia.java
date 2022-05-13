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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Landero Quiz Experience!!!");
        System.out.println("Please answer the following questions to the best of your ability.");
        System.out.println("Once you have answered all the questions, we'll display your answers aong with any points you scored for that question.");
        System.out.println("Ready? Press 'enter' to begin: ");
        
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        
        System.out.println("Question 1: ");
        System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
        String questionOne = scan.nextLine();
        
        System.out.println("\nQuestion 2: ");
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        String questionTwo = scan.nextLine();
        
        System.out.println("\nQuestion 3: ");
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
        String questionThree = scan.nextLine();
        
        System.out.println("\nQuestion 4: ");
        System.out.println("What is the most abundant element in the Earth's atmosphere? ");
        String questionFour = scan.nextLine();
        
        System.out.println("\nWow, 1,024 Gigabytes is a " + questionTwo + "!");
        System.out.println("You score 0 points for this question...");
        
        System.out.println("\n" + questionThree + " is the only planet that rotates clockwise, neat!");
        System.out.println("You score 0 points for this question...");
        
        System.out.println("\nI didn't know that the largest ever volcano was discovered on " + questionFour + "!");
        System.out.println("You score 0 points for this question...");
        
        System.out.println("\nThat's amazing that " + questionOne + " is the most abundant element in the atmosphere...");
        System.out.println("You score 0 points for this question...");
        
        System.out.println("\nYour total points scored is 0. What happened? I thought you were a genius!!!");
    }
}
