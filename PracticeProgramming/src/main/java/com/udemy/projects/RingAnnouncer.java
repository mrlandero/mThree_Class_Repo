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
public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equalsIgnoreCase("win")) {
                wins += 1;
            } else if (record[i].equalsIgnoreCase("loss")) {
                losses += 1;
            }
        }
        System.out.println("\nWith a professional record of " + wins + " Wins, and " + losses + " losses.");
        System.out.println("He is the pride of Oracle: Java Fury!");
    }
}
