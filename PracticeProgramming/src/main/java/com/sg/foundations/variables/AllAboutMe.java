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
public class AllAboutMe {
    public static void main(String[] args) {
        String myName;
        String favoriteFood;
        int pets;
        String dwellingType;
        boolean learnedToWhistle;
        
        myName = "Tony";
        favoriteFood = "tacos";
        pets = 3;
        dwellingType = "house";
        learnedToWhistle = true;
        
        System.out.println("My name is " + myName + ".");
        System.out.println("My favorite thing to eat is " + favoriteFood + ".");
        System.out.println("I have " + pets + " pets.");
        System.out.println("I live in a " + dwellingType + ".");
        System.out.println("It is " + learnedToWhistle + " that I learned how to whistle.");
    }
}
