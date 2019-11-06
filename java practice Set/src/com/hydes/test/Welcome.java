package com.hydes.test;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Welcome {
	// program to print hello world

	public static void main(String[] args) {
		System.out.println("welcome to java");
		System.out.println("rajat");
		System.out.println("hi how r u");
		System.out.println("rajat");
		Map< Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "rajat");
		map.put(9, "rajat");
		map.put(90, "rajat");
		map.put(2, "rajat");
		System.out.println(map);

	}

}
