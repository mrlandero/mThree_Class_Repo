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
public class Javapedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**************Javapedia*****************");
        
        //Task 1: Ask the user: How many historical figures will you register?. Store the value in an int variable.
        System.out.println("How many historical figures will you register?");
        int people = scan.nextInt();
        
        //Task 2: Make a 2D array named: database. The data we're going to submit will take the form of a table.
        //So, our array must have as many rows as there are historical figures. Each row also needs 3 values.
        String[][] database = new String[people][3];
        
        scan.nextLine(); //Throwaway nextLine() to capture upcoming user input
        
        //Task 3: Create a for loop that runs through every row in the database. The user needs to submit three values per row.
        //As the user submits each value, you need to store it in the appropriate row. While doing this task, be careful of the nextLine pitfall (see cheat sheet).
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i + 1));
            System.out.println("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.println("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.println("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.println("\n");
        }
        System.out.println("These are the values you stored: ");
        print2DArray(database);
        
        //Task 5: The final task is to let the user search the database by name. If the search matches a name in database, print that row's information.
        //When printing the information, add a tab of space before each line.
        System.out.println("\nWho do you want information on? ");
        String name = scan.nextLine();
        
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }
        
        scan.close();
    }
    
    /**
     * Task 4
     * Function name: print2DArray
     * @param array (String[][])
     * Inside the function
     *  1. print the database
     *      - a tab of space precedes each row.
     *      - each value in database has one space from the other value.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
