package com.hydes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		List<String> lif = new ArrayList<String>();
		lif.add("ab");
		lif.add("abc");
		lif.add("abcd");
		lif.add("ab");
		LinkedHashSet<String> str  = new LinkedHashSet<>();
		str.add("rajat");
		str.add("shaym");
		str.add("sabnam");
		str.add("rohan");
		str.addAll(lif);
		//System.out.println(str);
		for (Iterator<String> iterator = str.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
			
		}
		/*Iterator<String> itr = str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		

	}

}
