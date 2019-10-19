package com.hydes.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet< String> trr= new TreeSet<>();
		TreeSet< String> trr1= new TreeSet<>();
		trr.add("rajat");
		trr.add("ajib");
		trr.add("rajat");
		trr1.add("ajat");
		trr1.add("aib");
		trr1.add("sajat");
		Iterator<String> itr = trr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.equals(trr1));
			
			System.out.println(itr.next());
			
			
		}

	}

}
