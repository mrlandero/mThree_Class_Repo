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
public class Prices {
    public static void main(String[] args) {
        
        //Task 1: Create a 2-D array that can store 3 rows and 5 columns of double values
        
        //Task 2: Populate the 2-D array with values from the article table
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        
        //Task 3 (Updated for Workbook 6.13 Revisit): Print the prices for each department
        //Prices should share a single line
        for (int i = 0; i < prices.length; i++) {
            switch(i) {
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
