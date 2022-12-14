package com.company;

import java.util.Scanner;

public class Pattern32 {
    // Pattern 32
    public static void main(String [] args){
        /*
        Pattern 32
                               E
                               D E
                               C D E
                               B C D E
                               A B C D E
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

            int ch = 60 + n - row + 1 + 4;  // ( e.g E = 69 (in ASCII) so 60 + 5 - 1 + 1 + 4 )
            for(int column = 1; column <= row ; column++){
                System.out.print( (char)(ch) + " ");
                ch ++;
            }
            System.out.println();
        }
    }
}
