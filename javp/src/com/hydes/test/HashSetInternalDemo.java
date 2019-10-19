package com.hydes.test;

import java.util.HashSet;

public class HashSetInternalDemo {

	public static void main(String[] args) {
		HashSet<String> friend = new HashSet<String>();
		friend.add("rajat");
		friend.add("harsh");
		friend.add("asif");
		friend.add("sharma");
		System.out.println(friend);
		friend.add("amar");
		System.out.println(friend);
		friend.add("hbmar");
		System.out.println(friend);
		friend.add("hamar");
		System.out.println(friend);


	}

}
