package com.hydes.test;

import java.util.Scanner;
public class Deffer
 {
	public static void main(String args[])
     {
         Scanner scn = new Scanner(System.in);
         System.out.println("Enter an integer");
         int a = scn.nextInt();
         scn.nextLine();
         System.out.println("Enter a String");
         String b = scn.next();
         String c = scn.next();
         int d = scn.nextInt();
         System.out.printf("You have entered:- " + a + " " + "and name as " + b + " and " + c + d);
     }
}

