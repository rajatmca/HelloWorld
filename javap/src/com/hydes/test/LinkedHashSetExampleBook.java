package com.hydes.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Book{
	int bookId;
	String bookName;
	String publisherName;
	String isbn;
	public Book(int bookId, String bookName, String publisherName, String isbn) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisherName = publisherName;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", publisherName=" + publisherName + ", isbn="
				+ isbn + "]";
	}
	
}

public class LinkedHashSetExampleBook {

	public static void main(String[] args) {
		Book bb = new Book(1001, "c", "deniss ritchi", "ISB11223");
		Book bb1 = new Book(1001, "c", "deniss ritchi", "ISB11223");
		Book bb3 = new Book(1002, "java", "navathe", "ISB112234");
		Book bb4 = new Book(1002, "java", "navathe", "ISB112234");
		LinkedHashSet<Book> set = new LinkedHashSet<>();
		set.add(bb);
		set.add(bb1);
		set.add(bb3);
		set.add(bb4);
		for (Iterator<Book> iterator = set.iterator(); iterator.hasNext();) {
			Book book1 = iterator.next();
			System.out.println(book1);
			
		}
	

	}

}
