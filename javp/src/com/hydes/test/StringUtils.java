package com.hydes.test;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

 public class StringUtils
{
	// Read a String from the standard input using Scanner
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String tokens[] = scanner.nextLine().split(" ");

		System.out.println(Arrays.asList(tokens));
		scanner.close();
	}
}