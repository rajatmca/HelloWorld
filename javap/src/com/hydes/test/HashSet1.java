package com.hydes.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) {
		List<Integer> lis= new ArrayList<Integer>();
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("rajat");
		ts1.add("ajat");
		ts1.add("aaple");
		ts1.add("raple");
		TreeSet ts2 = new TreeSet();
		//ts2.add(null);
		System.out.println(ts1);
		System.out.println("A".compareTo("z"));
		lis.add(10);
		lis.add(20);
		lis.add(11);
		lis.add(10);
		Set<Integer> set= new HashSet();
		set.add(10);
		set.add(55);
		set.addAll(lis);
		//set.add("oouo");
		//set.add(12.355);
		System.out.println(set);
		

	}

}
