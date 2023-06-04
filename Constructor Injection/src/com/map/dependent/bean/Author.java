package com.map.dependent.bean;

public class Author {
	private int authorId;
	private String authorName;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]";
	}
	
}
