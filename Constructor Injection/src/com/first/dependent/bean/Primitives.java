package com.first.dependent.bean;

public class Primitives {
	private int id;
	private String name;
	private Dependent dependent;
	public Primitives() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Primitives(int id, String name, Dependent dependent) {
		super();
		this.id = id;
		this.name = name;
		this.dependent = dependent;
	}
	@Override
	public String toString() {
		return "Primitives [id=" + id + ", name=" + name + ", dependent=" + dependent + "]";
	}
	
}
