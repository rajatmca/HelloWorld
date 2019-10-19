package com.hydes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateusingHaspmap {

	public static void main(String[] args) {
		int a[]= {1, 2, 5, 5, 6, 6, 7, 2};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
			if(map.get(a[i])==null)
			{
				map.put(a[i], 1);
			}
			else
			{
				map.put(a[i], map.get(a[i])+1);
			}
		}
		Set<Entry<Integer, Integer>> entryset= map.entrySet();
		for(Entry<Integer, Integer> entry : entryset)
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}

	}

}
