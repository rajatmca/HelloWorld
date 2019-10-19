package com.hydes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicate {
	public static List<Integer> list= new ArrayList<Integer>();

	public static void main(String[] args) {
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		System.out.println(list);
		/*Set<Integer> listWD= new LinkedHashSet<>(list);
		list.clear();
		list.addAll(listWD);
		System.out.println(list);*/
		rev(list);
		//Collections.reverse(list);
		System.out.println(list);

	}
	public static void rev(List<Integer> list)
	{
		int size= list.size();
		//if(size<REVERSE_THRESHOLD )
	}

}
