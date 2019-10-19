package com.hydes.test;

import java.util.Scanner;

public class ArrayExampleDay7 {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        System.out.println(arrItems.length);
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
		/* for(int i =n; i>=0; i--)
		 {
		 	System.out.println(arr[i]);
		 	
		 }*/

	        scanner.close();
	    }

}
