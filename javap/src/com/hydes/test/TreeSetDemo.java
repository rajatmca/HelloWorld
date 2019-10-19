package com.hydes.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class MyComprator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		else return 0;
	}
	
	}

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> tset = new TreeSet<>(new MyComprator());
		tset.add(10);
		tset.add(0);
		tset.add(15);
		tset.add(5);
		tset.add(20);
		tset.add(20);
		System.out.println(tset);
		

	}

}
