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
public class InABucket {
    public static void main(String[] args) {
        
        //You can declare all kinds of variables.
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        //But declaring them just sets up the spacefor data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies: ");
        System.out.println(piesEaten);
        
        weightOfTeacupPig = 56.5f;
        grainsOfSand = 5000;
        
        System.out.println("The Teacup pig weighs: " + weightOfTeacupPig + " ounces.");
        System.out.println("There are " + grainsOfSand + " grains of sand in Galveston");
    }
}
