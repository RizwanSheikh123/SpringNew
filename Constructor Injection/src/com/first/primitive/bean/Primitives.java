package com.first.primitive.bean;

public class Primitives {
	private int id;
	private String name;
	public Primitives() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Primitives(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Primitives [id=" + id + ", name=" + name + "]";
	}
	
}
