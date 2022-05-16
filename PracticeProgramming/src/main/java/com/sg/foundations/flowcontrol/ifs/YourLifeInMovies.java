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
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Tony's Memory Lane...");
        System.out.println("Today's topic: Your Life in Movies!!!");
        System.out.println("What's your name? ");
        String userName = scan.nextLine();
        
        System.out.println("Ok, " + userName + ", in what year were you born? ");
        int userYear = Integer.parseInt(scan.nextLine());
        
        System.out.println("Well, " + userName + "...");
        if (userYear < 2005 && userYear > 1995) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago.");
        } else if (userYear < 1995 && userYear > 1985) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago.");
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        } else if (userYear < 1985 && userYear > 1975) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago.");
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT!");
        } else if (userYear < 1975 && userYear > 1965) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago.");
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT!");
            System.out.println("And that the original Jurassic Park release is closer to the first lunar landing than it is to today!");
        } else if (userYear < 1965) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago.");
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT!");
            System.out.println("And that the original Jurassic Park release is closer to the first lunar landing than it is to today!");
            System.out.println("Finally, the TV series MASH has been around for almost half a century!");
        }
    }
}
