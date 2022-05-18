/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.projects;

import java.util.Scanner;

/**
 *
 * @author Tony Landero
 */
public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int numToppings = scan.nextInt(); scan.nextLine();
        String[] toppings = new String[numToppings];
        
        System.out.println("Great, enter each topping!");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". ");
            toppings[i] = scan.nextLine();
        }
        
        System.out.println("\nThank you! Here are the toppings you ordered: ");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great! a driver is on the way!");
        
        scan.close();
    }
}
