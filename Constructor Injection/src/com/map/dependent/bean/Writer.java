package com.map.dependent.bean;

public class Writer {
	private int writerId;
	private String writerName;
	public Writer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Writer(int writerId, String writerName) {
		super();
		this.writerId = writerId;
		this.writerName = writerName;
	}
	@Override
	public String toString() {
		return "Writer [writerId=" + writerId + ", writerName=" + writerName + "]";
	}
}
