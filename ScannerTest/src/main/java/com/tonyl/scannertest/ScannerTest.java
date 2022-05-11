/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyl.scannertest;

//Import the Scanner utility
import java.util.Scanner;

/**
 *
 * @author Tony Landero
 * email: mr.landero@gmail.com
 * date: 05/09/2022
 * purpose: to understand the problem with Scanner and work around it
 */
public class ScannerTest {
    //Create the main class
    public static void main(String[] args) {
        
        //Intitialize variables
        String name;
        int age;
        int numComputers;
        String hometown;
        
        //Create a new Scanner instance
        Scanner sc = new Scanner(System.in);
        
        //Ask the user to enter their name, age and use Scanner to wait for their answer
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter your age: ");
        age = sc.nextInt(); //Does not care about the 'enter' key. It just wants to wait for an int.
        System.out.println("Enter your number of computers: "); //Ask user to enter how many computers they own
        numComputers = sc.nextInt(); //Waits for the user to input an int
        System.out.println("Enter your hometown: "); //Ask user to enter their hometown
        sc.nextLine(); //Add a throwaway nextLine(); to consume the 'enter' key from the above nextInt();
        hometown = sc.nextLine(); //Wait for the user to input their hometown
        
        //Outputs displaying to the user what they entered
        System.out.println("You said:");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your number of computers is: " + numComputers);
        System.out.println("Your hometown is: " + hometown);
    }
}
