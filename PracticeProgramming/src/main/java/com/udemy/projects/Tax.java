/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.projects;

import java.util.Arrays;

/**
 *
 * @author Tony Landero
 */
public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];
        
        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] * 1.13;
        }
        
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The after tax prices are: " + Arrays.toString(afterTax));
    }
}
