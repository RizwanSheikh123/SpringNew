package com.map.dependent.bean;

public class Writer {
	private int writerId;
	private String writerName;
	
	public int getWriterId() {
		return writerId;
	}

	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	@Override
	public String toString() {
		return "Writer [writerId=" + writerId + ", writerName=" + writerName + "]";
	}
}
