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
public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), 
            randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        
        int highScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }
    
    public static int randomNumber() {
        double randomDouble = Math.random() * 5000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
