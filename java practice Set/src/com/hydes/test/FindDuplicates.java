package com.hydes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add("rajat");
		list.add("ramesh");
		list.add("rajat");
		list.add("suresh");
		list.add("mahesh");
		list.add("rajat");
		list.add("sandesh");
		System.out.println("befor removing duplicates"+list);
		//Set<String> set = new LinkedHashSet<String>(list);
		//System.out.println("no duplicate"+set);
		Set<String> set = new LinkedHashSet<String>();
		//Iterator< String>  itr = set.iterator();
		/*
		 * for(String lis : list) { if(set.add(lis)==false) { System.out.println(lis); }
		 * }
		 */
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for(String lis : list)
		{Integer count =map.get(lis);
		System.out.println(count);
			
			if(count ==null)
			{
				map.put(lis, 1);
			}
			else
				map.put(lis, ++count);
		}
		System.out.println("map element is "+map);
		//List<String> listWithoutDuplicates= list.stream().distinct().collect(Collectors.toList());
		//System.out.println(listWithoutDuplicates);
		//Entry<String, Integer> entry = map.i
		//Iterator<String> itr = map.iterator();
		/*
		 * while(itr.hasNext()) { if(set.) }
		 */
		
		
		
		

	}

}
