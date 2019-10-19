package com.hydes.test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicatesInArray
{
	public static void main(String []args)
	{
		int count =0;
		int a[]= {1, 2, 5, 5, 6, 6, 7, 2};
		for(int i = 0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					//count++;
					System.out.print(a[j]+" ");}
			}
			//if(count>=1)
				//System.out.print(a[i]);
			
		}
		/*TreeSet<Integer> set = new TreeSet<>();
		for(int i= 0; i<a.length; i++)
		{
			if(!set.add(a[i]))
				System.out.println(a[i]);
			
		}
		System.out.println(set);*/
		
	}
}
