package com.hydes.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapdemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new IdentityHashMap<>();
		map.put(1, "rajat");
		map.put(2, "ajat");
		map.put(3, "vvajat");
		map.put(17, "vjat5");
		map.put(19, "chaining");
		//map.put(null, "jjajat");
		//System.out.println(map.get(1));
		//System.out.println(map.put(1, "swajat"));
		System.out.println(map);
		//System.out.println(map.get(1));
		Set<Integer> s = map.keySet();
		System.out.println(s);
		Collection<String> c = map.values();
		System.out.println(c);
		Set<Entry<Integer, String>> s1 = map.entrySet();
		Iterator<Entry<Integer, String>> itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m1= itr.next();
			System.out.println(m1.getKey()+"..... "+m1.getValue());
			if(m1.getKey().equals(2))
			{
				m1.setValue("JAIMAS");
			}
		}
		System.out.println(map);
	

	}

}
