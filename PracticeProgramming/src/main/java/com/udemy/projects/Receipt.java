/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.projects;

/**
 *
 * @author Tony Landero
 */
public class Receipt {
    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {1.99, 1.49, 1.29};
        
        System.out.println("Here's your receipt:\n");
        for (int i = 0; i < apples.length; i++) {
            System.out.println("\t" + apples[i] + ": $" + prices[i]);
        }
    }
}
