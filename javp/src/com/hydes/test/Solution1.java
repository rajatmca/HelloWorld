package com.hydes.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int i1=0;
        double d1= 0.0;
        String s1= null;


        /* Declare second integer, double, and String variables. */


        /* Read and save an integer, double, and String to your variables.*/
        i1= scan.nextInt();
        d1= scan.nextDouble();
        scan.nextLine();
        s1= scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s+s1);
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}