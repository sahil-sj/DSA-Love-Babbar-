package com.company;

import java.util.Scanner;

public class Pattern11 {
    // Pattern 11
    public static void main(String [] args){
        /*
        Pattern 11
                     * * * * *
                      * * * *
                       * * *
                        * *
                         *
         */
        // Creating Scanner Object For taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Number of ROWS and COLUMNS from the USER
        System.out.print(" Enter Number of ROWS for the Pattern: ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        // Procedure to print the Required Pattern
        for(int row =1; row <= n ; row++){
            for(int spaces = 1; spaces<= row - 1; spaces++){
                System.out.print("  ");
            }
            for(int column = 1; column <= n - row + 1; column++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
