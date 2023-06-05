package com.first.dependent.bean;

public class Primitives {
	private int id;
	private String name;
	private Dependent dependent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dependent getDependent() {
		return dependent;
	}
	public void setDependent(Dependent dependent) {
		this.dependent = dependent;
	}
	@Override
	public String toString() {
		return "Primitives [id=" + id + ", name=" + name + ", dependent=" + dependent + "]";
	}
	
}
