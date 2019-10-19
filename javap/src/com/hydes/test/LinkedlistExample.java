package com.hydes.test;

import java.util.LinkedList;
import java.util.List;
class Sook 
{
	int bookId;
	String color;
	Float price;
	public Sook(int bookId, String color, Float price) {
		this.bookId = bookId;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Sook [bookId=" + bookId + ", color=" + color + ", price=" + price + "]";
	}
	
	}

public class LinkedlistExample {

	public static void main(String[] args) {
		List<Sook> ll = new LinkedList<>();
		Sook bb = new Sook(1001, "red", 100.0f);
		Sook bb1 = new Sook(1002, "fed", 200.0f);
		Sook bb3 = new Sook(1001, "sed", 300.0f);
		ll.add(bb);
		ll.add(bb1);
		ll.add(0, bb3);
		System.out.println(ll.toString());

	}

}
