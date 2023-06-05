package com.map.primitive.bean;

import java.util.HashMap;
import java.util.Map;

public class Book {
	private int bookId;
	private String bookName;
	private Map<Integer, String> details = new HashMap<>();

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, Map<Integer, String> details) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.details = details;
	}

	public void show() {
		System.out.println("Book [bookId=" + bookId + ", bookName=" + bookName);
		for(Map.Entry<Integer, String> detail : details.entrySet()) {
			System.out.println(detail);
		}
	}
}
