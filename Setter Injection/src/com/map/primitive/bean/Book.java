package com.map.primitive.bean;

import java.util.HashMap;
import java.util.Map;

public class Book {
	private int bookId;
	private String bookName;
	private Map<Integer, String> details = new HashMap<>();
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
	public Map<Integer, String> getDetails() {
		return details;
	}
	public void setDetails(Map<Integer, String> details) {
		this.details = details;
	}
	
	public void show() {
		System.out.println("bookId=" + bookId + ", bookName=" + bookName + ", details=" + details);
		for (Map.Entry<Integer, String> detail: details.entrySet()) {
			System.out.println(detail);
		}
	}
}
