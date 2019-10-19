package com.hydes.test;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitetorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(78);
		al.add(11);
		System.out.println("contain of array list");
		Spliterator<Integer> splitr = al.spliterator();
		while(splitr.tryAdvance((n) -> System.out.println(n))); 
		

	}

}
