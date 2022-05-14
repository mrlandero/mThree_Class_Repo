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
public class MiniMadLibs {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's Play Tony's MadLibs!!!");
        
        System.out.println("I need a noun: ");
        String noun1 = scan.nextLine();
        
        System.out.println("\nNow an adjective: ");
        String adjective1 = scan.nextLine();
        
        System.out.println("\nAnother noun: ");
        String noun2 = scan.nextLine();
        
        System.out.println("\nAnd a number: ");
        String number1 = scan.nextLine();
        
        System.out.println("\nAnother adjective: ");
        String adjective2 = scan.nextLine();
        
        System.out.println("\nA plural noun: ");
        String pluralNoun1 = scan.nextLine();
        
        System.out.println("\nAnother plural noun: ");
        String pluralNoun2 = scan.nextLine();
        
        System.out.println("\nOne last plural noun: ");
        String pluralNoun3 = scan.nextLine();
        
        System.out.println("\nA present-tense verb: ");
        String presentVerb = scan.nextLine();
        
        System.out.println("\nThe same verb, but in past-tense: ");
        String pastVerb = scan.nextLine();
        
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the of the starship " + noun2 + ". "
                + "Its " + number1 + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " + adjective2 +
                " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", to boldly " + presentVerb +
                " where no one has " + pastVerb + " before.");
    }
}
