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
public class LotteryTickets {
    public static void main(String[] args) {
        
        //Task 1: At the Java Jackpot, there are 6 winning numbers. You're feeling good about the numbers:
        //Using Arrays.copyOf(), copy all the elements of ticket into a variable: ticket2. But, change the third value to 54.
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;
        
        //Call the function for each ticket:
        System.out.print("Ticket 1 numbers are: ");
        printTicketNumbers(ticket);
        
        System.out.print("Ticket 2 numbers are: ");
        printTicketNumbers(ticket2);
    }
    
    /**
     * Task 2:
     * Function name: printTicketNumbers
     * @param ticket ( int[] )
     * 
     * Inside the function:
     *  1. print the numbers in one line.
     *      i.e  1 4 6 3 2 6
     *  2. add a new line
     */
    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.println("\n");
    }
}
