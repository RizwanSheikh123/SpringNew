package com.map.dependent.bean;

import java.util.HashMap;
import java.util.Map;

public class Book {
	private int bookId;
	private String bookName;
	private Map<Author, Writer> details = new HashMap<>();

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, Map<Author, Writer> details) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.details = details;
	}

	public void show() {
		for(Map.Entry<Author, Writer> detail : details.entrySet()) {
			System.out.println("details1:"+detail);
		}
	}
	
	public void display() {
		System.out.println("bookId=" + bookId + ", bookName=" + bookName);
		show();
	}
	
}
