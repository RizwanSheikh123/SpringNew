package com.list.primitive.bean;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	private int id;
	private String name;
	private List<String> degree = new ArrayList<>();
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, List<String> degree) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", degree=" + degree + "]";
	}
}
