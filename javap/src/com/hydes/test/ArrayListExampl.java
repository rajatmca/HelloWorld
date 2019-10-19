package com.hydes.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampl {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("raja");
		al.add("rajaa");
		al.add(1, "asas");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);

	}

}
