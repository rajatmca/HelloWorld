package com.hydes.test;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		//String a =null;
		Scanner sc = new Scanner(System.in);
		//char []c= a.toCharArray();
		int t= sc.nextInt();
		while(t>0)
		{
			String a= sc.next();
		for(int i= 0; i<a.length(); i++)
		{
			
			if(i%2==0)
			{
				System.out.print(a.charAt(i));
			}
		}
		//System.out.println(c[0]);
		System.out.print(" ");
		for(int i= 0; i<a.length(); i++)
		{
			if(i%2!=0)
			{
				System.out.print(a.charAt(i));
			}
		}
		t--;
		System.out.println();
		}
		

	}

}
