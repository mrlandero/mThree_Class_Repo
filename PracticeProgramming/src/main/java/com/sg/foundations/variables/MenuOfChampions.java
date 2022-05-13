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
public class MenuOfChampions {
    public static void main(String[] args) {
        
        String restaurantName;
        String greetingMessage;
        String foodItem1;
        String foodItem2;
        String foodItem3;
        double priceItem1;
        double priceItem2;
        double priceItem3;
        
        restaurantName = "TONY'S LOUNGE";
        greetingMessage = "Today's Menu Is...";
        
        foodItem1 = "Tony's Famous Burger";
        priceItem1 = 20.00;
        
        foodItem2 = "Alicia's Amazing Green Bean Casserole";
        priceItem2 = 18.00;
        
        foodItem3 = "The Ultimate Strawberry Sugar-Free Cake";
        priceItem3 = 15.00;
        
        
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        System.out.println("\n\tWELCOME TO " + restaurantName + "!");
        System.out.println("\t" + greetingMessage);
        System.out.println("\n.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        
        System.out.println("\n$" + priceItem1 + " >>> " + foodItem1);
        System.out.println("$" + priceItem2 + " >>> " + foodItem2);
        System.out.println("$" + priceItem3 + " >>> " + foodItem3);
    }
}
