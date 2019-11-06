package com.hydes.test;

public class FindMax {

	public static void main(String[] args) {
		int a[] = {10,12,3,4,15};
		int min = a[0], max =a[0];
		for (int i= 0; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("min is "+min+ "max is "+max);

	}

}
