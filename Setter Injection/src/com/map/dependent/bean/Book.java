package com.map.dependent.bean;

import java.util.HashMap;
import java.util.Map;

public class Book {
	private int bookId;
	private String bookName;
	private Map<Author, Writer> details = new HashMap<>();
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Map<Author, Writer> getDetails() {
		return details;
	}

	public void setDetails(Map<Author, Writer> details) {
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
