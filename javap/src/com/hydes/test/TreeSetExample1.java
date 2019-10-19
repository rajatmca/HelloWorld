package com.hydes.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		Set tset= new TreeSet();
		tset.add(new StringBuffer("A"));
		tset.add(new StringBuffer("Z"));
		tset.add(new StringBuffer("B"));
		System.out.println(tset);


	}

}
